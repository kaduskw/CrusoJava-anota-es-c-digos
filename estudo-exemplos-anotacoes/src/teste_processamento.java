import java.util.Locale;

public class teste_processamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		int a,c;
		double resultado;
		
		a = 5;
		c = 2;
		
		resultado = a/c;
		
		System.out.println(resultado);
		
		//como avisar o compilador que vc quer que o resultado mostre as casas decimais (casting) conversao explicita dos valores
		
		resultado = (double) a/c;
		
		System.out.println(resultado);
		
		double d;
		int e;
		
		d = 5.0;
		e = (int) d;
		
		System.out.println(e);

	}

}
