package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.dtos.CvDto;
import kodlamaio.hrms.entities.dtos.PersonCvAddDto;
import kodlamaio.hrms.entities.dtos.PersonCvEducationAddDto;
import kodlamaio.hrms.entities.dtos.PersonCvEducationGetDto;
import kodlamaio.hrms.entities.dtos.PersonCvExperiencesAddDto;
import kodlamaio.hrms.entities.dtos.PersonCvExperiencesGetDto;
import kodlamaio.hrms.entities.dtos.PersonCvGetDto;
import kodlamaio.hrms.entities.dtos.PersonCvProfessionAddDto;
import kodlamaio.hrms.entities.dtos.PersonCvProfessionGetDto;

public interface PersonCvService {
	DataResult<List<PersonCvGetDto>> getAll();
	List<Result> addCv( PersonCvAddDto personCvAddDto);
	
	DataResult<List<PersonCvProfessionGetDto>> getCvProfessions(int personCvId);
	List<Result> addCvProfession( PersonCvProfessionAddDto personCvProfessionAddDto);
	
	DataResult<List<PersonCvExperiencesGetDto>> getCvExperiences(int personCvId);
	List<Result> addCvExperiences( PersonCvExperiencesAddDto personCvExperiencesAddDto);
	
	DataResult<List<PersonCvEducationGetDto>> getCvEducation(int educationCvId);
	List<Result> addCvEducation( PersonCvEducationAddDto personCvEducationAddDto);
	DataResult<CvDto> getCv( int personId,int cvId);
}
