import java.util.Scanner;

 public class IMC {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca su peso en kilogramos ");
        double peso = input.nextDouble();

        System.out.print("Introduzca su altura en metros ");
        double altura = input.nextDouble();

        double resultado = calcularIMC(peso, altura);
        System.out.printf("Su indice de masa corporal es de %s", resultado);

    }
    public static double calcularIMC(double peso, double altura) {
        double imc = peso / (Math.pow(2, altura));
        return imc;
    }
}