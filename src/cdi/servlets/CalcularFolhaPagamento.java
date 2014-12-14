package cdi.servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cdi.folhapagamento.CalculadoraFolhaPagamento;
import cdi.folhapagamento.Folha;
import cdi.folhapagamento.Funcionario;
import cdi.folhapagamento.FuncionarioBuilder;
import cdi.qualificadores.Simulador;

@WebServlet("/calcular-folha")
public class CalcularFolhaPagamento extends HttpServlet {
	
	@Inject
	@Simulador
	private CalculadoraFolhaPagamento calculadoraFolha;
	
	public CalcularFolhaPagamento(){
		System.out.println("Instanciando servlet CalcularFolhaPagamento...");
	}
	
	@PostConstruct
	public void ok(){
		System.out.println("CalcularFolhaPagamento pronta");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		FuncionarioBuilder builder = new FuncionarioBuilder();

		Funcionario f1 = builder.comSalarioBaseDe(1000.0).build();
		Funcionario f2 = builder.comSalarioBaseDe(2000.0).build();
		Funcionario f3 = builder.comSalarioBaseDe(3000.0).build();

		List<Funcionario> funcionarios = Arrays.asList(f1, f2, f3);

		System.out.println("Efetuando o cálculo...");

		Folha folha = calculadoraFolha.calculaFolha(funcionarios);
		
		//mensagem para o usuário
		resp.getOutputStream().print("Calculo da folha executado com sucesso");

		//saída no console
		System.out.println("Fim.");
	}

	
}
