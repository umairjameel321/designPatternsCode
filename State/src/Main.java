public class Main {
	public static void main(String[] args) {
		MusicState musicState = new MusicState();
		
		PlayState playState = new PlayState();
		playState.doSomething(musicState);
		
		System.out.println(musicState.getState());
		
		PauseState pauseState = new PauseState();
		pauseState.doSomething(musicState);
		
		System.out.println(musicState.getState());
	}
}
