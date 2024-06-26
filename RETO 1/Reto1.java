import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

class Reto1 {


    private final Scanner scanner = new Scanner(System.in);

    /**
    * Este metodo es usado para solicitar datos al usuario
    * @return  Lectura de la siguiente linea del teclado
    */
    public String read() {
        return this.scanner.nextLine();
    }


    public void run() {
        // Leer la entrada usando el metodo read()
        String input = read();
        
        // Dividir el texto en palabras
        String[] words = input.split("\\s+");
        
        // Calcular el numero total de palabras
        int totalWords = words.length;
        
        // Calcular el numero de palabras unicas
        Set<String> uniqueWords = new HashSet<>();
        int totalLength = 0;
        
        for (String word : words) {
            uniqueWords.add(word);
            totalLength += word.length();
        }
        
        int uniqueWordCount = uniqueWords.size();
        
        // Calcular la longitud promedio de las palabras
        double averageWordLength = (double) totalLength / totalWords;
        
        // Mostrar los resultados
        System.out.println(totalWords);
        System.out.println(uniqueWordCount);
        System.out.printf("%.2f\n", averageWordLength);
    }

    public static void main(String[] args) {
        new Reto1().run();
    }
}
