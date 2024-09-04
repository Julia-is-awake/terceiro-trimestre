package aula31.exemploAbstrato;

public class Retangulo extends Figura{
    private double base;
    private double altura;

    public Retangulo(){
        setNomeFigura("Retangulo");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return base*altura;
    }

    @Override
    public double calculaPerimetro() {
        return (base+altura)*2;
    }
}
