package kodlamaio.hrms.dataAccess.abstracts;



import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.PersonCvEducation;
import kodlamaio.hrms.entities.dtos.EducationListDto;
import kodlamaio.hrms.entities.dtos.PersonCvEducationGetDto;



public interface PersonCvEducationDao extends JpaRepository<PersonCvEducation, Integer> {

	  @Query("SELECT new kodlamaio.hrms.entities.dtos.PersonCvEducationGetDto"
		  		+ "(pce.id,pcv.id,pe.educationInfo,pe.educationStartDate,pe.educationEndDate,pe.isGraduate"
		  		+ ",et.id,et.educationTypeName,e.id,e.name,e.info,e.logo,e.website"
		  		+ ",c.id,c.city_name) "
			  	+ " from PersonCvEducation pce"
			  	+ "		 Inner join pce.personCv pcv"
			  	+ "		 Inner Join pce.personEducation pe"
			  	+ "		 Inner Join pe.education e"
			  	+ "		 Inner Join e.educationType et"
			  	+ "		 Inner Join e.city c"
			  	+ "")
			  List<PersonCvEducationGetDto> getPersonCvEducationGetDto(int cvId);
/*int id, int personCv, String educationInfo, LocalDate educationStartDate,LocalDate educationEndDate, boolean isGraduate
 * , int educationType, String educationTypeName
 * , int institueId,String institueName, String institueinfo, String instituelogo, String instituewebsite
 * , int institueCity,String institueCityName*/
	
}
