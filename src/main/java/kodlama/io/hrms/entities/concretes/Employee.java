package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import kodlama.io.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employees")
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "id")
public class Employee extends User{
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
}
