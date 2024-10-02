package aula31.exercicios.sistemaTransportes;

/**
 * Classe para o Transporte Carro.
 * @author Julia Sorgetz Alves
 * @version 1.0
 * @since 18-09-2024
 */
public class Carro extends Transporte implements Combustivel{
    /**
     * Método para mover o carro.
     */
    @Override
    public void mover() {
        System.out.println("O carro está se movendo!");
    }

    /**
     * Método para parar o carro.
     */
    @Override
    public void parar() {
        System.out.println("O carro está parando...");
    }

    /**
     * Método para abastecer o carro.
     */
    @Override
    public void abastecer() {
        System.out.println("O carro está sendo abastecido!");
    }
}
