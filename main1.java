package proyecto2;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arreglo1 = {{1,2,3},{4,5,6}};
		int[][] arreglo2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("los valores en arreglo1 por filas son");
		imprimirArreglo(arreglo1);
		
		System.out.println("\nLos valores en arreglo2 por filas son");
		imprimirArreglo(arreglo2);
		
		System.out.println("Los valores en arreglo_2(potencia) por filas son");
		modificarArreglo(arreglo2);
		imprimirArreglo(arreglo2);
		
	}

	public static void imprimirArreglo(int[][]arreglo)
	{
		for(int fila=0; fila< arreglo.length; fila++) {
			for (int columna =0; columna < arreglo[fila].length; columna++)
				System.out.printf("%d ", arreglo[fila][columna]);
	
		System.out.println();
		}
	}
	public static void modificarArreglo(int[][]arreglo)
	{
		for (int fila = 0; fila < arreglo.length; fila++) {
			for (int columna = 0; columna < arreglo[fila].length; columna++)

				arreglo [fila][columna] *=arreglo[fila][columna];
			}
		System.out.println();
		}
	public static void modificacion1Arreglos(int[][]arreglo)
	{
		int cont=0;
		for(int fila=0; fila <arreglo.length; fila ++) {
			for(int columna = 0 ; columna<arreglo[fila].length;columna ++) {
				arreglo[fila][columna]*= arreglo[fila][columna];
				
				if(cont!=columna) {
					arreglo[fila][columna]=0;
				}
			}
		}
	}
}