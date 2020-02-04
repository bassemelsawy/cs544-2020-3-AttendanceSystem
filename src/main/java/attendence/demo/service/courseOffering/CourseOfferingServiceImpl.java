package attendence.demo.service.courseOffering;

import attendence.demo.domain.CourseOffering;
import attendence.demo.domain.Faculty;
import attendence.demo.repository.CourseOfferingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseOfferingServiceImpl implements CourseOfferingService {

	@Autowired
	private CourseOfferingRepository courseOfferingRepository;


	@Override
	public List<CourseOffering> findAll() {
		System.out.println("Service");
		return courseOfferingRepository.findAll();
	}

	@Override
	public CourseOffering findById(int id) {
		return courseOfferingRepository.getOne(id);
	}

	@Override
	public CourseOffering save(CourseOffering courseOffering) {
		return courseOfferingRepository.save(courseOffering);
	}

	@Override
	public void delete(int id) {
		courseOfferingRepository.deleteById(id);
	}

//	@Override
//	public List<CourseOffering> findByFacultyId(int facultyId) {
//		List<CourseOffering>  theList = courseOfferingRepository.findAll();
//		theList = theList.stream().filter(c-> c.getFaculty().getId()==facultyId).collect(Collectors.toList());
//		return theList;
//	}
}