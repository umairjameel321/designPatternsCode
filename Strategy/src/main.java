
public class main {
	public static void main(String[] args) {
		int [] evenArray = {11, 23, 6, 2, 16, 4};
		int [] oddArray = {11, 23, 6, 2, 16};
		
		UseStrategy useStrategy1 = new UseStrategy(new BubbleSortStrategy());
		int [] result = useStrategy1.performStrategy(evenArray);
		for(int i = 0; i< evenArray.length; i++) {
			System.out.println(result[i]);
		}
		
		UseStrategy useStrategy2 = new UseStrategy(new SelectionSortStrategy());
		int [] result2 = useStrategy2.performStrategy(oddArray);
		for(int i = 0; i< oddArray.length; i++) {
			System.out.println(result2[i]);
		}
	}
}
