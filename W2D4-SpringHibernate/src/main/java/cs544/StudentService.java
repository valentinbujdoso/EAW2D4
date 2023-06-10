package cs544;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class StudentService {

	@Autowired
	private StudentDAO studentdao;

	public Student getStudent(long studentid) { 
		return studentdao.load(studentid);
	}
}
