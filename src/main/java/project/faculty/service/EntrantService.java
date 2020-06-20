package project.faculty.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.faculty.dao.EntrantRepository;
import project.faculty.domain.Entrant;

@Service
public class EntrantService {
	
	private Logger logger = LoggerFactory.getLogger(EntrantService.class);
	
	@Autowired
	private EntrantRepository entrantRepository;
	
	public Entrant save(Entrant entrant) {
		logger.info("Get Save Entrant" + entrant);
		return entrantRepository.save(entrant);
	}
	
	public List<Entrant> getAllEntants(){
		logger.info("Get findAll Entrant");
		return entrantRepository.findAll();
	}

}
