package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.entities.User;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	DataResult<List<User>>getAll();
}
