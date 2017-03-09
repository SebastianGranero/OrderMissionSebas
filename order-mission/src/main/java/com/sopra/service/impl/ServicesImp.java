package com.sopra.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sopra.entity.Itinerary;
import com.sopra.entity.Mission;
import com.sopra.repository.MissionRepository;
import com.sopra.service.MissionServices;



@Service(value = "services")
public class ServicesImp implements MissionServices {
	
	@Resource
	private MissionRepository  missionRepository;

	@Override
	public void saveMissionItinerary(Mission mission) {
		for(Itinerary it : mission.getItineraries()) {
			if(it != null){
			   it.setMission(mission);
			}
	   	}
		   missionRepository.save(mission);
	   }
	@Override
	public Mission getNombreById(int id){
		Mission m = missionRepository.findOne(id);
		return m;
	}
		
	

}
