package in.logics.mains.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.NewItemDao;
import in.logics.mains.model.NewItemMaster;
import in.logics.mains.repository.NewItemRepo;

@Service
public class NewItemDaoImpl implements NewItemDao {
	
	@Autowired
	NewItemRepo newItemRepo;

	@Override
	public NewItemMaster addNewItem(NewItemMaster newItemMaster) {
		// TODO Auto-generated method stub
		return newItemRepo.save(newItemMaster);
	}

	@Override
	public List<NewItemMaster> getallItem() {
		// TODO Auto-generated method stub
		return newItemRepo.findAll();
	}

	@Override
	public void deleteItemId(long ids) {
		newItemRepo.deleteNewItemMasterById(ids);
	}

	@Override
	public Optional<NewItemMaster> getnewItembyid(long ids) {
		// TODO Auto-generated method stub
		return newItemRepo.findById(ids);
	}

	@Override
	public NewItemMaster editItem(NewItemMaster newItemMaster) {
		// TODO Auto-generated method stub
		return newItemRepo.save(newItemMaster);
	}

}
