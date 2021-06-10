package kodlamaio.hrms.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.PersonCvExperiences;

import kodlamaio.hrms.entities.dtos.PersonCvExperiencesGetDto;

public interface PersonCvExperiencesDao extends JpaRepository<PersonCvExperiences, Integer> {

	  @Query("SELECT new kodlamaio.hrms.entities.dtos.PersonCvExperiencesGetDto"
		  		+ "(pce.id,p.id,pcv.id"
		  		+ ",pe.info,pe.startDate,pe.endDate,pe.isWorking,pe.otherCompany"
		  		+ ",sp.sectorId,sp.positionName,sp.positionAvatar,sp.positionPopularity"
		  		+ ",c.id,c.company_name,c.website,c.company_email,c.company_logo) "
			  	+ " from PersonCvExperiences pce"
			  	+ "		 Inner join pce.personCv pcv"
			  	+ "		 Inner join pcv.person p"
			  	+ "		 Inner Join pce.personExperiences pe"
			  	+ "		 Inner Join pe.sectorPosition sp"
			  	+ "		 Inner Join pe.company c"
			  	+ "")
			  List<PersonCvExperiencesGetDto> getPersonCvExperiencesGetDto(int cvId);
/*int id, int personId, int personCvId, String info, LocalDate startDate,
			LocalDate endDate, boolean isWorking, String otherCompany
			, int sectorId, String positionName,String positionAvatar, int positionPopularity
			, int companyId, String companyName, String companyWebsite,
			String companyEmail, String companyLogo*/
}
