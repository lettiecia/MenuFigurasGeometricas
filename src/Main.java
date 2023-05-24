import javax.swing.JOptionPane;

class Figuras {
    public void AreaCirculo() {
        double radio = 5.0;
        double area = Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + String.format("%.5f", area));
    }

    public void AreaCuadrado() {
        double lado = 7.0;
        double area = Math.pow(lado, 2);
        JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + String.format("%.5f", area));
    }

    public void AreaTriangulo() {
        double base = 6.0;
        double altura = 4.0;
        double area = (base * altura) / 2;
        JOptionPane.showMessageDialog(null, "El área del triángulo es: " + String.format("%.5f", area));
    }

    public void AreaRectangulo() {
        double base = 8.0;
        double altura = 5.0;
        double area = base * altura;
        JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + String.format("%.5f", area));
    }

    public void AreaEsfera() {
        double radio = 3.0;
        double area = 4 * Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El área de la esfera es: " + String.format("%.5f", area));
    }

    public void AreaCubo() {
        double arista = 4.0;
        double area = 6 * Math.pow(arista, 2);
        JOptionPane.showMessageDialog(null, "El área del cubo es: " + String.format("%.5f", area));
    }

    public void Resultado() {
        AreaCirculo();
        AreaCuadrado();
        AreaTriangulo();
        AreaRectangulo();
        AreaEsfera();
        AreaCubo();
    }
}

class Datos {
    private final Figuras figuras;

    public Datos() {
        figuras = new Figuras();
    }

    public void mostrarMenu() {
        int opcion;
        do {
            String input = JOptionPane.showInputDialog("---- Menú ----\n"
                    + "1. Calcular área del círculo\n"
                    + "2. Calcular área del cuadrado\n"
                    + "3. Calcular área del triángulo\n"
                    + "4. Calcular área del rectángulo\n"
                    + "5. Calcular área de la esfera\n"
                    + "6. Calcular área del cubo\n"
                    + "0. Salir\n"
                    + "Elige una opción:");
            opcion = Integer.parseInt(input);
            switch (opcion) {
                case 1:
                    figuras.AreaCirculo();
                    break;
                case 2:
                    figuras.AreaCuadrado();
                    break;
                case 3:
                    figuras.AreaTriangulo();
                    break;
                case 4:
                    figuras.AreaRectangulo();
                    break;
                case 5:
                    figuras.AreaEsfera();
                    break;
                case 6:
                    figuras.AreaCubo();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intenta nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }
}

public class Main {
    public static void main(String[] args) {
        Datos datos = new Datos();
        datos.mostrarMenu();
    }
}
