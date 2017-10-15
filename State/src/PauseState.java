
public class PauseState implements State {

	@Override
	public void doSomething(MusicState musicState) {
		musicState.setState(this);
	}
	
	public String toString() {
		return "Pause State";
	}


}
