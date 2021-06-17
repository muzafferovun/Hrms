package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.PersonCvService;
import kodlamaio.hrms.core.results.AllDataResult;
import kodlamaio.hrms.core.results.DataResult;
import kodlamaio.hrms.core.results.ErrorDataResult;
import kodlamaio.hrms.core.results.ErrorResult;
import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.core.results.SuccessDataResult;
import kodlamaio.hrms.core.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.PersonCvDao;
import kodlamaio.hrms.dataAccess.abstracts.PersonCvEducationDao;
import kodlamaio.hrms.dataAccess.abstracts.PersonCvExperiencesDao;
import kodlamaio.hrms.dataAccess.abstracts.PersonCvProfessionDao;
import kodlamaio.hrms.dataAccess.abstracts.PersonDao;
import kodlamaio.hrms.dataAccess.abstracts.PersonEducationDao;
import kodlamaio.hrms.dataAccess.abstracts.PersonExperiencesDao;
import kodlamaio.hrms.dataAccess.abstracts.PersonLinkDao;
import kodlamaio.hrms.dataAccess.abstracts.PersonProfessionDao;

import kodlamaio.hrms.entities.concretes.PersonCv;
import kodlamaio.hrms.entities.concretes.PersonCvEducation;
import kodlamaio.hrms.entities.concretes.PersonCvExperiences;
import kodlamaio.hrms.entities.concretes.PersonCvProfession;
import kodlamaio.hrms.entities.concretes.PersonEducation;
import kodlamaio.hrms.entities.dtos.CvDto;
import kodlamaio.hrms.entities.dtos.PersonCvAddDto;
import kodlamaio.hrms.entities.dtos.PersonCvEducationAddDto;
import kodlamaio.hrms.entities.dtos.PersonCvEducationGetDto;
import kodlamaio.hrms.entities.dtos.PersonCvExperiencesAddDto;
import kodlamaio.hrms.entities.dtos.PersonCvExperiencesGetDto;
import kodlamaio.hrms.entities.dtos.PersonCvGetDto;
import kodlamaio.hrms.entities.dtos.PersonCvProfessionAddDto;
import kodlamaio.hrms.entities.dtos.PersonCvProfessionGetDto;
@Service
public class PersonCvManager implements PersonCvService {
	private PersonCvDao personCvDao;
	private PersonDao personDao;
	private PersonProfessionDao personProfessionDao;
	private PersonCvProfessionDao personCvProfessionDao;
	private PersonCvEducationDao personCvEducationDao;
	private PersonCvExperiencesDao personCvExperiencesDao;
	private PersonEducationDao personEducationDao;
	private PersonExperiencesDao personExperiencesDao;
	private PersonLinkDao personLinkDao;
	@Autowired
	PersonCvManager(PersonCvDao personCvDao,PersonDao personDao
			,PersonProfessionDao personProfessionDao,PersonCvProfessionDao personCvProfessionDao
			,PersonCvEducationDao personCvEducationDao,PersonEducationDao personEducationDao
			,PersonCvExperiencesDao personCvExperiencesDao,PersonExperiencesDao personExperiencesDao
			,PersonLinkDao personLinkDao){
		this.personCvDao=personCvDao;
		this.personDao=personDao;
		this.personProfessionDao=personProfessionDao;
		this.personEducationDao=personEducationDao;
		this.personCvProfessionDao=personCvProfessionDao;
		this.personCvEducationDao=personCvEducationDao;
		this.personCvExperiencesDao=personCvExperiencesDao;
		this.personExperiencesDao=personExperiencesDao;
		this.personLinkDao=personLinkDao;
	}
	@Override
	public DataResult<List<PersonCvGetDto>> getAll() {
		return new SuccessDataResult<List<PersonCvGetDto>>(personCvDao.getAllCv(),"Eğitim Enstitüleri listelendi");
		
	}

