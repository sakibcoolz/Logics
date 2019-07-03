package in.logics.mains.dao;

import in.logics.mains.model.Invoice_master;

public interface AddInvoiceDao {

	Invoice_master AddInvoice(Invoice_master invoice_master);

	Invoice_master editInvoice(String ids);

	Invoice_master editedInvoice(Invoice_master invoice_master);

	long getInvoiceCount();

}
