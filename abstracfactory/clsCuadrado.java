package abstracfactory;

public class clsCuadrado implements Ifigura {

    private float area;
    private float perimetro;
    private float lado;

    @Override
    public Float area() {
        return area = lado * lado;
    }

    @Override
    public Float perimetro() {
        return perimetro = lado * 4;
    }

    @Override
    public String descripcion() {
        area();
        perimetro();
        return "El Área Del Cuadrado Es De: \n" + area + " Y Su Perímetro Es: " + perimetro;
    }

    @Override
    public void inicio(float[] valores) {
            lado = valores[0];
    }

}
