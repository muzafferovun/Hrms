package kodlamaio.hrms.entities.dtos;

public class PersonCvEducationAddDto {
	private int personId;
	private int personCv;
	private int personEducation;
	public PersonCvEducationAddDto() {
		super();
	}
	public PersonCvEducationAddDto(int personId, int personCv, int personEducation) {
		super();
		this.personId = personId;
		this.personCv = personCv;
		this.personEducation = personEducation;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public int getPersonCv() {
		return personCv;
	}
	public void setPersonCv(int personCv) {
		this.personCv = personCv;
	}
	public int getPersonEducation() {
		return personEducation;
	}
	public void setPersonEducation(int personEducation) {
		this.personEducation = personEducation;
	}

}
