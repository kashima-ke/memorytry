/**
 *
 */
package base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import base.db.AccountDb;
import base.model.Account;

@Transactional
@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountDb accountRepository;

	/**
	 * ユーザーよりアカウントの取得
	 *
	 * @param username
	 * @return Account
	 */
	@Override
	public Account findOne(String username) {
		Account account = accountRepository.findOneByUsername(username);
		if (account == null) {
			throw new UsernameNotFoundException("UserName Error");
		}
		return account;
	}
}
