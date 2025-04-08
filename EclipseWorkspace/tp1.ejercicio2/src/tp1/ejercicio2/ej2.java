package tp1.ejercicio2;
import java.util.Scanner;
public class ej2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Contador c = new Contador();
		int cant = s.nextInt();
		s.close();
		int res[] = c.contar(cant);
		for (int i=0; i < cant; i++) {
			System.out.print(" | " + res[i] + " | ");
		}
	}

}
