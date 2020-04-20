/**
 *
 */
package base.service;

import java.util.List;

import base.model.CustomerInfo;

public interface CustomerInfoService {
	/**
	 */
	List<CustomerInfo> select(String name, String userId, String kana, String hokenId, String phone, String birthday,
			String onseiWait, String lock, String onseiRelease);

	CustomerInfo selectOne(String id);

	void update(String userId, String onseiWait, String lock, String onseiRelease);
}
