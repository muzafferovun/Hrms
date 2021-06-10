package kodlamaio.hrms.entities.dtos;

public class PersonLinkAddDto {
	private int personId;
	private int linkId;
	private String linkInfo;
	private String linkValue;
	public PersonLinkAddDto() {
		super();
	}
	public PersonLinkAddDto(int personId, int linkId, String linkInfo, String linkValue) {
		super();
		this.personId = personId;
		this.linkId = linkId;
		this.linkInfo = linkInfo;
		this.linkValue = linkValue;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public int getLinkId() {
		return linkId;
	}
	public void setLinkId(int linkId) {
		this.linkId = linkId;
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
}
