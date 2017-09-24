
public class StudentsRepo implements Container {
	public String students[] = {"Umair", "Ali", "Haris", "Adam", "Bond"};
	@Override
	public Iterator getIterator() {
		return new NamesIterator();
	}
	
	private class NamesIterator implements Iterator {
		int index = 0;
		@Override
		public boolean hasNext() {
			if(index < students.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return students[index++];
			}
		
			return null;
		}
		
	}

}
