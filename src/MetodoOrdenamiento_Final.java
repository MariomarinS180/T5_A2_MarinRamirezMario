import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
class Ordenar {
	static class Burbuja{
		static long tInicio, tfin;
		int cont = 0; 
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
		static long tInicio2, tfin2;
		public static void ordenarBurbujaDos(int numeros[]) {
			tInicio2 = System.nanoTime();
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
			tfin2 = System.nanoTime();
		}//ordenar burbuja dos
		static long tInicio3, tfin3; 
		public static void ordenarBurbujaTres(int numeros[]) {
			tInicio3 = System.nanoTime(); 
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
		tfin3 = System.nanoTime();
		}//ordenar burbuja 3
	}//class burbuja 
	
	public void mostrarVector (int vector[]) {
		System.out.println(Arrays.toString(vector));
	}//mostrarVector
}//class ordenar
public class MetodoOrdenamiento{
	public static void main (String [] args) {
		Scanner e = new Scanner(System.in);
		Ordenar or = new Ordenar();
		byte opc = e.nextByte(); 
		System.out.println("Elija de qué tamaño desea hacer las pruebas:\n1)1,000\n2)10,000\n3)100,000\n4)1,000,000");
		opc = e.nextByte(); 
		do {
			switch (opc) {
		case 1: 
			int mil [] = new int[1000];
			System.out.println("LLenando vector con Mil números...");
			for (int i = 0; i < mil.length; i++) {
			mil[i] = new Random().nextInt(); 
			}
			System.out.println("Llenado finalizado...");
			int milCopia[] = mil.clone(); 
			System.out.println("=====================");
			System.out.println("Vector desordenado: ");
			or.mostrarVector(mil);
			Ordenar.Burbuja.ordenarBurbujaUno(mil);
			System.out.println("Vector ORDENADO por BURBUJA 1: ");
			or.mostrarVector(mil);
			System.out.println("Tiempo de ejecucion --> " + (Ordenar.Burbuja.tfin - Ordenar.Burbuja.tInicio) + " Nanosegundos");
			System.out.println("=================================================");
			System.out.println("Vector desordenado: ");
			or.mostrarVector(milCopia);
			Ordenar.Burbuja.ordenarBurbujaDos(milCopia);
			System.out.println("Vector ORDENADO por BURBUJA 2: ");
			or.mostrarVector(milCopia);
			System.out.println("Tiempo de ejecucion --> " + (Ordenar.Burbuja.tfin2 - Ordenar.Burbuja.tInicio2) + " Nanosegundos");
			System.out.println("=================================================");
			System.out.println("Vector desordenado: ");
			or.mostrarVector(milCopia);
			Ordenar.Burbuja.ordenarBurbujaTres(milCopia);
			System.out.println("Vector ORDENADO por BURBUJA 3: ");
			System.out.println("Tiempo de ejecucion --> " + (Ordenar.Burbuja.tfin3 - Ordenar.Burbuja.tInicio3) + " Nanosegundos");
			or.mostrarVector(milCopia);
			break;
		case 2:
			int diezMil [] = new int[10000];
			System.out.println("LLenando vector con Diez mil de números...");
			for (int i = 0; i < diezMil.length; i++) {
				diezMil[i] = new Random().nextInt(); 
			}
			System.out.println("Llenado finalizado...");
			int diezMilCopia[] = diezMil.clone(); 
			System.out.println("=====================");
			System.out.println("Vector desordenado: ");
			or.mostrarVector(diezMil);
			Ordenar.Burbuja.ordenarBurbujaUno(diezMil);
			System.out.println("Vector ORDENADO por BURBUJA 1: ");
			or.mostrarVector(diezMil);
			System.out.println("Tiempo de ejecucion --> " + (Ordenar.Burbuja.tfin - Ordenar.Burbuja.tInicio) + " Nanosegundos");
			System.out.println("=================================================");
			System.out.println("Vector desordenado: ");
			or.mostrarVector(diezMilCopia);
			Ordenar.Burbuja.ordenarBurbujaDos(diezMilCopia);
			System.out.println("Vector ORDENADO por BURBUJA 2: ");
			or.mostrarVector(diezMilCopia);
			System.out.println("Tiempo de ejecucion --> " + (Ordenar.Burbuja.tfin2 - Ordenar.Burbuja.tInicio2) + " Nanosegundos");
			System.out.println("=================================================");
			System.out.println("Vector desordenado: ");
			or.mostrarVector(diezMilCopia);
			Ordenar.Burbuja.ordenarBurbujaTres(diezMilCopia);
			System.out.println("Vector ORDENADO por BURBUJA 3: ");
			System.out.println("Tiempo de ejecucion --> " + (Ordenar.Burbuja.tfin3 - Ordenar.Burbuja.tInicio3) + " Nanosegundos");
			or.mostrarVector(diezMilCopia);
			break; 
		case 3:
			int cienMil [] = new int[100000];
			System.out.println("LLenando vector con cien mil de números...");
			for (int i = 0; i < cienMil.length; i++) {
				cienMil[i] = new Random().nextInt(); 
			}
			System.out.println("Llenado finalizado...");
			int cienMilCopia[] = cienMil.clone(); 
			System.out.println("=====================");
			System.out.println("Vector desordenado: ");
			or.mostrarVector(cienMil);
			Ordenar.Burbuja.ordenarBurbujaUno(cienMil);
			System.out.println("Vector ORDENADO por BURBUJA 1: ");
			or.mostrarVector(cienMil);
			System.out.println("Tiempo de ejecucion --> " + (Ordenar.Burbuja.tfin - Ordenar.Burbuja.tInicio) + " Nanosegundos");
			System.out.println("=================================================");
			System.out.println("Vector desordenado: ");
			or.mostrarVector(cienMilCopia);
			Ordenar.Burbuja.ordenarBurbujaDos(cienMilCopia);
			System.out.println("Vector ORDENADO por BURBUJA 2: ");
			or.mostrarVector(cienMilCopia);
			System.out.println("Tiempo de ejecucion --> " + (Ordenar.Burbuja.tfin2 - Ordenar.Burbuja.tInicio2) + " Nanosegundos");
			System.out.println("=================================================");
			System.out.println("Vector desordenado: ");
			or.mostrarVector(cienMilCopia);
			Ordenar.Burbuja.ordenarBurbujaTres(cienMilCopia);
			System.out.println("Vector ORDENADO por BURBUJA 3: ");
			or.mostrarVector(cienMilCopia);
			System.out.println("Tiempo de ejecucion --> " + (Ordenar.Burbuja.tfin3 - Ordenar.Burbuja.tInicio3) + " Nanosegundos");
			break;
		case 4:
			int millon [] = new int[1000000];
			System.out.println("LLenando vector con un millón de números...");
			for (int i = 0; i < millon.length; i++) {
				millon[i] = new Random().nextInt(); 
			}
			System.out.println("Llenado finalizado...");
			int millonCopia[] = millon.clone(); 
			System.out.println("=====================");
			System.out.println("Vector desordenado: ");
			or.mostrarVector(millon);
			Ordenar.Burbuja.ordenarBurbujaUno(millon);
			System.out.println("Vector ORDENADO por BURBUJA 1: ");
			or.mostrarVector(millon);
			System.out.println("Tiempo de ejecucion --> " + (Ordenar.Burbuja.tfin - Ordenar.Burbuja.tInicio) + " Nanosegundos");
			System.out.println("=================================================");
			System.out.println("Vector desordenado: ");
			or.mostrarVector(millonCopia);
			Ordenar.Burbuja.ordenarBurbujaDos(millonCopia);
			System.out.println("Vector ORDENADO por BURBUJA 2: ");
			or.mostrarVector(millonCopia);
			System.out.println("Tiempo de ejecucion --> " + (Ordenar.Burbuja.tfin2 - Ordenar.Burbuja.tInicio2) + " Nanosegundos");
			System.out.println("=================================================");
			System.out.println("Vector desordenado: ");
			or.mostrarVector(millonCopia);
			Ordenar.Burbuja.ordenarBurbujaTres(millonCopia);
			System.out.println("Vector ORDENADO por BURBUJA 3: ");
			or.mostrarVector(millonCopia);
			System.out.println("Tiempo de ejecucion --> " + (Ordenar.Burbuja.tfin3 - Ordenar.Burbuja.tInicio3) + " Nanosegundos");
			break;
		case 5: System.out.println("Salió...");
			break; 
		default: System.out.println("No está en la Lista.");
			break;
			}
			     } while (opc != 5);
		
		/*
		 * 1) Object.clone()
		 * 2) System.arrayCopy
		 * 3) Arrays.copyOf(array, long)
		 * 4) Arrays.copyOfRange(array, long)
		 */
	
		//Tiempo de ejecucion -->
		//Cantidad de pasadas o recorridos -->
		//Cantidad de comparaciones -->
		//Cantidad de intercambios -->
	   
	}//main
}//class


