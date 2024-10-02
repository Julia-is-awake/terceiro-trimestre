package aula31.exercicios.sistemaTransportes;

/**
 * Classe para o Transporte Aviao.
 * @author Julia Sorgetz Alves
 * @version 1.0
 * @since 18-09-2024
 */
public class Aviao extends Transporte implements Combustivel{
    /**
     * Método para mover o aviao.
     */
    @Override
    public void mover() {
        System.out.println("O avião está se movendo!");
    }

    /**
     * Método para parar o aviao.
     */
    @Override
    public void parar() {
        System.out.println("O avião está parando...");
    }

    /**
     * Método para abastecer o aviao.
     */
    @Override
    public void abastecer() {
        System.out.println("O avião está sendo abastecido");
    }
}
