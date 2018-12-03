package model;

import java.util.Arrays;

public class Cliente extends Usuario {

	private String codigoCliente;
	private String nome;
	private String email;
	private String Telefone;
	private Endereco enderecos[] = new Endereco[10];
	private Pedido pedidos[] = new Pedido[10]; 
		
	
	public String getCodigoCliente() {
		return codigoCliente;
	}


	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return Telefone;
	}


	public void setTelefone(String telefone) {
		Telefone = telefone;
	}


	
	public Endereco[] getEnderecos() {
		return enderecos;
	}


	public void setEnderecos(Endereco[] enderecos) {
		this.enderecos = enderecos;
	}


	public Pedido[] getPedidos() {
		return pedidos;
	}


	public void setPedidos(Pedido[] pedidos) {
		this.pedidos = pedidos;
	}


	public Cliente(String login, String senha, int tipo, String codigoCliente, String nome, String email,
			String telefone, Endereco endereco, Pedido[] pedidos) {
		super(login, senha, tipo);
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.email = email;
		Telefone = telefone;
		
		//insere na posição zero do vetor o endereço residencial 
 	 	inserirEndereco(endereco); 

		//this.enderecos = enderecos;
		//this.pedidos = pedidos;
	}
	
	//inserir o pedido no vetor  	
	public boolean inserirPedido(Pedido pedido){ 
	 	for (int i = 0; i < pedidos.length; i++){ 
	 	 	if (pedidos[i] == null) { 
	 	 	 	pedidos[i] = pedido;  	 	 	 	
	 	 	 	return true;  	 	 	} 
	 	} 
	 	return false; 
	} 
	
	//inserir o endereço no vetor  	
	public boolean inserirEndereco(Endereco end){ 
	 	for (int i = 0; i < enderecos.length; i++){ 
	 	 	if (enderecos[i] == null){ 
	 	 	 	enderecos[i] = end;  	 	 	 	
	 	 	 	return true; 
	 	 	} 
	 	} 
	 	return false; 
	}


	@Override 
 	public String toString(){  	 	
		final String ENTER = "\n"; 
 	 	String retValue = ""; 
 	 	 
 	 	retValue = "Informações sobre o cliente:" + ENTER + 
 	 	super.toString()+ 
 	 	"Código do Cliente: " + codigoCliente + ENTER + 
 	 	"Nome: " + nome + ENTER +  
 	 	"E-mail: " + email + ENTER +  
 	 	"Telefone: " + Telefone + ENTER +  
 	 	"Endereco: " + enderecos[0]; 
 	 	 
 	 	return retValue; 
 	} 
 
	
	
	
	
	
}
