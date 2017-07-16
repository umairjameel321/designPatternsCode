
public class Chocolate extends IcecreamTopping{
	public Chocolate(Icecream icecream) {
		this.icecream = icecream;
	}

	@Override
	public String description() {
		return "Chocolate";
	}

	@Override
	public Double cost() {
		return this.icecream.cost() + 1.0;
	}
	


}
