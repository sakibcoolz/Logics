package in.logics.mains.dao;

import java.util.List;

import in.logics.mains.model.NewItemMaster;

public interface NewItemDao {

	NewItemMaster addNewItem(NewItemMaster newItemMaster);

	List<NewItemMaster> getallItem();

	void deleteItemId(long ids);

}
