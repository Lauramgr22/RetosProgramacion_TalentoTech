import java.util.Scanner;

class Reto2{

    /**
    *  Este debe ser el unico objeto de tipo Scanner en el codigo
    */
    private final Scanner scanner = new Scanner(System.in);

    /**
    * Este metodo es usado para solicitar datos al usuario
    * @return  Lectura de la siguiente linea del teclado
    */
    public String read(){
        return this.scanner.nextLine();
    }

    /**
    * metodo principal
    */
    public void run(){
        // Leer el numero de compras anteriores
        int numeroCompras = Integer.parseInt(read());
        
        // Leer el monto total de la compra actual
        double montoTotal = Double.parseDouble(read());
        
        // Calcular el descuento
        double[] descuentos = calcularDescuento(numeroCompras, montoTotal);
        
        // Mostrar los resultados con dos decimales
        System.out.printf("%.1f\n", descuentos[0]);  // Descuento base
        System.out.printf("%.2f\n", descuentos[1]);  // Descuento adicional
        System.out.printf("%.2f\n", descuentos[2]);  // Total descuento
    }

    /**
    * Metodo para calcular el descuento basado en el numero de compras y el monto total
    * @param numeroCompras Numero de compras anteriores
    * @param montoTotal Monto total de la compra actual
    * @return Un arreglo con el descuento base, el descuento adicional y el total descuento
    */
    public double[] calcularDescuento(int numeroCompras, double montoTotal) {
        double descuentoBase = 5.0;
        double descuentoAdicional = Math.min(numeroCompras * 2.0, 15.0);
        double totalDescuento = (descuentoBase + descuentoAdicional) * montoTotal / 100.0;
        
        return new double[]{descuentoBase, descuentoAdicional, totalDescuento};
    }

    public static void main(String[] args) {
        new Reto2().run();
    }
}