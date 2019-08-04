package in.logics.mains.dao;

import java.util.List;
import java.util.Optional;

import in.logics.mains.model.NewItemMaster;

public interface NewItemDao {

	NewItemMaster addNewItem(NewItemMaster newItemMaster);

	List<NewItemMaster> getallItem();

	void deleteItemId(long ids);

	Optional<NewItemMaster> getnewItembyid(long ids);

	NewItemMaster editItem(NewItemMaster newItemMaster);

}
