
public class SelectionSortStrategy implements MyStrategy {
	public int[] sortArray(int [] arr) {
		for(int i = 0; i < arr.length -1; i++) {
			int index = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[index]) {
					index = j;
				}
			}
			int smallerNum = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNum;
		}
		
		return arr;
	}
}
