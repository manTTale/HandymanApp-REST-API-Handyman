package com.proiect.mrc.service;

import java.util.List;

import com.proiect.mrc.entity.Handyman;

public interface HandymanService {

	public List<Handyman> getHandymen();
	
	public Handyman getHandyman(int theId);

	public void saveHandyman(Handyman theHandyman);

	public void deleteHandyman(int theId);

	

	

	

}
