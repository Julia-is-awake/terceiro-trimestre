package aula31.exercicios.sistemaPagamento;

public abstract class Funcionario {
    private String nome;
    private float salarioBase;

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

    public abstract int calcularSalario();
}
