package com.sunmartech.smtleadsender.ui.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunmartech.smtleadsender.ui.repository.ClientSmtleadsenderRepo;
import com.sunmartech.smtleadsender.ui.schema.ClientSmtleadsender;

/**
 * This class is used for select/insert/update records from database.
 *
 */
@Repository
public class SmtleadsenderUiDaoImpl implements SmtleadsenderUiDao{
	
	@Autowired
	ClientSmtleadsenderRepo clientCRMRepo;

	@Override
	public long saveIntegrationDetails(ClientSmtleadsender clientSmtleadsender) {
		clientCRMRepo.save(clientSmtleadsender);
		return 0;
	}

}
