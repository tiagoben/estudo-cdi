package cdi.folhapagamento;

import java.util.List;

public class CalculadoraFolhaPagamentoReal implements CalculadoraFolhaPagamento {

	@Override
	public Folha calculaFolha(List<Funcionario> funcionarios) {

		System.out.println("Cálculo real");
		
		return null;
	}

}
