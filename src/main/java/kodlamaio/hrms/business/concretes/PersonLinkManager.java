package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.PersonLinkService;
import kodlamaio.hrms.core.results.AllDataResult;
import kodlamaio.hrms.core.results.DataResult;
import kodlamaio.hrms.core.results.ErrorDataResult;
import kodlamaio.hrms.core.results.ErrorResult;
import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.core.results.SuccessDataResult;
import kodlamaio.hrms.core.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.LinksDao;
import kodlamaio.hrms.dataAccess.abstracts.PersonDao;
import kodlamaio.hrms.dataAccess.abstracts.PersonLinkDao;
import kodlamaio.hrms.entities.concretes.PersonLink;
import kodlamaio.hrms.entities.dtos.PersonExperiencesGetDto;
import kodlamaio.hrms.entities.dtos.PersonLinkAddDto;
import kodlamaio.hrms.entities.dtos.PersonLinkGetDto;
@Service
public class PersonLinkManager implements PersonLinkService {
	private PersonDao personDao;
	private PersonLinkDao personLinkDao;
	private LinksDao linksDao;
	@Autowired
	PersonLinkManager(PersonDao personDao,PersonLinkDao personLinkDao,LinksDao linksDao){
		this.personDao=personDao;
		this.personLinkDao=personLinkDao;
		this.linksDao=linksDao;
	}
	
	@Override
	public DataResult<List<PersonLinkGetDto>> getLinks(int personId) {
		return new SuccessDataResult<List<PersonLinkGetDto>>(personLinkDao.getLinks(personId),"experiences listed");	}

	@Override
	public List<Result> addLink(PersonLinkAddDto personLinkAddDto) {
		AllDataResult allDataResult=new AllDataResult();
		allDataResult=checkAdd(personLinkAddDto);
		if(!allDataResult.isSuccess()) {
			allDataResult.addResult(new ErrorResult("Error"));
			return allDataResult.getErrorResults();
		}
		PersonLink personLink=new PersonLink();
		personLink.setLinkInfo(personLinkAddDto.getLinkInfo());
		personLink.setLinkValue(personLinkAddDto.getLinkValue());
		personLink.setPerson(personDao.findById(personLinkAddDto.getPersonId()).get());
		personLink.setLinks(linksDao.findById(personLinkAddDto.getLinkId()).get());
		personLinkDao.save(personLink);
		allDataResult.addResult(new SuccessResult("Kayıt İşlemi gerçekleştirildi"));
		return allDataResult.getSuccessResults();
	}
	
	private AllDataResult checkAdd(PersonLinkAddDto personLinkAddDto) {
		AllDataResult allDataResult=new AllDataResult();
		if(this.personDao.findById(personLinkAddDto.getPersonId()).isEmpty()) {
			allDataResult.addResult(new ErrorResult("Person is not found"));
		}
		if(this.linksDao.findById(personLinkAddDto.getLinkId()).isEmpty()) {
			allDataResult.addResult(new ErrorResult("Link is not found"));
		}
		return allDataResult;
	}

}
