package aula31.exercicios.sistemaPagamento;

import java.util.Scanner;

/**
 * Classe para os Funcionários Horistas.
 * @author Julia Sorgetz
 * @version 1.0
 * @since 15-09-2024
 */
public class FuncionarioHorista extends Funcionario implements Pagamento{

    /**
     * Construtor para criar uma instância do Funcionário Comissionado.
     * @param nome nome do funcionário.
     * @param salarioBase salário base do funcionário.
     */
    public FuncionarioHorista(String nome, float salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Processa o pagamento do funcionário, utilizando do método calcularSalario() para conseguir o valor do salário.
     */
    @Override
    public void processarPagamento() {
        float salarioTotal = calcularSalario();
        System.out.println("O salário do funcionário horista é R$"+salarioTotal+".");
    }

    /**
     * Método para calcular o salário do funcionário horista.
     * Soma o salário base com o produto das horas trabalhadas pelo funcionário com o valor ganho por hora trabalhada.
     * @return retorna em float o valor do salário do funcionário horista.
     */
    @Override
    public float calcularSalario() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Horas trabalhadas pelo funcionário: ");
        float horasTrabalhadas = ler.nextFloat();
        System.out.println("Valor ganho por hora trabalhada: ");
        float valorHora = ler.nextFloat();
        return getSalarioBase() + (valorHora * horasTrabalhadas);
    }
}
