import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Ordenar {
	static class Burbuja{
		static long tInicio, tfin;
		public static void ordenarBurbujaUno(int numeros[]) {
			tInicio = System.nanoTime(); 
			for (int i = 1; i < numeros.length; i++) {
				for (int j = 0; j < numeros.length -i; j++) {
					if(numeros[j]>numeros[j+1]) {
						int aux = numeros[j];
						numeros[j] = numeros[j+1];
						numeros[j+1] = aux; 
					}
				}
			}
			tfin = System.nanoTime();
		}//ordenar burbuja uno
		
		
		public static void ordenarBurbujaDos(int numeros[]) {
			int i = 1;
			boolean ordenado = false;
			while ((i < numeros.length) || (ordenado == false)) {
				i = i + 1;
				ordenado = true;
				for (int j = 0; j < numeros.length - i; j++) {
					if (numeros[j] > numeros[j + 1]) {
						ordenado = false;
						int aux = numeros[j];
						numeros[j] = numeros[j + 1];
						numeros[j + 1] = aux;
					}
				}
			}
		}//ordenar burbuja dos
		
		public static void ordenarBurbujaTres(int numeros[]) {
			int i = 1;
			boolean ordenado = true;
			do {
				i = i + 1;
				for (int j = 0; j < numeros.length - i; j++) {
					if (numeros[j] < numeros[j + 1]) {
						ordenado = false;
						int aux = numeros[j];
						numeros[j] = numeros[j + 1];
						numeros[j + 1] = aux;
					}
				}
			} while (i < numeros.length || ordenado == true);
		}//ordenar burbuja 3
	}//class burbuja 
	
	public void mostrarVector (int vector[]) {
		System.out.println(Arrays.toString(vector));
	}//mostrarVector
}//class ordenar
public class MetodoOrdenamiento{
	public static void main (String [] args) {
		
		/*
		 * 1) Object.clone()
		 * 2) System.arrayCopy
		 * 3) Arrays.copyOf(array, long)
		 * 4) Arrays.copyOfRange(array, long)
		 */
		
		
		Ordenar or = new Ordenar(); 
		//Generar aleatoriamente 1 millon de números. 
		int datos[] = {30, 200, 6, 10, 65, 70, 150, 4, 200, 1}; 
		int datosCopia[] = datos.clone(); 
		/*int millon [] = new int[1000];
		System.out.println("LLenando vector con Mil de números...");
		for (int i = 0; i < millon.length; i++) {
		millon[i] = new Random().nextInt(); 
		}
		System.out.println("Llenado finalizado...");
		*/
		
		System.out.println("Vector desordenado:");
		or.mostrarVector(datos);
			
		Ordenar.Burbuja.ordenarBurbujaUno(datos);
		System.out.println("Vector ordenado por BURBUJA 1: ");
		or.mostrarVector(datos);
		System.out.println("Tiempo de ejecucion --> " + (Ordenar.Burbuja.tfin - Ordenar.Burbuja.tInicio) + " Nanosegundos");
		System.out.println("===================================================");
		System.out.println("Vector desordenado:");
		or.mostrarVector(datosCopia);
		Ordenar.Burbuja.ordenarBurbujaDos(datosCopia);
		System.out.println("Vector ordenado por BURBUJA 2: ");
		or.mostrarVector(datosCopia);
		System.out.println("===================================================");
		System.out.println("Vector desordenado:");
		or.mostrarVector(datosCopia);
		Ordenar.Burbuja.ordenarBurbujaTres(datosCopia);
		System.out.println("Vector ordenado por BURBUJA 3: ");
		or.mostrarVector(datosCopia);
		
		//Tiempo de ejecucion -->
		//Cantidad de pasadas o recorridos -->
		//Cantidad de comparaciones -->
		//Cantidad de intercambios -->
	
	}//main
}//class


