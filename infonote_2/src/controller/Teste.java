package controller;

import model.*;

public class Teste {
	 
	public static void main(String[] args) {
		
		Usuario user = new Usuario(1, "joseph", "climber", "Joseph Climber","josephclimber@gmail.com","2222-3344");
		
		user.mostrar();
		
	
		Usuario Usu = new Usuario();
		Usu.setMatricula(1069);
		Usu.setLogin("Limam2");
		Usu.setSenha("1069");
		Usu.setNome("Marcos lima");
		Usu.setEmail("marcos_lima@hotmail");
		Usu.setTelefone("23257777");
		//System.out.println(Usu.toString());
		Usu.mostrar();
		
		Endereco End1 = new Endereco("rua santa sofia","452","apt 413","Tijca","Rj","RJ", null);
		
	    End1.mostrar();
		
		Endereco End = new Endereco();
		End.setLogradouro(" R. Santos Rodrigues");
		End.setNumero("94");		
		End.setComplemento("Apto 407");
		End.setBairro("Etacio");
		End.setCidade("Rio de Janeiro");
		End.setEstado("RJ");
		End.setCep("20250430");
		//System.out.println(End.toString());
		
		
		Pedido ped = new Pedido(422,"21/1/2019","Cartão",452.00,"perigo");
		ped.mostrar();
				
		ItemDePedido item = new ItemDePedido(400, 45.00);
	    item.mostrar();
		
		Notebook ntt = new Notebook(455, "Acer", "DEsktop sososos", 112, 3445.00, "sdadaasdadasd.gif", "01/01/2007");
		ntt.mostrar();
		Notebook ntt2 = new Notebook(500, "Appele", "DEsktop sososos", 112, 2345.00, "sdadaasdadasd.gif", "01/01/2007");
		ntt2.mostrar();
		Notebook ntt3 = new Notebook(455, "Dell", "NOTEBOOK", 112, 4555.00, "sdadaasdadasd.gif", "01/01/2007");
		ntt3.mostrar();
		
	    
				

					
	}
}