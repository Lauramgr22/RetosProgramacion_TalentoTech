import java.util.Scanner;

class Reto2 {

    private final Scanner scanner = new Scanner(System.in);

    public String read() {
        return this.scanner.nextLine();
    }

    public String convertirANumeroRomano(int numero) {
        String[] miles = {"", "M", "MM", "MMM"};
        String[] centenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] decenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        String resultado = miles[numero / 1000] +
                           centenas[(numero % 1000) / 100] +
                           decenas[(numero % 100) / 10] +
                           unidades[numero % 10];
        
        return resultado;
    }

    public void run() {
        // Read the integer number from input
        int numero = Integer.parseInt(read());
        
        // Convert the number to Roman numeral
        String numeroRomano = convertirANumeroRomano(numero);
        
        // Display the result
        System.out.println(numeroRomano);
    }

    public static void main(String[] args) {
        new Reto2().run();
    }
}
