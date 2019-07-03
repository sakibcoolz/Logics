package in.logics.mains.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.AddInvoiceDao;
import in.logics.mains.model.Invoice_master;
import in.logics.mains.repository.AddInvoiceRepo;

@Service
public class AddInvoiceDaoImpl implements AddInvoiceDao  {
	
	@Autowired
	AddInvoiceRepo addInvoiceRepo;

	@Override
	public Invoice_master AddInvoice(Invoice_master invoice_master) {
		// TODO Auto-generated method stub
		return addInvoiceRepo.save(invoice_master);
	}

	@Override
	public Invoice_master editInvoice(String ids) {
		// TODO Auto-generated method stub
		return addInvoiceRepo.findByBlno(ids);
	}

	@Override
	public Invoice_master editedInvoice(Invoice_master invoice_master) {
		// TODO Auto-generated method stub
		return addInvoiceRepo.save(invoice_master);
	}

	@Override
	public long getInvoiceCount() {
		// TODO Auto-generated method stub
		return addInvoiceRepo.count();
	}
	
}
