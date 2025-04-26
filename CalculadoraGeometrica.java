import java.util.Scanner;

public class CalculadoraGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionFigura;
        int opcionOperacion;

        System.out.println("Bienvenido a la Calculadora Geométrica");
        System.out.println("--------------------------------------");
        System.out.println("Seleccione una figura:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        System.out.print("Opción: ");
        opcionFigura = scanner.nextInt();

        System.out.println("\nSeleccione una operación:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");
        System.out.print("Opción: ");
        opcionOperacion = scanner.nextInt();

        switch (opcionFigura) {
            case 1: // Círculo
                System.out.print("\nIngrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                if (opcionOperacion == 1) {
                    System.out.println("Área del círculo: " + (Math.PI * radio * radio));
                } else {
                    System.out.println("Perímetro del círculo (circunferencia): " + (2 * Math.PI * radio));
                }
                break;

            case 2: // Cuadrado
                System.out.print("\nIngrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                if (opcionOperacion == 1) {
                    System.out.println("Área del cuadrado: " + (lado * lado));
                } else {
                    System.out.println("Perímetro del cuadrado: " + (4 * lado));
                }
                break;

            case 3: // Triángulo
                if (opcionOperacion == 1) {
                    System.out.print("\nIngrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("Área del triángulo: " + (base * altura / 2));
                } else {
                    System.out.print("\nIngrese el primer lado del triángulo: ");
                    double lado1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo lado del triángulo: ");
                    double lado2 = scanner.nextDouble();
                    System.out.print("Ingrese el tercer lado del triángulo: ");
                    double lado3 = scanner.nextDouble();
                    System.out.println("Perímetro del triángulo: " + (lado1 + lado2 + lado3));
                }
                break;

            case 4: // Rectángulo
                System.out.print("\nIngrese la base del rectángulo: ");
                double baseRect = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double alturaRect = scanner.nextDouble();
                if (opcionOperacion == 1) {
                    System.out.println("Área del rectángulo: " + (baseRect * alturaRect));
                } else {
                    System.out.println("Perímetro del rectángulo: " + (2 * (baseRect + alturaRect)));
                }
                break;

            case 5: // Pentágono regular
                if (opcionOperacion == 1) {
                    System.out.print("\nIngrese el perímetro del pentágono: ");
                    double perimetroPent = scanner.nextDouble();
                    System.out.print("Ingrese el apotema del pentágono: ");
                    double apotemaPent = scanner.nextDouble();
                    System.out.println("Área del pentágono: " + (perimetroPent * apotemaPent / 2));
                } else {
                    System.out.print("\nIngrese la longitud de un lado del pentágono: ");
                    double ladoPent = scanner.nextDouble();
                    System.out.println("Perímetro del pentágono: " + (5 * ladoPent));
                }
                break;

            default:
                System.out.println("Opción inválida.");
                break;
        }

        scanner.close();
    }
}
