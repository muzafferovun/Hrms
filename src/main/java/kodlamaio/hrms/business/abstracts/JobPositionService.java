package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.results.AllDataResult;
import kodlamaio.hrms.core.results.DataResult;
import kodlamaio.hrms.core.results.ErrorDataResult;
import kodlamaio.hrms.core.results.ErrorResult;
import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.core.results.SuccessDataResult;
import kodlamaio.hrms.core.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.JobPosition;
import kodlamaio.hrms.entities.concretes.SectorPosition;
import kodlamaio.hrms.entities.dataTransferObjects.JobPositionList;
import kodlamaio.hrms.entities.dtos.JobPositionAddDto;


public interface JobPositionService<T> {
	DataResult<List<JobPosition>>  getAll();
	List<Result> add(JobPositionAddDto jobPositionAddDto);
	DataResult<List<SectorPosition>>  getJobPositions();
	DataResult<List<T>>  getAplicationsList();
	DataResult<List<T>>  getCompanyAplicationsList(int companyId);
		
}
