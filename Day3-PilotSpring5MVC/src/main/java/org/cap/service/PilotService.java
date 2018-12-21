package org.cap.service;

import java.util.List;

import org.cap.model.Pilot;

public interface PilotService {
	public void save(Pilot pilot);
	public List<Pilot> getAll();
	public void delete(int pilotId);
	public void update(Pilot pilot);
	public Pilot findPilot(int pilotId);
}
