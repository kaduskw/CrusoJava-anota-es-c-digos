import java.util.Scanner;

public class operacoesStrings {
	
	//public static void main(String[] args) {
		
		//String original = "abc DEF Ahi jAl     ";
		
		//String s01 = original.toLowerCase();
		//String s02 = original.toUpperCase();
		//String s03 = original.trim();
		//String s04 = original.substring(2);
		//String s05 = original.substring(2, 9);
		
		//System.out.println("Original -" + original + "-");
		//System.out.println("toLowerCase -" + s01 + "-");
		//System.out.println("toUpperCase -" + s02 + "-");
		//System.out.println("trim -" + s03 +"-");
		//System.out.println("substring -" + s04 + "-");
		//System.out.println("substring -" + s05 + "-");
		
	//}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
		
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		
		if(x > y && x > z) {
			aux = x;
		}else if(y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = "+ value);
	}

}
