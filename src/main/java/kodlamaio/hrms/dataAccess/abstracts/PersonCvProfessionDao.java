package kodlamaio.hrms.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.PersonCvProfession;
import kodlamaio.hrms.entities.dtos.PersonCvProfessionGetDto;
import kodlamaio.hrms.entities.dtos.PersonExperiencesGetDto;


public interface PersonCvProfessionDao extends JpaRepository<PersonCvProfession, Integer> {
/*
	@Query("SELECT new kodlamaio.hrms.entities.dtos.PersonCvProfessionGetDto"
		  		+ "(pcp.id,pc.id,pc.cvCaption,pc.pp.id,) "
			  		+ "from PersonCvProfession pcp"
			  		+ " Inner join pcp.personCv pc"
			  		+ " Inner Join pcp.personProfession pp"
			  		+ " Inner Join pc.person p"
			  		+ " Inner Join pp.sectorProfession sp"
			  		+ " Inner Join sp.company c"
			  		+ " where pcp.id:personCvId")
	  List<PersonCvProfessionGetDto> getAllPersonCvProfessionGetDto(int personCvId);
	*/   
	  @Query("SELECT new kodlamaio.hrms.entities.dtos.PersonCvProfessionGetDto"
		  		+ "(pcp.id,p.id,pcv.id"
		  		+ ",pp.content,sp.id,sp.profession_name,sp.profession_description,sp.profession_avatar"
		  		+ ",s.id,s.sector_name,s.sector_avatar,s.popularity) "
			  		+ "from PersonCvProfession pcp"
			  		+ " Inner join pcp.personCv pcv"
			  		+ " Inner Join pcp.personProfession pp"
			  		+ " Inner Join pp.sectorProfession sp"
			  		+ " Inner Join sp.sector s"
			  		+ " Inner Join pcv.person p"
			  		+ " where pcv.id=:personId")
			  List<PersonCvProfessionGetDto> getPersonCvProfessionGetDto(int personId);
	/*int id, int personId int cvId,
			 String content, int professionId, String professionName, String professionDescription,
			String professionAvatar, int sectorId, String sectorName, String sectorAvatar, int sectorPopularity*/	  
}
