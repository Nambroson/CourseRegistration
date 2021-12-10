/**
 * @author Becca Deuser - rddeuser
 * CIS175 - Fall 2021
 * Dec 9, 2021
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.StudentCourse;

/**
 * @author bdeus
 *
 */
public interface StudentCourses extends JpaRepository <StudentCourse, Long> {

}
