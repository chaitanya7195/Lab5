package StudentMgmt.DAO;
import java.util.List;

public interface DAO {
	
	public void save(Student student);

	public void Delete(int id);

	public Student findbyid(int id);

	public List<Student> findAll();

}
