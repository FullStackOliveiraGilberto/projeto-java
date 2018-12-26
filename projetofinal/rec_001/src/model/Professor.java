package model;

public class Professor {
	
	public String Nome;
	public int Idade;
	public String Sala;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public String getSala() {
		return Sala;
	}
	public void setSala(String sala) {
		Sala = sala;
	}
	@Override
	public String toString() {
		return "Professor [Nome=" + Nome + ", Idade=" + Idade + ", Sala=" + Sala + "]";
	}
	
	

}
