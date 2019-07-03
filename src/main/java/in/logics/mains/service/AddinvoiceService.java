package in.logics.mains.service;

import in.logics.mains.model.Invoice_master;

public interface AddinvoiceService {

	Invoice_master AddInvoice(Invoice_master invoice_master);

	Invoice_master editInvoice(String blno);

	Invoice_master editedInvoice(Invoice_master invoice_master);
	
}
