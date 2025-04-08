package tp2.ej6;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public void imprimirPreorden() {
		System.out.println(this.getData() + "//");
		if (this.hasLeftChild()) {
			this.getLeftChild().imprimirPreorden();
		}
		if (this.hasRightChild()) {
			this.rightChild.imprimirPreorden();
		}
	}
	
	public  int contarHojas() {
	   int cantHojas = 0;
	   if (this.isLeaf()) {
		  return 1;
	   }
	   else {
	   if (this.hasLeftChild())
		   cantHojas = cantHojas + this.leftChild.contarHojas();
	   if (this.hasRightChild())
		   cantHojas = cantHojas + this.rightChild.contarHojas();
	   }
	   return cantHojas;
	}		
    	 
    public BinaryTree<T> espejo(){
	   BinaryTree<T> espejo = new BinaryTree<T>(this.data);    
	   if (this.hasLeftChild()) {
		   espejo.addRightChild(this.leftChild);
	   }
	   if (this.hasRightChild()) {
		   espejo.addLeftChild(this.rightChild);
	   }
 	   return espejo;
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		Queue<BinaryTree<T>> queue = new LinkedList<>();
		queue.offer(this);
		queue.offer(null); //marca
		int cantNiveles = 1;
		while ((!queue.isEmpty()) && (cantNiveles <= m)) {
			BinaryTree<T> ab = queue.poll();
			if (ab != null) {
				if (cantNiveles >=m) {
					System.out.println(ab.getData() + " ");
				}
				if (ab.hasLeftChild()) {
					queue.offer(ab.getLeftChild());
				}
				if (ab.hasRightChild()) {
					queue.offer(ab.getRightChild());
				}
			} else if (!queue.isEmpty()) {
				cantNiveles++;
				queue.offer(null);
			}
		}
		
		
   }
		
}

