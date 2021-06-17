package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.results.AllDataResult;
import kodlamaio.hrms.core.results.DataResult;
import kodlamaio.hrms.core.results.ErrorDataResult;
import kodlamaio.hrms.core.results.ErrorResult;
import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.core.results.SuccessDataResult;
import kodlamaio.hrms.core.results.SuccessResult;
import kodlamaio.hrms.entities.dtos.EducationAddDto;
import kodlamaio.hrms.entities.dtos.EducationListDto;

public interface EducationService {
	DataResult<List<EducationListDto>>  getAll();
	List<Result> add(EducationAddDto educationAddDto);

}
