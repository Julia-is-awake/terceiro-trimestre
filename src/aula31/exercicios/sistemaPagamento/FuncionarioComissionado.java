package aula31.exercicios.sistemaPagamento;

import java.util.Scanner;

/**
 * Classe para os Funcionários Comissionados.
 * @author Julia Sorgetz
 * @version 1.0
 * @since 15-09-2024
 */
public class FuncionarioComissionado extends Funcionario implements Pagamento{
    Scanner ler = new Scanner(System.in);

    /**
     * Construtor para criar uma instância do Funcionário Comissionado.
     * @param nome nome do funcionário.
     * @param salarioBase salário base do funcionário.
     */
    public FuncionarioComissionado(String nome, float salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Processa o pagamento do funcionário, utilizando do método calcularSalario() para conseguir o valor do salário.
     */
    @Override
    public void processarPagamento() {
        float salarioTotal = calcularSalario();
        System.out.println("O salário do funcionário comissionado é R$"+salarioTotal+".");
    }

    /**
     * Método para calcular o salário do funcionário comissionado.
     * Soma o salário base ao produto do valor de vendas com a taxa de comissão.
     * @return retorna em float o valor do salário do funcionário comissionado.
     */
    @Override
    public float calcularSalario() {
        System.out.print("Valor das vendas: ");
        float valorVendas = ler.nextFloat();
        System.out.print("Taxa de comissão: ");
        float taxaComissao = ler.nextFloat();
        return getSalarioBase() + (valorVendas * taxaComissao);
    }
}
