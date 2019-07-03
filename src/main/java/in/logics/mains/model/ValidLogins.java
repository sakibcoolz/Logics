package in.logics.mains.model;

import org.springframework.http.ResponseEntity;

public class ValidLogins {

	private Register register;
	
	private ResponseEntity<ApiToken> s;
	
	private Boolean status;
	
	private String msg;

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public ResponseEntity<ApiToken> getS() {
		return s;
	}

	public void setS(ResponseEntity<ApiToken> s) {
		this.s = s;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ValidLogins [register=" + register + ", s=" + s + ", status=" + status + ", msg=" + msg + "]";
	}

	public ValidLogins(Register register, ResponseEntity<ApiToken> s, Boolean status, String msg) {
		super();
		this.register = register;
		this.s = s;
		this.status = status;
		this.msg = msg;
	}

	public ValidLogins() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
