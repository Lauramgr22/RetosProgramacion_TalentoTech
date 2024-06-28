import java.util.ArrayList;
import java.util.Scanner;

class Reto1 {

    private final Scanner scanner = new Scanner(System.in);

    public String read() {
        return this.scanner.nextLine();
    }

    public void run() {
        // Leer la cantidad de estudiantes
        int cantidadEstudiantes = Integer.parseInt(read());
        
        // Crear una lista para almacenar las estaturas
        ArrayList<Double> estaturas = new ArrayList<>();
        
        // Leer las estaturas de los estudiantes
        for (int i = 0; i < cantidadEstudiantes; i++) {
            estaturas.add(Double.parseDouble(read()));
        }
        
        // Calcular la media de las estaturas
        double suma = 0;
        for (double estatura : estaturas) {
            suma += estatura;
        }
        double media = suma / cantidadEstudiantes;
        
        // Contar cuantos estudiantes estan por encima y por debajo de la media
        int porEncima = 0;
        int porDebajo = 0;
        for (double estatura : estaturas) {
            if (estatura > media) {
                porEncima++;
            } else if (estatura < media) {
                porDebajo++;
            }
        }
        
        // Mostrar los resultados
        System.out.println(estaturas);
        System.out.printf("%.2f\n", media);
        System.out.println(porEncima);
        System.out.println(porDebajo);
    }

    public static void main(String[] args) {
        new Reto1().run();
    }
}
