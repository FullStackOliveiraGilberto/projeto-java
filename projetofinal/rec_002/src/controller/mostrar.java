package controller;

import model.LerInt;
import util.Teclado;

public class mostrar {
	
   public static void main(String[] args) {
		
		LerInt lerint = new LerInt();
		
		int valorA = Teclado.LerInt("Digite o numero 1: ");
		
		int valorB = Teclado.LerInt("Digite o Valor 2: ");
		
		lerint.setValorA(valorA);
		lerint.setValorB(valorB);
		
		
		
		System.out.println(lerint.toString());
				
		
		
	}



}
