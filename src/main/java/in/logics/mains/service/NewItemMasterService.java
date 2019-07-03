package in.logics.mains.service;

import java.util.List;

import in.logics.mains.model.NewItemMaster;

public interface NewItemMasterService {

	NewItemMaster addnewItem(NewItemMaster newItemMaster);

	List<NewItemMaster> getallItem();

	void deleteItemId(long ids);
	
}
