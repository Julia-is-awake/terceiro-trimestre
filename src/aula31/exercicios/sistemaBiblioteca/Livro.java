package aula31.exercicios.sistemaBiblioteca;

/**
 * Subclasse Livro que extende da classe Publicacao e implementa a interface Reservavel.
 * @author Julia Sorgetz Alves
 * @version 1.0
 * @since 18-09-2024
 */
public class Livro extends Publicacao implements Reservavel{
    /**
     * Empresta o livro.
     */
    public void emprestar(){
        System.out.println("O livro foi emprestado!");
    }

    /**
     * Devolve o livro.
     */
    public void devolver(){
        System.out.println("O livro foi devolvido!");
    }

    /**
     * Reserva o livro.
     */
    @Override
    public void reservar() {
        System.out.println("O livro foi reservado!");
    }
}