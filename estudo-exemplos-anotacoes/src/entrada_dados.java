import java.util.Scanner;
import java.util.Locale;

public class entrada_dados {
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int y;
		double z;
		char a;
		String x;
		
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		a = sc.next().charAt(0);
		
		// sysout + ctrl + espaco para digita automatico
		
		System.out.println("Voce digitou : " + x);
		System.out.println("Voce digitou : " + y);
		System.out.println("Voce digitou : " + z);
		System.out.println("Voce digitou : " + a);
		
		// Para digitar varios dados na mesma linha
		
		System.out.println("Dados digitados :");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		
		
		
		
		//Usar essa função para desalocar o objeto
		sc.close();

	}

}
