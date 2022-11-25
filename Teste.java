package praticando;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> employeeList = new ArrayList<>();
		
		System.out.println("How many employees vwill be registred? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, salary, name);
			
			employeeList.add(emp);
			}
			
			System.out.print("Enter the employee id that will have salary increase: ");
			int x = sc.nextInt();
			for(int i = 0; i < employeeList.size(); i++) {
				if (employeeList.get(i).getId() == x) {
					System.out.print("report the percentage increase: ");
					double percentage = sc.nextDouble();
					double valorAumento = (employeeList.get(i).getSalary() * percentage) / 100; 
					employeeList.get(i).setSalary(employeeList.get(i).getSalary() + valorAumento);
					System.out.printf("New salary: %.2f", employeeList.get(i).getSalary());
					break;
				}else {
					System.out.println("This id does not exist!");
				}
			}
			
			for(Employee y : employeeList) {
				System.out.println(y);
			}
	
		sc.close();
		
	}
}
