package kodlamaio.hrms.dataAccess.abstracts;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.PersonLink;
import kodlamaio.hrms.entities.dtos.PersonExperiencesGetDto;
import kodlamaio.hrms.entities.dtos.PersonLinkGetDto;

public interface PersonLinkDao extends JpaRepository<PersonLink, Integer> {
	  @Query("SELECT new kodlamaio.hrms.entities.dtos.PersonLinkGetDto"
		  		+ "(pl.id,l.id,l.linkName,l.linkAvatar,pl.linkInfo,pl.linkValue) "
			  		+ "from PersonLink pl"
			  		+ " Inner join pl.person p"
			  		+ " Inner Join pl.links l"
			  		+ " where p.id=:personId")
			  List<PersonLinkGetDto> getLinks(int personId);
/*int id, int linkId, String linkName, String linkAvatar, String linkInfo
 * , String linkValue*/
}
