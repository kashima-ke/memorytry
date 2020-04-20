/**
 *
 */
package base.db;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import base.model.Account;

@Mapper
public interface AccountDb {

	/**
	 * DB取得.
	 *
	 * @param username
	 * @return Account
	 */
	@Select("SELECT username, password FROM account WHERE username = #{username}")
	public Account findOneByUsername(@Param("username") String username);

}
