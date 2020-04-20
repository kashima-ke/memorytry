/**
 *
 */
package base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import base.db.CustomerInfoDb;
import base.model.CustomerInfo;

@Transactional
@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {
	@Autowired
	CustomerInfoDb db;

	/**
	 *
	 */
	@Override
	public List<CustomerInfo> select(String name, String userId, String kana, String hokenId, String phone, String birthday,
			String onseiWait, String lock, String onseiRelease) {
		List<CustomerInfo> data = db.select(name, userId, kana, hokenId, phone, birthday, onseiWait, lock, onseiRelease);
		return data;
	}

	/**
	 *
	 */
	@Override
	public CustomerInfo selectOne(String id) {
		CustomerInfo data = db.selectOne(id);
		return data;
	}

	/**
	 *
	 */
	@Override
	public void update(String userId, String onseiWait, String lock, String onseiRelease) {
		db.update(userId, onseiWait, lock, onseiRelease);
	}
}