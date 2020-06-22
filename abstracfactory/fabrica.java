package abstracfactory;

public class fabrica {

    public static Ifigura fabricar(String fig) {
        switch(fig)
        {   
            case "circulo":
                return new clsCirculo();
            case "cuadrado":
                return new clsCuadrado();
            case "rectangulo":
                return new clsRectangulo();
            case "triangulo":
                return new clsTriangulo();
            default:
                   return null;
        }
    }

}
