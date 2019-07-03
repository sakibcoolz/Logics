package in.logics.mains.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.AddInvoiceDao;
import in.logics.mains.dao.BookingDao;
import in.logics.mains.dao.ConsigneeMasterDao;
import in.logics.mains.dao.RegistryDao;
import in.logics.mains.dao.ShipperMasterDao;
import in.logics.mains.model.Dashboard;
import in.logics.mains.model.Register;
import in.logics.mains.sequences.SequenceDao;
import in.logics.mains.service.RegistryService;



@Service
public class RegistryServiceImpl implements RegistryService{

	@Autowired
	RegistryDao registyDao;
	
	@Autowired
    private SequenceDao sequenceDao;
	
	@Autowired
	private ShipperMasterDao shipperDao;
	
	@Autowired
	private BookingDao bookingdao;
	
	@Autowired
	private ConsigneeMasterDao consigneedao;
	
	@Autowired
	private AddInvoiceDao addinvoicedao;
	
	private static final String HOSTING_SEQ_KEY = "hosting";
	
	
	@Override
	public Register addRegister(Register register) {
		// TODO Auto-generated method stub
		try {
			register.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return registyDao.addRegister(register);
	}


	@Override
	public List<Register> getusers() {
		return registyDao.getusers();
	}


	@Override
	public Optional<Register> getOneUser(long ids) {
		// TODO Auto-generated method stub
		return registyDao.getOneUser(ids);
	}


	@Override
	public void deleteOneUser(long ids) {
		// TODO Auto-generated method stub
		registyDao.deleteOneUser(ids);
	}


	@Override
	public Register updateUser(Register shm) {
		return registyDao.updateUser(shm);
	}


	@Override
	public Dashboard dashboard() {
		// TODO Auto-generated method stub
		Dashboard d = new Dashboard();
		d.setTotalShipper(shipperDao.getCountShipper());
		d.setTotalBills(bookingdao.getbookingCount());
		d.setTotalConsignee(consigneedao.getConsigneeCount());
		d.setTotalInvoice(addinvoicedao.getInvoiceCount());
		return d;
	}


}
