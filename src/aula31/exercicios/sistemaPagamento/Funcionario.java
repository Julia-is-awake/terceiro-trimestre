package aula31.exercicios.sistemaPagamento;

/**
 * Classe abstrata para os Funcionários.
 * @author Julia Sorgetz
 * @version 1.0
 * @since 15-09-2024
 */
public abstract class Funcionario {
    /**
     * Atributo do tipo String para o nome do funcionário.
     */
    private String nome;

    /**
     * Atributo do tipo float para o salário base do funcionário.
     */
    private float salarioBase;

    /**
     * Construtor abstrato para criar uma instância do funcionário.
     * @param nome o nome do funcionário.
     * @param salarioBase o salário base do funcionário.
     */
    public Funcionario(String nome, float salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Método abstrato para calcular o salário do funcionário.
     * @return retorna o valor do salário do funcionário em float.
     */
    public abstract float calcularSalario();
}
