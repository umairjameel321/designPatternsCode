
public class UseStrategy {
	private MyStrategy mystrategy;
	
	public UseStrategy(MyStrategy strategy) {
		this.mystrategy = strategy;
	}
	
	public int[] performStrategy(int[] arr) {
		return mystrategy.sortArray(arr);
	}
}
