package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeList;

public class ProgramList1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Instanciamos o Objeto criado no Array list, agora está apontando os endereços
		// de memoria

		List<EmployeeList> list = new ArrayList<>();

		// Parte 01, vamos ler todos os dados.

		System.out.print("How many employees will be registred? ");
		int n = sc.nextInt();

		// Lendo os dados dos empregados, vamos usar um for de laço para ler e um while
		// verificando se ja existe o ID.

		for (int i = 1; i <= n; i++) {
			
			
			System.out.println();
			System.out.println("Employee " + i + ": ");
			System.out.print("ID: ");
			int id = sc.nextInt();
			
			
			// Agora essa função no laço While para verificar se ja foi usado o numero de ID, a função
			// está no final do programa.
			
			
			while (hasId(list, id)) {
				
				System.out.print("Id already taken, please try again!");
				id = sc.nextInt();
				
			}

			System.out.print("Name: ");
			sc.nextLine(); // Usamos outro par limpar o Buffer de entrada
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			list.add(new EmployeeList(id, name, salary)); // Passamos pro objeto usando list.add, os dados coletados
			
		}
		
		//Parte 02, vamos aumentar o Salario do funcionario de acordo com seu ID.
		
		System.out.println();
		System.out.print("Enter the employee ID that will have salary increase: ");
		int id = sc.nextInt(); //Podemos usar de novo ID porque esta fora do laço de cima.
		
		EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);//Verificando se o ID existe
		
		if(emp == null) {
			System.out.println("This ID does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();            //depois de verificado, passamos a porcentagem pra função dentro do objeto
			emp.increasySalary(percentage);
		}
		
		//Parte 03, agora vamos listar todos os empregados, inclusive com o escolhido para aumento de salário.
		
		System.out.println();// Pulamos uma linha
		System.out.print("----------------------------------/------------------------------------");
		System.out.println();// Pulamos uma linha
		System.out.println("List of Employees:");
		System.out.println();// Pulamos uma linha
		
		 for(EmployeeList obj : list) {           //Vamos usar um laço 'forEach' para percorrer o objeto(função toString ira imprimir)
			System.out.println(obj);
		}
		sc.close();
	}

	// Essa função retorna null se o ID não foi usado, ela retorna 1 se existir
	// ID ja usado.
	
	public static boolean hasId(List<EmployeeList> list, int id) {
		EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
