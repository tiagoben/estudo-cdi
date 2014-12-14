package cdi.folhapagamento;

import java.util.List;

import cdi.qualificadores.Simulador;

	@Simulador
	public class SimuladoraCalculoFolhaPagamento implements
			CalculadoraFolhaPagamento {
	
		@Override
		public Folha calculaFolha(List<Funcionario> funcionarios) {
			System.out.println("Apenas uma simulação da folha de pagamentos");
			return null;
		}
	
	}
