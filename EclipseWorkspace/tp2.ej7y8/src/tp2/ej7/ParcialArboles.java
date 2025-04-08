package tp2.ej7;

public class ParcialArboles {
	private BinaryTree<Integer> arbol = new BinaryTree<Integer>();
	
	public boolean isLeftTree (int num) {
		boolean cumple = false;
		BinaryTree<Integer> numeroBuscado = buscarSubArbol(this.arbol, num);
		if (numeroBuscado != null) {
			cumple = analizarHijos(numeroBuscado);
		}
		return cumple;
	}
	
	public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		boolean cumple = false;
		BinaryTree<Integer> subArbol = buscarSubArbol(arbol1, arbol2.getData());
		if (subArbol != null) {
			cumple = analizarValores(arbol1, subArbol);
		}
		return cumple;
	}
	
	
	
	
	public BinaryTree<Integer> buscarSubArbol (BinaryTree<Integer> nodo, int num) {
		if (nodo.getData().equals(num)) {
			return nodo;
		}
		if (nodo.hasLeftChild()) {
			buscarSubArbol(nodo.getLeftChild(), num);
		}
		if (nodo.hasRightChild()) {
			buscarSubArbol(nodo.getRightChild(), num);
		}
		return null;
	}
	
	public boolean analizarHijos(BinaryTree<Integer> nodo) {
		int ramaIzq = 0;
		int ramaDer = 0;
		if (nodo.hasLeftChild()) {
			if (!nodo.hasRightChild())
				ramaIzq++;
			analizarHijos(nodo.getLeftChild());
		}
		if (nodo.hasRightChild()) {
			if (!nodo.hasLeftChild())
				ramaDer++;
			analizarHijos(nodo.getRightChild());
		}
	    if (ramaIzq >= ramaDer) 
	    	return true;
	    else return false;
	}
	
	public boolean analizarValores (BinaryTree<Integer> nodo1, BinaryTree<Integer> nodo2) {
		boolean es = false;
		if (nodo1.getData().equals(nodo2.getData())) {
			if (nodo1.hasLeftChild() && (nodo2.hasLeftChild())){
				if (nodo1.getLeftChild().getData().equals(nodo2.getLeftChild().getData())){
					es = true;
					analizarValores(nodo1.getLeftChild(), nodo2.getLeftChild());
				}
			}
			if (nodo1.hasRightChild() && (nodo2.hasLeftChild())) {
				if (nodo1.getRightChild().getData().equals(nodo2.getRightChild().getData())){
					es = true;
					analizarValores(nodo1.getRightChild(), nodo2.getRightChild());
				}
			}
		}
		return es;
	}
	
	
}
