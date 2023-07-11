import java.util.Scanner;

public class SecretMessageDecoder {
	public int decodeCharacter(char ch){
		return (int)ch;
		

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a character:");
		char character = scan.next().charAt(0);
		
		
		SecretMessageDecoder decoder= new SecretMessageDecoder();
		int unicode = decoder.decodeCharacter(character);
		
		System.out.println("the uniqcodeof "+ character + " is: " + unicode);
		scan.close();
	}
	

}
