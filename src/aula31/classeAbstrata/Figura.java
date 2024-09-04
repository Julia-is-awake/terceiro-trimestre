package aula31.classeAbstrata;

public abstract class Figura {
    public String nomeFigura;

    public String getNomeFigura(){
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }

    public abstract double calculaArea();

    public abstract double calculaPerimetro();

    public String toStrig(){
        String retorno = "Nome: "+nomeFigura;
        retorno+="\nÁrea: " +calculaArea();
        retorno+="\nPerímetro: "+calculaPerimetro();
        return retorno;
    }
}
