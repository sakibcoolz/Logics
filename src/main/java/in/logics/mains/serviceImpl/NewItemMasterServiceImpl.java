package in.logics.mains.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.logics.mains.dao.NewItemDao;
import in.logics.mains.model.NewItemMaster;
import in.logics.mains.sequences.SequenceDao;
import in.logics.mains.service.NewItemMasterService;

@Service
public class NewItemMasterServiceImpl implements NewItemMasterService {
	
	@Autowired
	NewItemDao newItemDao;
	
	@Autowired
    private SequenceDao sequenceDao;
	
	private static final String HOSTING_SEQ_KEY = "hosting";

	@Override
	public NewItemMaster addnewItem(NewItemMaster newItemMaster) {
		// TODO Auto-generated method stub
		try {
			newItemMaster.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return newItemDao.addNewItem(newItemMaster);
	}

	@Override
	public List<NewItemMaster> getallItem() {
		return newItemDao.getallItem();
	}

	@Override
	public void deleteItemId(long ids) {
		newItemDao.deleteItemId( ids);
	}


}
