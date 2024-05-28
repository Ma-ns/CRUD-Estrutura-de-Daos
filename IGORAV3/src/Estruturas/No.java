package Estruturas;

public class No<E> {
	E info;
	No<E> previous;
	No<E> next;
	
	public No(E info) {
		this.info=info;
		
		this.previous=null;
		this.next=null;
	}
}
