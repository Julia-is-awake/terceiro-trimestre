package aula31.exercicios.sistemaBiblioteca;

/**
 * Subclasse Jornal que extende da classe Publicacao e implementa a interface Reservavel.
 * @author Julia Sorgetz Alves
 * @version 1.0
 * @since 18-09-2024
 */
public class Jornal extends Publicacao implements Reservavel{
    /**
     * Empresta o jornal.
     */
    public void emprestar(){
        System.out.println("O jornal foi emprestado!");
    }

    /**
     * Devolve o jornal.
     */
    public void devolver(){
        System.out.println("O jornal foi devolvido!");
    }

    /**
     * Reserva o jornal.
     */
    @Override
    public void reservar() {
        System.out.println("O jornal foi reservado!");
    }
}