/**
 *
 */
package base.service;

import java.util.List;

import base.model.CustomerInfo;

public interface InsuranceInfoService {
	/**
	 *
	 */
	List<CustomerInfo> select(String name, String hokenId, String company, String phone, String mailAddress);
}
