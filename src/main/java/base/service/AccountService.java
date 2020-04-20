/**
 *
 */
package base.service;

import base.model.Account;

public interface AccountService {
	/**
	 * Find one account information with username.
	 *
	 * @param username
	 * @return Account
	 */
	Account findOne(String username);
}
