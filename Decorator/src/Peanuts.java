
public class Peanuts extends IcecreamTopping{
	public Peanuts(Icecream icecream) {
		this.icecream = icecream;
	}

	@Override
	public String description() {
		return "Peanuts";
	}

	@Override
	public Double cost() {
		return this.icecream.cost() + 2.0;
	}
}
