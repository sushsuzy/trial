package org.cap.service;

import java.util.List;

import org.cap.dao.PilotDao;
import org.cap.model.Pilot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pilotService")
public class PilotServiceImpl implements PilotService {
	@Autowired
	private PilotDao pilotDao;

	@Override
	public void save(Pilot pilot) {
		pilotDao.save(pilot);
	}

	@Override
	public List<Pilot> getAll() {
		// TODO Auto-generated method stub
		return pilotDao.getAll();
	}

	@Override
	public void delete(int pilotId) {
		// TODO Auto-generated method stub
		pilotDao.delete(pilotId);
	}


	@Override
	public void update(Pilot pilot) {
		// TODO Auto-generated method stub
		pilotDao.update(pilot);
	}

	@Override
	public Pilot findPilot(int pilotId) {
		// TODO Auto-generated method stub
		return pilotDao.findPilot(pilotId);
	}

}
