package project.faculty.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import project.faculty.dao.FacultyRepository;
import project.faculty.domain.Entrant;
import project.faculty.security.EntrantDTOHelper;
import project.faculty.service.EntrantService;

@Controller
public class EntrantController {
	
	@Autowired
	EntrantService entrantService;
	
	@Autowired
	FacultyRepository facultyRepository;
	
	@RequestMapping(value = "/addEntrant", method = RequestMethod.POST)
	public ModelAndView createEntrant(
			@RequestParam MultipartFile image, 
			@RequestParam String firstName, 
			@RequestParam String lastName,
			@RequestParam Integer faculty
			) throws IOException {		

		System.out.println(faculty);
		entrantService.save(EntrantDTOHelper.createEntity(image, firstName, lastName, facultyRepository.getById(faculty), null));
		return new ModelAndView("redirect:/home");
	}

}