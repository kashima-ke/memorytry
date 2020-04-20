/**
 *
 */
package base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import base.db.StaffDb;
import base.model.Staff;

@Transactional
@Service
public class StaffServiceImpl implements StaffService {
	@Autowired
	StaffDb db;

	/**
	 */
	@Override
	public void insert(String name, String userId, String password, String role) {
		db.insert(name, userId, password, role);
	}

	/**
	 *
	 */
	@Override
	public Staff select(String userId, String password) {
		Staff data = db.select(userId, password);
		return data;
	}
}
