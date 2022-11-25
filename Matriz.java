package praticando;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter the value of the array: ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the values of the " + (i+1) + "°  row of the matrix: ");
			for(int u = 0; u < n; u++) {
				System.out.print("-> ");
				matriz[i][u] = sc.nextInt();
			}
		}
		int negatives = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("");
			for(int u = 0; u < n; u++) {
				System.out.print(matriz[i][u] + " | ");
				if(matriz[i][u] < 0) {
					negatives += 1;
				}
			}
				
		}
				
		System.out.println("\nMain diagonal: "); 
		for(int i = 0; i < n; i++) {
			System.out.print(matriz[i][i] + " | ");
		}
		System.out.println("\nNegatives numbers: " + negatives);
		
		
	
		sc.close();
		
	}
}
