package in.logics.mains.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.logics.mains.model.Invoice_master;



public interface AddInvoiceRepo extends MongoRepository<Invoice_master, Long> {

	Invoice_master findByBlno(String ids);

}
