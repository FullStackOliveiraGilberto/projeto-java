package model;

public class ItemDePedido {

	public int qtde;
	public double subtotal;
	
	
	public void mostrar(){
		
		//Mostrar usuário
		System.out.println("\n\nUsuário:\n");
		System.out.println("Quant: "     + this.qtde);
		System.out.println("Sub Total: " + this.subtotal);
		}
	

	public ItemDePedido(int qtde, double subtotal) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
	}
	
	public ItemDePedido(){
		super();
		//super faz referência à super classe.
		//Toda classe java é sub classe da classe Object.
		}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "ItenDePedido [qtde=" + qtde + ", subtotal=" + subtotal + ", getQtde()=" + getQtde() + ", getSubtotal()="
				+ getSubtotal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
