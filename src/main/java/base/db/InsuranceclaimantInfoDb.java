/**
 *
 */
package base.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import base.model.CustomerInfo;

@Mapper
public interface InsuranceclaimantInfoDb {

	/**
	 * DB取得.
	 */
	@Select({
		"<script>",
			"SELECT cus.* FROM insuranceclaimantinfo ins ",
			"INNER JOIN customerinfo cus on ins.ID = cus.InsuranceID",
			"<where>",
				"<if test=\"hokenId != null and hokenId != ''\">AND ins.ID=#{hokenId}</if>",
				"<if test=\"company != null and company != ''\">AND ins.DepartmentCompany like '%${company}%'</if>",
				"<if test=\"name != null and name != ''\">AND ins.CharName like '%${name}%'</if>",
				"<if test=\"phone != null and phone != ''\">AND ins.PhoneNum=#{phone}</if>",
				"<if test=\"mailAddress != null and mailAddress != ''\">AND ins.MailAddress=#{mailAddress}</if>",
			"</where>",
		"</script>"
	})
	public List<CustomerInfo> select(@Param("name") String name, @Param("hokenId") String hokenId, @Param("company") String company,
			@Param("phone") String phone, @Param("mailAddress") String mailAddress);
}