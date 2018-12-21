package org.cap.dao;

import java.util.List;

import org.cap.model.Pilot;


public interface PilotDao {
	public void save(Pilot pilot);
	public List<Pilot> getAll();
	public void delete(int pilotId);
	public void update(Pilot pilot);
	public Pilot findPilot(int pilotId);

	
}
