
package abstracfactory;

public class clsTriangulo implements Ifigura{

    private float area;
    private float perimetro;
    private float base;
    private float altura;
    
    @Override
    public Float area() {
        return area = ((base * altura) / 2); 
    }

    @Override
    public Float perimetro() {
       return perimetro = base * 3;
    }

    @Override
    public String descripcion() {
        area();
        perimetro();
        return "El Área Del Triangulo Es De: \n" + area + " Y Su Perímetro Es: " + perimetro;
    }

    @Override
    public void inicio(float[] valores) {
        base = valores[0];
        altura = valores[1];
    }

   
    
}
