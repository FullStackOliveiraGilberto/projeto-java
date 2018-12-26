package model;

public class LerInt {

	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;
	public double mediaAlu;
	public double notarec1;
	public double notarec2;
	public double notarec3;
	public double notarec4;
	public double mediaAlurec;
	
	
	
	
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public double getNotarec1() {
		return notarec1;
	}

	public void setNotarec1(double notarec1) {
		this.notarec1 = notarec1;
	}

	public double getNotarec2() {
		return notarec2;
	}

	public void setNotarec2(double notarec2) {
		this.notarec2 = notarec2;
	}

	public double getNotarec3() {
		return notarec3;
	}

	public void setNotarec3(double notarec3) {
		this.notarec3 = notarec3;
	}

	public double getNotarec4() {
		return notarec4;
	}

	public void setNotarec4(double notarec4) {
		this.notarec4 = notarec4;
	}

	public double getMediaAlu() {

		double mediaAlu = (nota1 + nota2 + nota3 + nota4) / 4;

		return mediaAlu;
	}
	
	public double getMediaAlurec() {
		double mediaAlurec = (notarec1 + notarec2 + notarec3 + notarec4) / 4;
		
		return mediaAlurec;
	}

	public void setMediaAlurec(double mediaAlurec) {
		this.mediaAlurec = mediaAlurec;
	}
	

	public void setMediaAlu(double mediaAlu) {
		this.mediaAlu = mediaAlu;
	}

	@Override
	public String toString() {
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		String situacaoAluno;
		if (media >= 7) {

			situacaoAluno = "Aprovado";
		} else {

			situacaoAluno = "Em Recuperação";

		}
		return "Aluno " + situacaoAluno + "\r Media: " + media + " [nota1=" + nota1 + ", nota2=" + nota2 + ", nota3="
				+ nota3 + ", nota4=" + nota4 + "]";
	}

	public String toStringRecup() {

		double mediarec = (getNotarec1() + getNotarec2() + getNotarec3() + getNotarec4()) / 4;

	//	System.out.println(getMediaAlurec());
		
		
		String situacaoAluno;
		
		if (mediarec >= 7) {

			situacaoAluno = "Recuperado/Aprovado!";
		} else {

			situacaoAluno = "Nãorecuperado/Reprovado!";

		}
		return "Aluno  " + situacaoAluno + "\r Media: " + mediarec + " [nota1=" + notarec1 + ", nota2=" + notarec2 + ", nota3="	+ notarec3 + ", nota4=" + notarec4 + "]";
	}

	
}
