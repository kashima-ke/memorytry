/**
 *
 */
package base.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import base.model.CustomerInfo;

@Mapper
public interface CustomerInfoDb {

	/**
	 * DB取得.
	 *
	 */
	@Select({
		"<script>",
			"SELECT * FROM CustomerInfo ",
			"<where>",
				"<if test=\"userId != null and userId != ''\">AND ID=#{userId}</if>",
				"<if test=\"name != null and name != ''\">AND CharName like '%${name}%'</if>",
				"<if test=\"kana != null and kana != ''\">AND KanaName like '%${kana}%'</if>",
				"<if test=\"hokenId != null and hokenId != ''\">AND InsuranceID=#{hokenId}</if>",
				"<if test=\"phone != null and phone != ''\">AND PhoneNum=#{phone}</if>",
				"<if test=\"birthday != null and birthday != ''\">AND Birth=#{birthday}</if>",
				"<if test=\"onseiWait != null and onseiWait != ''\">AND ONSEIWait='1'</if>",
				"<if test=\"lock != null and lock != ''\">AND ApplicationLock='1'</if>",
				"<if test=\"onseiRelease != null and onseiRelease != ''\">AND ONSEIReleas='1'</if>",
			"</where>",
		"</script>"
	})
	public List<CustomerInfo> select(@Param("name") String name, @Param("userId") String userId,
			@Param("kana") String kana, @Param("hokenId") String hokenId, @Param("phone") String phone, @Param("birthday") String birthday,
			@Param("onseiWait") String onseiWait, @Param("lock") String lock, @Param("onseiRelease") String onseiRelease);

	/**
	 * DB取得.
	 */
	@Select({
		"<script>",
			"SELECT cus.*, ins.DepartmentCompany AS insCompany, ins.CharName AS insCharName, ins.PhoneNum AS insPhoneNum, ins.MailAddress AS insMail FROM CustomerInfo cus",
			"INNER JOIN insuranceclaimantinfo ins on ins.ID = cus.InsuranceID ",
			"<where>",
				"<if test=\"id != null and id != ''\">AND cus.ID=#{id}</if>",
			"</where>",
		"</script>"
	})
	public CustomerInfo selectOne(@Param("id") String id);

	/**
	 * DB更新.
	 */
	@Update({
		"<script>",
			"UPDATE CustomerInfo ",
			"SET ",
			"ONSEIWait = #{onseiWait}, ",
			"ApplicationLock = #{lock}, ",
			"ONSEIReleas = #{onseiRelease} ",
			"<where>",
				"<if test=\"userId != null and userId != ''\">AND ID=#{userId}</if>",
			"</where>",
		"</script>"
	})
	public void update(@Param("userId") String userId, @Param("onseiWait") String onseiWait, @Param("lock") String lock, @Param("onseiRelease") String onseiRelease);
}