package cdi.folhapagamento;

import javax.enterprise.inject.Typed;

	@Typed({CalculadoraDeSalarios.class,
			CalculadoraDeSalariosPlano2013.class})
	public class CalculadoraDeSalariosPlano2013 implements CalculadoraDeSalarios {


	@Override
	public double calculaSalario(Funcionario funcionario) {

		double salario = funcionario.getCargo().getSalarioBase();

		return salario * 1.1;
	}

	@Override
	public void setTabelaDeReferenciaSalarial(TabelaDeReferenciaSalarial tabela) {
	}

}
