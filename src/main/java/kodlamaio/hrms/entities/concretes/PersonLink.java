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
@Table(name="person_links")
public class PersonLink {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="link_info")
	private String linkInfo;
	@Column(name="link_value")
	private String linkValue;
	   @ManyToOne()
	    @JoinColumn(name="person_id")
		private Person person;
	   @ManyToOne()
	    @JoinColumn(name="link_id")
		private Links links; 
	public PersonLink() {
		super();
	}
	public PersonLink(int id, String linkInfo, String linkValue, Person person, Links links) {
		super();
		this.id = id;
		this.linkInfo = linkInfo;
		this.linkValue = linkValue;
		this.person = person;
		this.links = links;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLinkInfo() {
		return linkInfo;
	}
	public void setLinkInfo(String linkInfo) {
		this.linkInfo = linkInfo;
	}
	public String getLinkValue() {
		return linkValue;
	}
	public void setLinkValue(String linkValue) {
		this.linkValue = linkValue;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Links getLinks() {
		return links;
	}
	public void setLinks(Links links) {
		this.links = links;
	}
	
	
}
