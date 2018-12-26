package controller;

import model.LerInt;
import util.Teclado;

public class mostrar {
	
   public static void main(String[] args) {
		
		LerInt lerint = new LerInt();
		
		int valorA = Teclado.LerInt("Digite um Valor A: ");
		
		int valorB = Teclado.LerInt("Digite um Valor b: ");
		
		lerint.setValorA(valorA);
		lerint.setValorB(valorB);
		
		
		
		System.out.println(lerint.toString());
				
		System.out.println(lerint.trocarA());
		
		System.out.println(lerint.trocarB());
		
		System.out.println(lerint.valTrocados());
		
	}



}