	@Override
	public List<Result> addCv(PersonCvAddDto personCvAddDto) {
		AllDataResult allDataResult=new AllDataResult();
		allDataResult=checkAdd(personCvAddDto);
		if(!allDataResult.isSuccess()) {
			allDataResult.addResult(new ErrorResult("Error"));
			return allDataResult.getErrorResults();
		}
		PersonCv personCv=new PersonCv();
		personCv.setCvCaption(personCvAddDto.getCvCaption());
		personCv.setCvContent(personCvAddDto.getCvContent());
		personCv.setPerson(this.personDao.findById(personCvAddDto.getPerson()).get());
		personCvDao.save(personCv);
		allDataResult.addResult(new SuccessResult("Cv Saved!!"));
		return allDataResult.getSuccessResults();
	}
	private AllDataResult checkAdd(PersonCvAddDto personCvAddDto) {
		AllDataResult allDataResult=new AllDataResult();
		if(personCvAddDto.getCvCaption().isBlank()) {
			allDataResult.addResult(new ErrorResult("cv Caption is blank"));
		}
		if(!this.personCvDao.findByCvCaption(personCvAddDto.getCvCaption()).isEmpty()) {
			allDataResult.addResult(new ErrorResult("Education name is already registered"));
		}
		if(personCvAddDto.getCvContent().isBlank()) {
			allDataResult.addResult(new ErrorResult("cv content is blank"));
		}
		if(this.personDao.findById(personCvAddDto.getPerson()).isEmpty()) {
			allDataResult.addResult(new ErrorResult("person not found"));
			
		}
		return allDataResult;
	}
	@Override
	public DataResult<List<PersonCvProfessionGetDto>> getCvProfessions(int personCvId) {
		return new SuccessDataResult<List<PersonCvProfessionGetDto>>(personCvProfessionDao.getPersonCvProfessionGetDto(personCvId),"Cv professions listed");
		
	}
	@Override
	public List<Result> addCvProfession(PersonCvProfessionAddDto personCvProfessionAddDto) {
		AllDataResult allDataResult=new AllDataResult();
		allDataResult=checkaddCvProfession(personCvProfessionAddDto);
		if(!allDataResult.isSuccess()) {
			allDataResult.addResult(new ErrorResult("Error"));
			return allDataResult.getErrorResults();
		}
		PersonCvProfession personCvProfession=new PersonCvProfession();
		personCvProfession.setPersonCv(this.personCvDao.findById(personCvProfessionAddDto.getPersonCv()).get());
		personCvProfession.setPersonProfession(this.personProfessionDao.findById(personCvProfessionAddDto.getPersonProfession()).get());
		this.personCvProfessionDao.save(personCvProfession);
		allDataResult.addResult(new SuccessResult("Cv Saved!!"));
		return allDataResult.getSuccessResults();
	}
	private AllDataResult checkaddCvProfession(PersonCvProfessionAddDto personCvProfessionAddDto) {
		AllDataResult allDataResult=new AllDataResult();
		if(this.personCvDao.findById(personCvProfessionAddDto.getPersonCv()).isEmpty()) {
			allDataResult.addResult(new ErrorResult("un defined person_cv"));
		}
		if(this.personProfessionDao.findById(personCvProfessionAddDto.getPersonProfession()).isEmpty()) {
			allDataResult.addResult(new ErrorResult("un defined person_profession"));
		}
		return allDataResult;
	}
	@Override
	public DataResult<List<PersonCvEducationGetDto>> getCvEducation(int cvId) {
		return new SuccessDataResult<List<PersonCvEducationGetDto>>(personCvEducationDao.getPersonCvEducationGetDto(cvId),"Cv educations listed");
	}
	@Override
	public List<Result> addCvEducation(PersonCvEducationAddDto personCvEducationAddDto) {
		AllDataResult allDataResult=new AllDataResult();
		allDataResult=checkaddCvEducation(personCvEducationAddDto);
		if(!allDataResult.isSuccess()) {
			allDataResult.addResult(new ErrorResult("Error"));
			return allDataResult.getErrorResults();
		}

		PersonCvEducation personCvEducation=new PersonCvEducation();
		personCvEducation.setPersonCv(this.personCvDao.findById(personCvEducationAddDto.getPersonCv()).get());
		personCvEducation.setPersonEducation(this.personEducationDao.findById(personCvEducationAddDto.getPersonEducation()).get());
		this.personCvEducationDao.save(personCvEducation);
		allDataResult.addResult(new SuccessResult("Cv Saved!!"));
		return allDataResult.getSuccessResults();
	}
	private AllDataResult checkaddCvEducation(PersonCvEducationAddDto personCvEducationAddDto) {
		AllDataResult allDataResult=new AllDataResult();
		if(this.personCvDao.findById(personCvEducationAddDto.getPersonCv()).isEmpty()) {
			allDataResult.addResult(new ErrorResult("un defined person_cv"));
		}
		if(this.personEducationDao.findById(personCvEducationAddDto.getPersonEducation()).isEmpty()) {
			allDataResult.addResult(new ErrorResult("un defined person education"));
		}

		return allDataResult;
	}
	@Override
	public DataResult<List<PersonCvExperiencesGetDto>> getCvExperiences(int personCvId) {
		return new SuccessDataResult<List<PersonCvExperiencesGetDto>>(this.personCvExperiencesDao.getPersonCvExperiencesGetDto(personCvId),"Cv educations listed");
	
	}
	@Override
	public List<Result> addCvExperiences(PersonCvExperiencesAddDto personCvExperiencesAddDto) {
		AllDataResult allDataResult=new AllDataResult();
		allDataResult=checkaddCvExperiences(personCvExperiencesAddDto);
		if(!allDataResult.isSuccess()) {
			allDataResult.addResult(new ErrorResult("Error"));
			return allDataResult.getErrorResults();
		}
		PersonCvExperiences personCvExperiences=new PersonCvExperiences();
		personCvExperiences.setPersonCv(this.personCvDao.findById(personCvExperiencesAddDto.getPersonCv()).get());
		personCvExperiences.setPersonExperiences(this.personExperiencesDao.findById(personCvExperiencesAddDto.getPersonExperience()).get());
		this.personCvExperiencesDao.save(personCvExperiences);
		allDataResult.addResult(new SuccessResult("Cv Saved!!"));
		return allDataResult.getSuccessResults();
	}
	private AllDataResult checkaddCvExperiences(PersonCvExperiencesAddDto personCvExperiencesAddDto) {
		AllDataResult allDataResult=new AllDataResult();
		if(this.personCvDao.findById(personCvExperiencesAddDto.getPersonCv()).isEmpty()) {
			allDataResult.addResult(new ErrorResult("un defined person_cv"));
		}
		if(this.personExperiencesDao.findById(personCvExperiencesAddDto.getPersonExperience()).isEmpty()) {
			allDataResult.addResult(new ErrorResult("un defined person experiences"));
		}

		return allDataResult;
	}
	@Override
	public DataResult<CvDto> getCv( int personId,int cvId) {
		CvDto cvDto=new CvDto();
		cvDto.setPersonCv(this.personCvDao.findById(cvId).get());
		cvDto.setExperiences(this.personCvExperiencesDao.getPersonCvExperiencesGetDto(cvId));
		cvDto.setEducations(this.personCvEducationDao.getPersonCvEducationGetDto(cvId));
		cvDto.setPersonLinks(this.personLinkDao.getLinks(personId));
		cvDto.setProfessions(this.personCvProfessionDao.getPersonCvProfessionGetDto(cvId));
		return new SuccessDataResult<CvDto>(cvDto,"Cv listelendi");
	}

}
