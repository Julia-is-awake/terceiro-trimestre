package aula31.exercicios.sistemaBiblioteca;

/**
 * Subclasse Revista que extende da classe Publicacao e implementa a interface Reservavel.
 * @author Julia Sorgetz Alves
 * @version 1.0
 * @since 18-09-2024
 */
public class Revista extends Publicacao implements Reservavel{
    /**
     * Empresta a revista.
     */
    public void emprestar(){
        System.out.println("A revista foi emprestada!");
    }

    /**
     * Devolve a revista.
     */
    public void devolver(){
        System.out.println("A revista foi devolvida!");
    }

    /**
     * Reserva a revista.
     */
    @Override
    public void reservar() {
        System.out.println("A revista foi reservada!");
    }
}
