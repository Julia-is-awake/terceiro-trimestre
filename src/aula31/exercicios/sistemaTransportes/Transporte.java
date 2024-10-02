package aula31.exercicios.sistemaTransportes;

/**
 * Classe abstrata para o transporte.
 * @author Julia Sorgetz Alves
 * @version 1.0
 * @since 18-09-2024
 */
public abstract class Transporte {
    /**
     * Atributo tipo private para a capacidade do transporte.
     */
    private int capacidade;

    /**
     * Atributo tipo private para a velocidade máxima do transporte.
     */
    private int velocidadeMaxima;

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /**
     * Método abstrato para mover o transporte.
     */
    public abstract void mover();

    /**
     * Método abstrato para parar o transporte.
     */
    public abstract void parar();
}
