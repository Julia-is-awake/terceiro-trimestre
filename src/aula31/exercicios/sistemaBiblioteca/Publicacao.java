package aula31.exercicios.sistemaBiblioteca;

/**
 * Classe abstrata Publicacao.
 * @author Julia Sorgetz Alves
 * @version 1.0
 * @since 18-09-2024
 */
public abstract class Publicacao {
    /**
     * Atributo privado do tipo String para o titulo da publicação.
     */
    private String titulo;

    /**
     * Atributo privado do tipo String para o autor da publicação.
     */
    private String autor;

    /**
     * Atributo privado do tipo String para a data da publicação.
     */
    private String dataPublicacao;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    /**
     * Método abstrato para emprestar a publicação.
     */
    public void emprestar(){};

    /**
     * Método abstrato para devolver a publicação.
     */
    public void devolver(){};
}
