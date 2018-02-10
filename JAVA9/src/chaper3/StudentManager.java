package chaper3;

public class StudentManager {
	public void add(Student s) {
		s.logIn();
	}

	public void delete(Student s) {
		s.clearOut();
	}

	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		Student underGraduate = new UnderGraduate();
		Student graduate = new Graduate();
		manager.add(underGraduate);
		manager.delete(underGraduate);
		manager.add(graduate);
		manager.delete(graduate);

	}

}
