/**
 *
 */
package base.db;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OnseiRecordDb {

	/**
	 * DB登録.
	 */
	@Insert("INSERT INTO ONSEIRecord (ID, FinishFlg, Content) VALUES (#{userId}, #{finishFlg}, #{content})")
	public void insert(@Param("userId") String userId, @Param("finishFlg") String finshFlg, @Param("content") String content);
}