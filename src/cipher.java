import java.util.Scanner;

public class cipher {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter the Shift Amount: ");
		int ShiftAmount = scanner1.nextInt();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter the plaintext: ");
		String plaintext = scanner2.nextLine();
		
		String ciphertext = encrypt(plaintext, ShiftAmount);
		
		System.out.println(ciphertext);
	}
	
	public static final String str = "abcdefghijklmnopqrstuvwxyz";

	public static String encrypt (String plaint, int key) {
		plaint = plaint.toLowerCase();
		String ciphert = "";
		for (int i = 0; i < plaint.length(); i++) {
			int charpos = str.indexOf(plaint.charAt(i));
			int keyval = (charpos + key) % 26;
			char replaceval = str.charAt(keyval);
			ciphert = ciphert + replaceval;
			}
		return ciphert; 
	}
}
