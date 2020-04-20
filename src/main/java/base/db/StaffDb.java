/**
 *
 */
package base.db;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import base.model.Staff;

@Mapper
public interface StaffDb {

	/**
	 * DB取得.
	 *
	 * @param kaishaCd
	 * @return TWm01
	 */
	@Insert("INSERT INTO Staff (Name, UserID, PW, Role) VALUES (#{name}, #{userId}, #{password}, #{role})")
	public void insert(@Param("name") String name, @Param("userId") String userId, @Param("password") String password, @Param("role") String role);


	/**
	 * DB取得.
	 */
	@Select({
		"<script>",
			"SELECT * FROM Staff",
			"<where>",
				"<if test=\"userId != null\">AND UserID=#{userId}</if>",
				"<if test=\"password != null\">AND PW=#{password}</if>",
			"</where>",
		"</script>"
	})
	public Staff select(@Param("userId") String userId, @Param("password") String password);

}