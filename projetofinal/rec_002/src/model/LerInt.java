package model;

public class LerInt {

	public int valorA;
	public int valorB;

	public int getValorA() {
		return valorA;
	}

	public void setValorA(int valorA) {
		this.valorA = valorA;
	}

	public int getValorB() {
		return valorB;
	}

	public void setValorB(int valorB) {
		this.valorB = valorB;
	}

	@Override
	public String toString() {

		String conclusao;
		if (valorA == valorB) {
			conclusao = "ValorA igual ValorB";

		} else {

			if (valorA > valorB) {

				conclusao = "ValorA maior que ValorB";
			} else {

				conclusao = "ValorA menor que ValorB";

			}
			
		

		}

		return "Conclusao " + conclusao + " \r[valorA=" + valorA + ", valorB=" + valorB + "]";
	}

	public String valTrocados() {
		return "Valores [valorA=" + getValorB() + ", valorB=" + getValorA() + "]";
	}

	public String trocarA() {

		int NvalorA = getValorB();

		return "Novo Valor de A: " + NvalorA;
	}

	public String trocarB() {

		int NvalorB = getValorA();

		return "Novo Valor de B: " + NvalorB;
	}

}
