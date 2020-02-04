package attendence.demo.repository;

import attendence.demo.domain.AttendanceRecord;
import attendence.demo.domain.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional()
public interface SessionRepository extends JpaRepository<Session, Integer> {
}