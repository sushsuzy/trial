package org.cap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.cap.model.Pilot;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("pilotDao")
//@Transactional
public class PilotDaoImpl implements PilotDao {
	@PersistenceContext
	private EntityManager entitymanager;
	@Transactional
	@Override
	public void save(Pilot pilot) {
		// TODO Auto-generated method stub
		entitymanager.persist(pilot);
	}
	@Transactional(readOnly=true)
	@Override
	public List<Pilot> getAll() {
		// TODO Auto-generated method stub
		List<Pilot> pilots = entitymanager.createQuery("from Pilot").getResultList();
		return pilots;
	}
	@Transactional
	@Override
	public void delete(int pilotId) {
		// TODO Auto-generated method stub
		Pilot pilot=entitymanager.find(Pilot.class, pilotId);
		entitymanager.remove(pilot);
	}
	@Transactional
	@Override
	public void update(Pilot pilot) {
		// TODO Auto-generated method stub
		Pilot pilot1=entitymanager.find(Pilot.class, pilot.getPilotId());
		if(pilot1==null) {
			System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiii");
			entitymanager.persist(pilot);
		}
		else
			entitymanager.merge(pilot);
	}
	@Transactional
	@Override
	public Pilot findPilot(int pilotId) {
		// TODO Auto-generated method stub
		Pilot pilot= entitymanager.find(Pilot.class, pilotId);
		return pilot;
	}
	

	

}
