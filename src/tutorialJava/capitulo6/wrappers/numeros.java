package tutorialJava.capitulo6.wrappers;

public class numeros {

	private static int n = 1;

	public numeros() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		for (;n <= 100; n++) {
		
			System.out.println(Integer.toHexString(n));
		
		}
	}
}
