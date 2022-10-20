package com.proiect.mrc.dao;

import java.util.List;

import com.proiect.mrc.entity.Handyman;

public interface HandymanDAO {

	public List<Handyman> getHandymen();

	public Handyman getHandyman(int theId);

	public void saveHandyman(Handyman theHandyman);

	public void deleteHandyman(int theId);

}
