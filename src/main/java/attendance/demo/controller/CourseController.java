package attendance.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import attendance.demo.domain.Course;
import attendance.demo.service.course.CourseService;

import java.util.List;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("admin/read_courses")
	public List<Course> getAllCourses() {
		return courseService.findAll();
	}

	@GetMapping("/admin/courses/{id}")
	public Course getCourse(@PathVariable Integer id) {
		return courseService.findById(id);
	}

	@PostMapping("/admin/courses")
	public Course saveCourse(Course course) {
		return courseService.save(course);
	}

	@PutMapping("/admin/courses")
	public Course updateCourse(Course course) {
		return courseService.save(course);
	}

	@DeleteMapping(value = "/admin/courses/{id}")
	public void deleteCourse(@PathVariable Integer id) {
		courseService.delete(id);
	}

}