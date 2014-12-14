package cdi.folhapagamento;

import static cdi.qualificadores.PlanoDeCargos.*;
import java.util.List;

import cdi.qualificadores.Simulador;

	@Simulador(planoDeCargos = VERSAO_2013, planoAprovado = false)
	public class SimuladoraCalculoFolhaPagamentoPlano2013 implements
			CalculadoraFolhaPagamento {
	
		@Override
		public Folha calculaFolha(List<Funcionario> funcionarios) {
			System.out.println("Simulação com plano de 2013");
			return null;
		}
	
	}
