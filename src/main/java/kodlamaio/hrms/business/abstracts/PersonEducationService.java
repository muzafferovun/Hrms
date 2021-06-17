package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.results.AllDataResult;
import kodlamaio.hrms.core.results.DataResult;
import kodlamaio.hrms.core.results.ErrorDataResult;
import kodlamaio.hrms.core.results.ErrorResult;
import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.core.results.SuccessDataResult;
import kodlamaio.hrms.core.results.SuccessResult;

import kodlamaio.hrms.entities.dtos.PersonEducationAddDto;
import kodlamaio.hrms.entities.dtos.PersonEducationGetDto;

public interface PersonEducationService {
	DataResult<List<PersonEducationGetDto>> getEducation(int personId);
	List<Result> addEducation( PersonEducationAddDto personEducationAddDto);

}
