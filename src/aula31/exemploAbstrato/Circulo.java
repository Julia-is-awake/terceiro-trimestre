package aula31.exemploAbstrato;

public class Circulo extends Figura{
    private double raio;

    public Circulo(){
        setNomeFigura("Circulo");
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea(){
        return Math.PI*Math.pow(raio, 2);
    }

    @Override
    public double calculaPerimetro(){
        return 2*Math.PI*raio;
    }
}
