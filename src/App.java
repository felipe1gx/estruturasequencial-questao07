import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner console = new Scanner(System.in);
        Double base, altura, area, dobroarea;
        System.out.println("Digite a base do quadrado: ");
        base = console.nextDouble();
        System.out.println("Digite a altura do quadrado: ");
        altura = console.nextDouble();
        
        area = (base * altura);
        dobroarea = (area * 2);

        System.out.println("A área do quadrado é de: " + area + " e o dobro da área do quadrado é: " + dobroarea);
    }
}
