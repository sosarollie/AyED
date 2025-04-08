package tp1.ejercicio2;

public class Contador {
	
public int[] contar (int n) {
	int arreglo[] = new int[n];
	for (int i = 0; i < n; i++) {
		 arreglo[i] = n*(i+1);
	}
	return arreglo;
}

}
