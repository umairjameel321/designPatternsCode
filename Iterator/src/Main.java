
public class Main {
	public static void main(String[] args) {
		StudentsRepo studentsRepo = new StudentsRepo();
		Iterator iterator = studentsRepo.getIterator();
		do {
			String name = (String)iterator.next();
			System.out.println(name);
		}while(iterator.hasNext());
	}
}
