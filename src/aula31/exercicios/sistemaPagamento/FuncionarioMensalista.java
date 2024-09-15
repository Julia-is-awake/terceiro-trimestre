package aula31.exercicios.sistemaPagamento;

/**
 * Classe para os Funcionários Mensalistas.
 * @author Julia Sorgetz
 * @version 1.0
 * @since 15-09-2024
 */
public class FuncionarioMensalista extends Funcionario implements Pagamento{

    /**
     * Construtor para criar uma instância do Funcionário Mensalista.
     * @param nome nome do funcionário.
     * @param salarioBase salário base do funcionário.
     */
    public FuncionarioMensalista(String nome, float salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Processa o pagamento do funcionário, utilizando do método calcularSalario() para conseguir o valor do salário.
     */
    @Override
    public void processarPagamento() {
        float salarioTotal = calcularSalario();
        System.out.println("O salário do funcionário mensalista é R$"+salarioTotal+".");
    }

    /**
     * Método para calcular o salário do funcionário mensalista.
     * Apenas retorna o salário base, já que este é o salário do mensalista.
     * @return retorna em float o valor do salário do funcionário mensalista.
     */
    @Override
    public float calcularSalario() {
        return getSalarioBase();
    }
}
