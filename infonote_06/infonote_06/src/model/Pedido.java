package model;

import java.util.Arrays;

public class Pedido {

	@SuppressWarnings("unused")
	
	

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public ItemDePedido[] getItens() {
		return itens;
	}

	public void setItens(ItemDePedido[] itens) {
		this.itens = itens;
	}

	private String numeroPedido;
	private String dataEmissao;
	private String formaDePagamento;
	private double valorTotal;
	private String situacao;
	private Endereco enderecoEntrega;
	//private ItemDePedido itens  ;
	private ItemDePedido itens[] = new ItemDePedido[10];
	
	// public int cont= 0;

	

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void mostrar() {

		// Mostrar usuário - + cont + "\n"
		System.out.println(" \n Pedido: ");
		System.out.println(" numero: " + this.numeroPedido);
		System.out.println(" dataEmissao: " + this.dataEmissao);
		System.out.println(" formaDePagamento: " + this.formaDePagamento);
		System.out.println(" valorTotal: " + this.valorTotal);
		System.out.println(" E-situacao: " + this.situacao + "\n");
		// cont ++;
		System.out.println("\n\nItens do Pedido:\n");
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] != null) {
				itens[i].mostrar();
			}
		}
	}

	

	public Pedido(String numeroPedido, String dataEmissao, String formaDePagamento, double valorTotal, String situacao,
			Endereco enderecoEntrega, ItemDePedido[] itens) {
		super();
		this.numeroPedido = numeroPedido;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.valorTotal = valorTotal;
		this.situacao = situacao;
		this.enderecoEntrega = enderecoEntrega;
		this.itens = itens;
	}

	public Pedido() {
		super();

	}

	

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	

	
	
	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", dataEmissao=" + dataEmissao + ", formaDePagamento="
				+ formaDePagamento + ", valorTotal=" + valorTotal + ", situacao=" + situacao + ", enderecoEntrega="
				+ enderecoEntrega + ", itens=" + Arrays.toString(itens) + "]";
	}

	public boolean inserirItem(ItemDePedido item) {
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] == null) {
				itens[i] = item;
				return true;
			}
		}
		return false;

	}
	
	
}
