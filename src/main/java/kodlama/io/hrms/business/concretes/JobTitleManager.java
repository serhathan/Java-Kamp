package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobTitleService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobTitleDao;
import kodlama.io.hrms.entities.concretes.JobTitle;
@Service
public class JobTitleManager implements JobTitleService {
	
	private JobTitleDao jobDao;
	
	
	@Autowired
	public JobTitleManager(JobTitleDao jobDao) {
		super();
		this.jobDao = jobDao;
	}



	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(this.jobDao.findAll(),"Data Listelendi.");
	}



	@Override
	public Result add(JobTitle jobTitle) {
		this.jobDao.save(jobTitle);
		return new SuccessResult("İş ünvanı eklendi.");
	}
	
	
	
}
