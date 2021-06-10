package kodlamaio.hrms.entities.dtos;

public class PersonCvExperiencesAddDto {
	private int personCv;
	private int personExperience;
	public PersonCvExperiencesAddDto() {
		super();
	}
	public PersonCvExperiencesAddDto(int personCv, int personExperience) {
		super();
		this.personCv = personCv;
		this.personExperience = personExperience;
	}
	public int getPersonCv() {
		return personCv;
	}
	public void setPersonCv(int personCv) {
		this.personCv = personCv;
	}
	public int getPersonExperience() {
		return personExperience;
	}
	public void setPersonExperience(int personExperience) {
		this.personExperience = personExperience;
	}

}
