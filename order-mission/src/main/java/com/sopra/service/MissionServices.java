package com.sopra.service;

import java.util.List;

import com.sopra.entity.Mission;

public interface MissionServices {
	
	
	
	
	 /**
	 * @param missions
	 */
	void saveMissionItinerary(Mission missions);
	 
	 
	 Mission getNombreById(int id);
}
