package in.logics.mains.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.logics.mains.config.Encyp;
import in.logics.mains.dao.RegistryDao;
import in.logics.mains.model.ApiToken;
import in.logics.mains.model.LoginClient;
import in.logics.mains.model.Register;
import in.logics.mains.model.ValidLogins;
import in.logics.mains.service.LoginService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	RegistryDao registryDao;

	@Override
	public ValidLogins logins(LoginClient client) {
		// TODO Auto-generated method stub
		System.out.println(client);
		ValidLogins vl = new ValidLogins();
		Register r = registryDao.LoginVerify(client.getUsername(), client.getPassword());
		r.setPassword("xxx");
		vl.setRegister(r);
		Register rj = vl.getRegister();
		if(vl.getRegister() != null) {
			if(rj.getStatus().equals("A")) {
				System.out.println(vl.getRegister().toString());
				vl.setStatus(true);
				vl.setMsg("Success");
				Encyp.urls = client.getUsername();
				Encyp ep = new Encyp();
				vl.setS(new ResponseEntity<>(new ApiToken(Jwts.builder().setSubject(client.getUsername())
						.claim("msg", vl.getRegister()).setIssuedAt(new Date())
						.signWith(SignatureAlgorithm.HS256, ep.sk()).compact()), HttpStatus.OK));
			}else {
				System.out.println("status is block");
				vl.setRegister(null);
				vl.setStatus(false);
				vl.setMsg("User Has been Blocked");
			}
		} 
		return vl;
	}
	
}
