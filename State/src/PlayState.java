
public class PlayState implements State {

	@Override
	public void doSomething(MusicState musicState) {
		musicState.setState(this);
	}
	
	public String toString() {
		return "Playing State";
	}

}
