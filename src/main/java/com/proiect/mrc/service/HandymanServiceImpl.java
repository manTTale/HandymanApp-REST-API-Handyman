package com.proiect.mrc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proiect.mrc.dao.HandymanDAO;
import com.proiect.mrc.entity.Handyman;

@Service
@Transactional
public class HandymanServiceImpl implements HandymanService{

	@Autowired
	private HandymanDAO handymanDAO;
	
	@Override
	public List<Handyman> getHandymen() {
		return handymanDAO.getHandymen();
	}

	@Override
	public Handyman getHandyman(int theId) {
		return handymanDAO.getHandyman(theId);
	}

	@Override
	public void saveHandyman(Handyman theHandyman) {
		handymanDAO.saveHandyman(theHandyman);
		
	}

	@Override
	public void deleteHandyman(int theId) {
		handymanDAO.deleteHandyman(theId);
		
	}

}
