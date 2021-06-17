package kodlamaio.hrms.business.abstracts;

import java.util.List;
import kodlamaio.hrms.core.results.AllDataResult;
import kodlamaio.hrms.core.results.DataResult;
import kodlamaio.hrms.core.results.ErrorDataResult;
import kodlamaio.hrms.core.results.ErrorResult;
import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.core.results.SuccessDataResult;
import kodlamaio.hrms.core.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.Sector;

public interface SectorService {
	DataResult<List<Sector>>  getAll();
	Result add(Sector sector);

	
}
