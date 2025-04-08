package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		ArrayList<Integer> secuencia = new ArrayList<Integer>();
//		for (int i = 0; i < 4; i++) {
//			System.out.println("Ingrese un numero");
//			secuencia.add(s.nextInt());
//		}
//		System.out.println(secuencia.toString());
		incisoD();
	}
	
	public static void incisoD() {
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		Estudiante e1 = new Estudiante("Lando", "Norris", "2B", "lnorr@gmail.com", "Calle 4");
		Estudiante e2 = new Estudiante("Oscar", "Piastri", "3B", "op@gmail.com", "Calle 5");
		Estudiante e3 = new Estudiante("George", "Russell", "4A", "gruss@gmail.com", "Calle 3");
		estudiantes.add(e1);
		estudiantes.add(e2);
		estudiantes.add(e3);
		ArrayList<Estudiante> estudiantesCopia = new ArrayList<Estudiante>();
		ArrayList<Estudiante> estudiantesCopia2 = new ArrayList<Estudiante>();
		estudiantesCopia = estudiantes;
		estudiantesCopia2 = new ArrayList<Estudiante>(estudiantes);
		for (Estudiante est: estudiantes) {
			System.out.println(est.tusDatos());		
		}
		System.out.println("");
		for (Estudiante est: estudiantesCopia) {
			System.out.println(est.tusDatos());		
		}
		System.out.println("");
		for (Estudiante est: estudiantesCopia2) {
			System.out.println(est.tusDatos());		
		}
		System.out.println("");
		Estudiante e4 = new Estudiante("Yuki", "Tsunoda", "5C", "tsunoda@gmail.com", "Calle 7");
		estudiantes.remove(2);
		estudiantes.add(e4);
		for (Estudiante est: estudiantes) {
			System.out.println(est.tusDatos());		
		}
		System.out.println("");
		for (Estudiante est: estudiantesCopia) {
			System.out.println(est.tusDatos());		
		}
		System.out.println("");
		for (Estudiante est: estudiantesCopia2) {
			System.out.println(est.tusDatos());		
		}
	}

}
