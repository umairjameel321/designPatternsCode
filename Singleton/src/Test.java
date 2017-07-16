public class Test {
	public static void main(String[] args) {
		Settings setting = Settings.getObject();
		System.out.println("Color: " + setting.getColor());
		System.out.println("Font: " + setting.getFont());
		
	}
}
