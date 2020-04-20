/**
 *
 */
package base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import base.db.InsuranceclaimantInfoDb;
import base.model.CustomerInfo;

@Transactional
@Service
public class InsuranceInfoServiceImpl implements InsuranceInfoService {
	@Autowired
	InsuranceclaimantInfoDb db;

	/**
	 */
	@Override
	public List<CustomerInfo> select(String name, String hokenId, String company, String phone, String mailAddress) {
		List<CustomerInfo> data = db.select(name, hokenId, company, phone, mailAddress);
		return data;
	}
}
