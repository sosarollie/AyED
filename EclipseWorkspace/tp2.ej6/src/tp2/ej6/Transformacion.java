package tp2.ej6;

public class Transformacion {
	private BinaryTree<Integer> arbol = new BinaryTree<Integer>();
	
	public BinaryTree<Integer> suma (){
		BinaryTree<Integer> clon = new BinaryTree<Integer>(); //declaro arbol clon
		sumaPosOrden(clon, arbol);
		return clon;
	}
	
	public Transformacion(BinaryTree<Integer> arbol) {
		this.arbol = arbol; 
	}
	
	public void sumaPosOrden (BinaryTree<Integer> clon, BinaryTree<Integer> nodo) {
		int suma = 0;
		if (nodo.hasLeftChild()) {
			BinaryTree<Integer> proximoClon = new BinaryTree<Integer>(); //proximo nodo
			clon.addLeftChild(proximoClon);
			sumaPosOrden(proximoClon, nodo.getLeftChild());
			suma +=  nodo.getData();
		}
		if (nodo.hasRightChild()) {
			BinaryTree<Integer> proximoClon = new BinaryTree<Integer>(); //proximo nodo
			clon.addRightChild(proximoClon);
			sumaPosOrden(proximoClon, nodo.getRightChild());
			suma += nodo.getData();
		}
		clon.setData(suma);
	}
	
	public static void main (String[] args) {
        BinaryTree<Integer> arbol = new BinaryTree<Integer>(4);
        arbol.addLeftChild(new BinaryTree<Integer>(2));
        arbol.addRightChild(new BinaryTree<Integer>(6));
        arbol.getLeftChild().addLeftChild(new BinaryTree<Integer>(1));
        arbol.getLeftChild().addRightChild(new BinaryTree<Integer>(3));
        arbol.getRightChild().addLeftChild(new BinaryTree<Integer>(5));
        arbol.getRightChild().addRightChild(new BinaryTree<Integer>(8));
        
        System.out.println("Arbol original");
        System.out.println();
        arbol.imprimirPreorden();
        System.out.println();
        System.out.println();
        System.out.println("--------------------");
        Transformacion trasformacion = new Transformacion(arbol);
        BinaryTree<Integer> arbolTransformado = trasformacion.suma();
        System.out.println();
        System.out.println("Arbol transformado");
        System.out.println();
        arbolTransformado.imprimirPreorden();
    }
	
	
}
