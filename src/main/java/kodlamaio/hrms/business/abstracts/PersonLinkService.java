package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.dtos.PersonLinkAddDto;
import kodlamaio.hrms.entities.dtos.PersonLinkGetDto;
import kodlamaio.hrms.entities.dtos.PersonProfessionAddDto;
import kodlamaio.hrms.entities.dtos.PersonProfessionGetDto;

public interface PersonLinkService {
	DataResult<List<PersonLinkGetDto>> getLinks( int personId);
	List<Result> addLink(PersonLinkAddDto personLinkAddDto);

}
