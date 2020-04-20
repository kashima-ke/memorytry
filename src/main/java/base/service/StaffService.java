/**
 *
 */
package base.service;

import base.model.Staff;

public interface StaffService {
	/**
	 *
	 */
	void insert(String name, String userId, String password, String role);

	/**
	 *
	 */
	Staff select(String userId, String password);
}
