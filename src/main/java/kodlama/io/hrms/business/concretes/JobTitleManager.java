package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobTitleService;
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
	public List<JobTitle> getAll() {
		// TODO Auto-generated method stub
		return this.jobDao.findAll();
	}
	
	
	
}
