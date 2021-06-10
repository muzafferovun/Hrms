package kodlamaio.hrms.entities.dtos;

public class PersonLinkGetDto {
	private int id;
	private int linkId;
	private String linkName;
	private String linkAvatar;
	private String linkInfo;
	private String linkValue;
	public PersonLinkGetDto() {
		super();
	}
	public PersonLinkGetDto(int id, int linkId, String linkName, String linkAvatar, String linkInfo, String linkValue) {
		super();
		this.id = id;
		this.linkId = linkId;
		this.linkName = linkName;
		this.linkAvatar = linkAvatar;
		this.linkInfo = linkInfo;
		this.linkValue = linkValue;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLinkId() {
		return linkId;
	}
	public void setLinkId(int linkId) {
		this.linkId = linkId;
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
