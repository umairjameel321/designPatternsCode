
public class Main {
	public static void main(String[] args) {
		Data data = new Data();
		Observer std = new Student(data);
		String msg = "Hello World";
		data.setMessage(msg);
		
		if(!data.getMessage().equals("")) {
			data.notifyObservers();
		}
		
		//data.removeObserver(std);
		if(!data.getMessage().equals("")) {
			data.notifyObservers();
		}
		

	}
}
