package tp2.ejercicio2;

public class ej2 {

	public static void main(String[] args) {
		BinaryTree<Integer> a1 = new BinaryTree<Integer>(50);
		BinaryTree<Integer> a2 = new BinaryTree<Integer>(31);
		BinaryTree<Integer> a3 = new BinaryTree<Integer>(22);
		BinaryTree<Integer> a4 = new BinaryTree<Integer>(10);
		BinaryTree<Integer> a5 = new BinaryTree<Integer>(7);
		BinaryTree<Integer> a6 = new BinaryTree<Integer>(3);
		a1.addRightChild(a2);
		a1.addLeftChild(a3);
		a3.addLeftChild(a5);
		a5.addLeftChild(a6);
		a5.addRightChild(a4);
		BinaryTree<Integer> espejo = new BinaryTree<Integer>();
		espejo = a1.espejo();
		a1.imprimirPreorden();
		System.out.println("");
		espejo.imprimirPreorden();	
	}

}
