package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;

public class PersonCvExperiencesGetDto {
	private int id;
	private int personId;
	private int personCvId;
	private String info;
	private LocalDate startDate;
	private LocalDate endDate;
	private boolean isWorking;
	private String otherCompany;
	private int sectorId;
	private String positionName;
	private String positionAvatar;
	private int positionPopularity;
	private int companyId;
	private String companyName;
	private String companyWebsite;
	private String companyEmail;
	private String companyLogo;
	public PersonCvExperiencesGetDto() {
		super();
	}
	public PersonCvExperiencesGetDto(int id, int personId, int personCvId, String info, LocalDate startDate,
			LocalDate endDate, boolean isWorking, String otherCompany, int sectorId, String positionName,
			String positionAvatar, int positionPopularity, int companyId, String companyName, String companyWebsite,
			String companyEmail, String companyLogo) {
		super();
		this.id = id;
		this.personId = personId;
		this.personCvId = personCvId;
		this.info = info;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isWorking = isWorking;
		this.otherCompany = otherCompany;
		this.sectorId = sectorId;
		this.positionName = positionName;
		this.positionAvatar = positionAvatar;
		this.positionPopularity = positionPopularity;
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyWebsite = companyWebsite;
		this.companyEmail = companyEmail;
		this.companyLogo = companyLogo;
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
	public int getPersonCvId() {
		return personCvId;
	}
	public void setPersonCvId(int personCvId) {
		this.personCvId = personCvId;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public boolean isWorking() {
		return isWorking;
	}
	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
	public String getOtherCompany() {
		return otherCompany;
	}
	public void setOtherCompany(String otherCompany) {
		this.otherCompany = otherCompany;
	}
	public int getSectorId() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public String getPositionAvatar() {
		return positionAvatar;
	}
	public void setPositionAvatar(String positionAvatar) {
		this.positionAvatar = positionAvatar;
	}
	public int getPositionPopularity() {
		return positionPopularity;
	}
	public void setPositionPopularity(int positionPopularity) {
		this.positionPopularity = positionPopularity;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyWebsite() {
		return companyWebsite;
	}
	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getCompanyLogo() {
		return companyLogo;
	}
	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}
}
