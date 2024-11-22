package com.sunmartech.smtleadsender.ui.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunmartech.smtleadsender.ui.dao.SmtleadsenderUiDao;
import com.sunmartech.smtleadsender.ui.schema.ClientSmtleadsender;

/**
 * This service class is used for process data.
 *
 */
@Service
public class SmtleadsenderUiServiceImpl implements SmtleadsenderUiService{

	static final Logger logger = LogManager.getLogger(SmtleadsenderUiServiceImpl.class);
	
	@Autowired
	SmtleadsenderUiDao smtleadsenderUiDao;
	
	public long saveIntegrationDetails(ClientSmtleadsender clientSmtleadsender) {
		return smtleadsenderUiDao.saveIntegrationDetails(clientSmtleadsender);
	}
	
}
