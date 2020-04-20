/**
 *
 */
package base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import base.db.OnseiRecordDb;

@Transactional
@Service
public class OnseiRecordServiceImpl implements OnseiRecordService {
	@Autowired
	OnseiRecordDb db;

	/**
	 */
	@Override
	public void insert(String userId, String finishFlg, String content) {
		db.insert(userId, finishFlg, content);
	}
}
