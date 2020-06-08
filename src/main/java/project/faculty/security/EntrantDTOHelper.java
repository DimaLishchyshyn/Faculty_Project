package project.faculty.security;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import project.faculty.domain.Entrant;
import project.faculty.domain.Faculty;
import project.faculty.domain.Subjects;

public class EntrantDTOHelper {

	public static Entrant createEntity(MultipartFile file, String firstName, String lastName, 
		Faculty faculty, List<Subjects> subjects) throws IOException {
		Entrant entrant = new Entrant();
		entrant.setFirstName(firstName);
		entrant.setLastName(lastName);
		entrant.setFaculty(faculty);
		entrant.setSubjects(subjects);
		entrant.setEncodedImage(Base64.getEncoder().encodeToString(file.getBytes()));

		return entrant;
	}
	
}
