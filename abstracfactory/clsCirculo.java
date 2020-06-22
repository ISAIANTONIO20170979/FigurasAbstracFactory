
package abstracfactory;

public class clsCirculo implements Ifigura {

    private float radio;
    private float area;
    private float perimetro;

    @Override
    public void inicio(float[] valores) {
       radio = valores[0];
    }
    
    @Override
    public Float area() {
        return area = (float) (3.1416 * radio);
    }

    @Override
    public Float perimetro() {
        return perimetro = (float) ((2*3.1416) * radio);
    }

    @Override
    public String descripcion() {
        
        area();
        perimetro();
        return "El Área Del Criculo Es De: \n"+area+" Y Su Perímetro Es: "+perimetro;
                
    }

    
    
    
    
}
