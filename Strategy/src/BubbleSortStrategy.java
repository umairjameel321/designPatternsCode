
public class BubbleSortStrategy implements MyStrategy {
	public int[] sortArray(int [] arr) {
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length; j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
