package com.proiect.mrc.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.proiect.mrc.entity.Handyman;

@Repository
public class HandymanDAOImpl implements HandymanDAO {

	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public List<Handyman> getHandymen() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Handyman> theQuery = currentSession.createQuery("from handyman", Handyman.class);
		List<Handyman> handymen = theQuery.getResultList();
		return handymen;
	}

	@Override
	public Handyman getHandyman(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Handyman theHandyman = currentSession.get(Handyman.class, theId);
		return theHandyman;
	}

	@Override
	public void saveHandyman(Handyman theHandyman) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(theHandyman);		
	}

	@Override
	public void deleteHandyman(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Handyman> theQuery = currentSession.createQuery("delete from handyman where id=:handymanId");
		theQuery.setParameter("handymanId", theId);
		theQuery.executeUpdate();
		
	}

}
