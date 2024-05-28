package Perfis;

public class Consumidores {
	Consumidor inicio;
	
	public Consumidores() {
		this.inicio = null;
	}
	
	public void inserir(int id, String nome, String email) {
		if(this.inicio==null) {
			this.inicio = new Consumidor(id, nome, email);
		} else {
			Consumidor atual = this.inicio;
			
			while(atual.next!=null) {
				atual=atual.next;
			}
			
			atual.next = new Consumidor(id, nome, email);
		}
	}
}
