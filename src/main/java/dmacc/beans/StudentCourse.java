/**
 * @author Becca Deuser - rddeuser
 * CIS175 - Fall 2021
 * Dec 9, 2021
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bdeus
 *
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentCourse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String courseId;
	private String courseName;
	@Autowired
	private Teacher teacher;

}//end StudentCourse
