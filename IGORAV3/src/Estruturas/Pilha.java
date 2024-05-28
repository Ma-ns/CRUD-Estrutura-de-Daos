package Estruturas;

public class Pilha<E> {
	No<E> topo;
	No<E> base;
	
	public Pilha() {
		topo=base=null;
	}
	
	public boolean Vazia() {
		return base==null;
	}
	
	public void Empilhar(E item) {
		if(Vazia()) {
			base=topo=new No<E>(item);
		} else {
			topo.next=new No<E>(item);
			topo=topo.next;
		}
	}
	
	public E Desempilha() {
		if(Vazia()) {
			return null;
		}
		
		E item = topo.info;
		
		if (base == topo) {
			base=topo=null;
		} else {
			No<E> atual = base;
			
			while(atual.next!=topo) {
				atual=atual.next;
			}
			
			topo=atual;
			atual.next=null;
			
		}
	
}
