package praticando;

import java.util.Scanner;

public class Matriz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values of the array! ");
		System.out.println("Number of lines: ");
		int n = sc.nextInt();
		System.out.println("Amount of columns");
		int m = sc.nextInt();
		
		int[][] matriz = new int[n][m];
		
		for(int i = 0; i < matriz.length; i++) {
			System.out.println((i + 1) + "° Line");
			
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("What number do you want to search? ");
		int number = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(matriz[i][j] == number) {
					System.out.println("Position " + i + ", " + j + ":");
					if (j > 0  ) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
						
					}
					if(j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if(i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);	
					}
				}
			}
		}
		
		
	
		sc.close();
		
	}
}
