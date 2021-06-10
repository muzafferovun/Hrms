package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="links")
public class Links {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="link_name")
	private String linkName;
	@Column(name="link_avatar")
	private String linkAvatar;
	public Links() {
		super();
	}
	public Links(int id, String linkName, String linkAvatar) {
		super();
		this.id = id;
		this.linkName = linkName;
		this.linkAvatar = linkAvatar;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLinkName() {
		return linkName;
	}
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	public String getLinkAvatar() {
		return linkAvatar;
	}
	public void setLinkAvatar(String linkAvatar) {
		this.linkAvatar = linkAvatar;
	}

}
