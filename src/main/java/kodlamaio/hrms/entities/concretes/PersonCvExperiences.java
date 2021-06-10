package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="person_cv_experiences")
public class PersonCvExperiences {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
    @ManyToOne()
    @JoinColumn(name="person_cv_id")
	private PersonCv personCv;	
    @ManyToOne()
    @JoinColumn(name="experiences_id")
	private PersonExperiences personExperiences;
	public PersonCvExperiences() {
		super();
	}
	public PersonCvExperiences(int id, PersonCv personCv, PersonExperiences personExperiences) {
		super();
		this.id = id;
		this.personCv = personCv;
		this.personExperiences = personExperiences;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PersonCv getPersonCv() {
		return personCv;
	}
	public void setPersonCv(PersonCv personCv) {
		this.personCv = personCv;
	}
	public PersonExperiences getPersonExperiences() {
		return personExperiences;
	}
	public void setPersonExperiences(PersonExperiences personExperiences) {
		this.personExperiences = personExperiences;
	}	
    

}
