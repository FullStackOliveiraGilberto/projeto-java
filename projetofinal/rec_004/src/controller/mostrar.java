package controller;

import model.LerInt;
import util.Teclado;

public class mostrar {
	
   public static void main(String[] args) {
		
	   
	   
	   System.out.println("Digite as quatro notas do Aluno"); 
	   
		LerInt lerint = new LerInt();
		
		double valor1 = Teclado.lerDouble("Digite nota 1: ");
		lerint.setNota1(valor1); 
		double valor2 = Teclado.lerDouble("Digite nota 2: ");
		lerint.setNota2(valor2);
		double valor3 = Teclado.lerDouble("Digite nota 3: ");
		lerint.setNota3(valor3);
		double valor4 = Teclado.lerDouble("Digite nota 4: ");
		lerint.setNota4(valor4);
			
		
		//System.out.println(lerint.getMediaAlu());
		
		if(lerint.getMediaAlu() < 7) {
			
			 System.out.println("Aluno em Recuperação!!!"); 
			
			LerInt lerintrec = new LerInt();
			
			double valorr1 = Teclado.lerDouble("Digite nota de recuperação  1: ");
			lerintrec.setNotarec1(valorr1); 
			double valorr2 = Teclado.lerDouble("Digite nota de recuperação  2: ");
			lerintrec.setNotarec2(valorr2);
			double valorr3 = Teclado.lerDouble("Digite nota de recuperação  3: ");
			lerintrec.setNotarec3(valorr3);
			double valorr4 = Teclado.lerDouble("Digite nota de recuperação  4: ");
			lerintrec.setNotarec4(valorr4);
			
			
			
			System.out.println(lerintrec.toStringRecup()  );
			
		} else {
			
			
			System.out.println(lerint.toString());
			
		}
		
		
		
				
		
		
	}



}
