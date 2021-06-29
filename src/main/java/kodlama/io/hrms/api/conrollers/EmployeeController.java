package kodlama.io.hrms.api.conrollers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.EmployeeService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.ErrorDataResult;
import kodlama.io.hrms.entities.concretes.Employee;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getAll")
	DataResult<List<Employee>>getAll(){
		return this.employeeService.getAll();
	}
	
	@PostMapping(value = "/add")
	public ResponseEntity<?> add(@Valid @RequestBody Employee employee) {
		return ResponseEntity.ok(this.employeeService.add(employee));
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
		Map<String,String> validationErrors=new HashMap<String, String>();
		
		for(FieldError fieldError:exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(),fieldError.getDefaultMessage());
		}
		
		ErrorDataResult<Object>errors=new ErrorDataResult<Object>(validationErrors,"Doğrulama hataları");
		
		return errors;
	}

	
}
