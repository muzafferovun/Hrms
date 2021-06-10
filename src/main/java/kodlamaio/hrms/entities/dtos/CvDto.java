package kodlamaio.hrms.entities.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concretes.PersonCv;
import kodlamaio.hrms.entities.concretes.PersonCvEducation;
import kodlamaio.hrms.entities.concretes.PersonCvExperiences;
import kodlamaio.hrms.entities.concretes.PersonCvProfession;

public class CvDto {
	private PersonCv personCv;
	private List<PersonCvEducationGetDto> educations;
	private List<PersonCvExperiencesGetDto> experiences;
	private List<PersonCvProfessionGetDto> professions ;
	private List<PersonLinkGetDto> personLinks ;
	public CvDto() {
		super();
	}
	public CvDto(PersonCv personCv, List<PersonCvEducationGetDto> educations,
			List<PersonCvExperiencesGetDto> experiences, List<PersonCvProfessionGetDto> professions,
			List<PersonLinkGetDto> personLinks) {
		super();
		this.personCv = personCv;
		this.educations = educations;
		this.experiences = experiences;
		this.professions = professions;
		this.personLinks = personLinks;
	}
	public PersonCv getPersonCv() {
		return personCv;
	}
	public void setPersonCv(PersonCv personCv) {
		this.personCv = personCv;
	}
	public List<PersonCvEducationGetDto> getEducations() {
		return educations;
	}
	public void setEducations(List<PersonCvEducationGetDto> educations) {
		this.educations = educations;
	}
	public List<PersonCvExperiencesGetDto> getExperiences() {
		return experiences;
	}
	public void setExperiences(List<PersonCvExperiencesGetDto> experiences) {
		this.experiences = experiences;
	}
	public List<PersonCvProfessionGetDto> getProfessions() {
		return professions;
	}
	public void setProfessions(List<PersonCvProfessionGetDto> professions) {
		this.professions = professions;
	}
	public List<PersonLinkGetDto> getPersonLinks() {
		return personLinks;
	}
	public void setPersonLinks(List<PersonLinkGetDto> personLinks) {
		this.personLinks = personLinks;
	}
	
}
