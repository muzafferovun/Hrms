package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.results.AllDataResult;
import kodlamaio.hrms.core.results.DataResult;
import kodlamaio.hrms.core.results.ErrorDataResult;
import kodlamaio.hrms.core.results.ErrorResult;
import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.core.results.SuccessDataResult;
import kodlamaio.hrms.core.results.SuccessResult;
import kodlamaio.hrms.entities.dtos.PersonExperiencesAddDto;
import kodlamaio.hrms.entities.dtos.PersonExperiencesGetDto;

public interface PersonExperiencesService {
	DataResult<List<PersonExperiencesGetDto>> getExperiences(int personId);
	List<Result> addExperiences(PersonExperiencesAddDto personExperiencesAddDto);

}
