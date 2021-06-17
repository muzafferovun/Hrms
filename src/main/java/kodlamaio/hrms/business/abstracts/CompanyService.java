package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.results.AllDataResult;
import kodlamaio.hrms.core.results.DataResult;
import kodlamaio.hrms.core.results.ErrorDataResult;
import kodlamaio.hrms.core.results.ErrorResult;
import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.core.results.SuccessDataResult;
import kodlamaio.hrms.core.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.Company;
import kodlamaio.hrms.entities.concretes.CompanyUser;



public interface CompanyService {
	DataResult<List<Company>>  getAll();
	List<Result> add(CompanyUser companyUser);
	Result closeJobPosition( int jobPositionId);
	Result openJobPosition( int jobPositionId);
    DataResult<Company> getByCompanyName(String companyName);

}
