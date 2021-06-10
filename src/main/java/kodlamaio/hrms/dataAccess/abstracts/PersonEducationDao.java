package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.PersonEducation;
import kodlamaio.hrms.entities.dtos.PersonEducationGetDto;

public interface PersonEducationDao extends JpaRepository<PersonEducation, Integer> {

  	@Query("SELECT new kodlamaio.hrms.entities.dtos.PersonEducationGetDto"
		  		+ "("
		  		+ "pe.id,p.id,pe.educationInfo,pe.educationStartDate,pe.educationEndDate,pe.isGraduate"
		  		+ ",et.id,et.educationTypeName"
		  		+ ",e.id,e.name,e.info,e.logo,e.website"
		  		+ ",ec.id,ec.city_name"
		  		+ ") "
			  		+ "from PersonEducation pe"
			  		+ " Inner join pe.person p"
			  		+ " Inner Join pe.education e"
			  		+ " Inner Join e.educationType et"
			  		+ " Inner Join e.city ec"
			  		+ " where p.id=:personId")
	List<PersonEducationGetDto> getPersonEducations(int personId);
/*	
	@Query("from PersonEducation pe"
	  		+ " Inner join pe.person p"
	  		+ " Inner Join pe.education e"
	  		+ " Inner Join e.educationType et"
	  		+ " Inner Join e.city ec"
	  		+ " where p.id=:personId and pe.id=:educationId")

List<PersonEducation> getPersonEducations(int personId,int educationId);
	@Query("from PersonEducation pe"
	  		+ " where  pe.id=:educationId")
PersonEducation getPersonEducation(int educationId);
	
	int id, int personId, String educationInfo, LocalDate educationStartDate,
	LocalDate educationEndDate, boolean isGraduate, 
	int educationType, String educationTypeName, int institueId,
	String institueName, String institueinfo, String instituelogo, String instituewebsite, int institueCity,
	String institueCityName
*/
}
