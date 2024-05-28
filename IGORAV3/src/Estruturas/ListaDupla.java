package Estruturas;

public class ListaDupla<E> {
	No<E> inicio;
	
	public ListaDupla(){ 
		this.inicio=null;
	}
	
	public boolean Vazia() { //Verifica se a lista possui informações
		return inicio==null;
	}
	
	public void Inserir(E info) { //Inicializador de Lista Duplamente Encadeada
		if(this.inicio==null) {
			this.inicio=new No<E>(info);
		} else {
			No<E> atual = this.inicio;
			
			while(atual.next!=null) {
				atual = atual.next;
			}
			
			No<E> novo = new No<E>(info);
			
			atual.next = novo;
			novo.previous = atual;
		}
	}
	
	
}
