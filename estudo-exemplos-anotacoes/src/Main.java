import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products");
		System.out.println(product1 + " wich price is " + price1);
		System.out.println(product2 + ", wich price is " + price2);
		System.out.printf("Record : %d years old, code %d and gender : %s", age, code, gender);
		System.out.println("\nMeasure with eigh decimal places: " + measure);
		System.out.printf("Rouded (three decimal places) : %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point : %.3f%n ", measure );
		
		
	}

}
