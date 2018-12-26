package controller;

import model.Aluno;
import model.Professor;
import util.Teclado;

public class mostrar {
	
   public static void main(String[] args) {
		
		Aluno alu = new Aluno();
		Professor prof = new Professor();
		
		
		
		
		alu.setNome("Jose");
		alu.setIdade(100);
		alu.setSala("102b");
		
		
		prof.setNome("Marina");
		prof.setIdade(25);
		prof.setSala("202b");
		
		
		
		System.out.println(alu.toString());
		
		
		System.out.println(prof.toString());
		
	}



}
