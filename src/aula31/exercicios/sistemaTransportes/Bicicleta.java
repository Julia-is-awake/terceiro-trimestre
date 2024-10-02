package aula31.exercicios.sistemaTransportes;

/**
 * Classe para o Transporte Bicicleta.
 * @author Julia Sorgetz Alves
 * @version 1.0
 * @since 18-09-2024
 */
public class Bicicleta extends Transporte implements Combustivel{
    /**
     * Método para mover a bicicleta.
     */
    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo!");
    }

    /**
     * Método para parar a bicicleta.
     */
    @Override
    public void parar() {
        System.out.println("A bicicleta está parando...");
    }

    /**
     * Método para abastecer a bicicleta.
     */
    @Override
    public void abastecer() {
        System.out.println("A bicicleta está sendo abastecida!");
    }
}
