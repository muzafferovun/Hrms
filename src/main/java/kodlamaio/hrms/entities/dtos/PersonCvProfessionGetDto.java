package kodlamaio.hrms.entities.dtos;



public class PersonCvProfessionGetDto {
	private int id;

	private int personId;

	private int cvId;
	private String content;

	private int professionId;
	private String professionName;
	private String professionDescription;
	private String professionAvatar;
	private int sectorId;
	private String sectorName;
	private String sectorAvatar;
	private int sectorPopularity;
	public PersonCvProfessionGetDto() {
		super();
	}
	public PersonCvProfessionGetDto(int id, int personId, int cvId,
			 String content, int professionId, String professionName, String professionDescription,
			String professionAvatar, int sectorId, String sectorName, String sectorAvatar, int sectorPopularity) {
		super();
		this.id = id;
		this.personId = personId;
		this.cvId = cvId;
		this.content = content;
		this.professionId = professionId;
		this.professionName = professionName;
		this.professionDescription = professionDescription;
		this.professionAvatar = professionAvatar;
		this.sectorId = sectorId;
		this.sectorName = sectorName;
		this.sectorAvatar = sectorAvatar;
		this.sectorPopularity = sectorPopularity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public int getCvId() {
		return cvId;
	}
	public void setCvId(int cvId) {
		this.cvId = cvId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getProfessionId() {
		return professionId;
	}
	public void setProfessionId(int professionId) {
		this.professionId = professionId;
	}
	public String getProfessionName() {
		return professionName;
	}
	public void setProfessionName(String professionName) {
		this.professionName = professionName;
	}
	public String getProfessionDescription() {
		return professionDescription;
	}
	public void setProfessionDescription(String professionDescription) {
		this.professionDescription = professionDescription;
	}
	public String getProfessionAvatar() {
		return professionAvatar;
	}
	public void setProfessionAvatar(String professionAvatar) {
		this.professionAvatar = professionAvatar;
	}
	public int getSectorId() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public String getSectorAvatar() {
		return sectorAvatar;
	}
	public void setSectorAvatar(String sectorAvatar) {
		this.sectorAvatar = sectorAvatar;
	}
	public int getSectorPopularity() {
		return sectorPopularity;
	}
	public void setSectorPopularity(int sectorPopularity) {
		this.sectorPopularity = sectorPopularity;
	}
}
