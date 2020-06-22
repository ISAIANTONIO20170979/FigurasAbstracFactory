package abstracfactory;

public class clsRectangulo implements Ifigura {

    private float area;
    private float perimetro;
    private float base;
    private float altura;

    @Override
    public void inicio(float[] valores) {
        base = valores[0];
        altura = valores[1];
    }

    @Override
    public Float area() {
        return area = base * altura;
    }

    @Override
    public Float perimetro() {
        return perimetro = ((base * 2) + (altura * 2));
    }

    @Override
    public String descripcion() {
        area();
        perimetro();
        return "El Área Del Rectangulo Es De: \n" + area + " Y Su Perímetro Es: " + perimetro;
    }

}
