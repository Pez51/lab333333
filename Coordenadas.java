package proyecto2;

import java.util.*;

public class Coordenadas {
	public static void main(String[] args) {
		 
		 Scanner sn = new Scanner(System.in);
	
		 int matriz[][] = new int[4][4];

		 boolean salir = false;
		 int opcion, fila,columna;

		 boolean rellenado = false;

		 do {

			 System.out.println("Menu");
			 System.out.println("1. Rellenar Matriz");
			 System.out.println("2. Sumar fila");
			 System.out.println("3. Salir");
			 System.out.println("4. Sumar columna");
			 System.out.println("Elije una opcion: ");
			 opcion = sn.nextInt();
			 switch (opcion) {
				 case 1:
					 rellenarMatriz(sn, matriz);

					 rellenado = true;
					 break;
				 case 2:
					 if (rellenado) {

						 do {
							 System.out.println("Elige una fila");
							 fila = sn.nextInt();
						 } while (!(fila >= 0 && fila < matriz.length));
						 System.out.println("La suma de los valores de la fila " + fila
								 + " es: " + sumaFila(matriz, fila));
					 } else {
						 System.out.println("Debes rellenar la matriz primero");
					 }
					 break;
				 case 3:
					 salir = true;
					 break;
				 case 4:
					 if (rellenado) {

						 do {
							 System.out.println("Elige una columna :D");
							 columna = sn.nextInt();
						 } while (!(columna >= 0 && columna < matriz.length));
						 System.out.println("La suma de los valores de la columna " + columna
								 + " es: " + sumaColumna(matriz,columna));
					 } else {
						 System.out.println("Debes rellenar la matriz primero");
					 }
					 break;
					 
				 default:
					 System.out.println("Tienes que meter un valor entre 1 y 7");
			 }
		 } while (!salir);
		 System.out.println("Se termino el programa :D");
	}
		private static String sumaColumna(int[][] matriz, int columna) {
		// TODO Auto-generated method stub
		return null;
	}
		public static void rellenarMatriz(Scanner sn, int[][] matriz) {
			 for (int i = 0; i < matriz.length; i++) {
				 for (int j = 0; j < matriz[0].length; j++) {
				 System.out.println("Escribe un numero en la posicion " + i + " " + j);
				 matriz[i][j] = sn.nextInt();
				 }
			 }
		 }
		 
		 public static int sumaFila(int[][] matriz, int fila) {
			 int suma = 0;
			 for (int j = 0; j < matriz.length; j++) {
				 suma += matriz[fila][j];
			 }
			 return suma;
		 }

}
