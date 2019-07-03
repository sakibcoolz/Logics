package in.logics.mains.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.AddInvoiceDao;
import in.logics.mains.model.Invoice_master;
import in.logics.mains.sequences.SequenceDao;
import in.logics.mains.service.AddinvoiceService;

@Service
public class AddInvoiceServiceImpl implements AddinvoiceService {
	
	@Autowired
	AddInvoiceDao addInvoiceDao;
	
	@Autowired
    private SequenceDao sequenceDao;
	
	private static final String HOSTING_SEQ_KEY = "hosting";

	@Override
	public Invoice_master AddInvoice(Invoice_master invoice_master) {
		try {
			invoice_master.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return addInvoiceDao.AddInvoice(invoice_master);
	}

	@Override
	public Invoice_master editInvoice(String ids) {
		return addInvoiceDao.editInvoice(ids);
	}

	@Override
	public Invoice_master editedInvoice(Invoice_master invoice_master) {
		// TODO Auto-generated method stub
		return addInvoiceDao.editedInvoice( invoice_master);
	}

}
