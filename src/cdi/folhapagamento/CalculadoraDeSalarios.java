package cdi.folhapagamento;

public interface CalculadoraDeSalarios {

	double calculaSalario(Funcionario funcionario);
        void setTabelaDeReferenciaSalarial(TabelaDeReferenciaSalarial tabela);

}