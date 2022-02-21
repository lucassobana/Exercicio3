import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float peso = sc.nextFloat();
        float altura = sc.nextFloat();
        float IMC;

        IMC = peso / (altura * altura);

        if (IMC < 18.5){
            System.out.println("abaixo do peso");
        }
        else if (IMC >= 18.6 || IMC <= 24.9) {
            System.out.println("Peso ideal (parabens)");
        }
        else if (IMC >= 25.0 || IMC <= 29.9) {
            System.out.println("Levemente acima do peso");
        }
        else if (IMC >= 30.0 || IMC <= 34.9) {
            System.out.println("Obesidade grau 1");
        }
        else if (IMC >= 35.0 || IMC <= 39.9) {
            System.out.println("Obesidade grau 2 (severa)");
        }
        else {
            System.out.println("Obesidade grau 3 (morbida)");
        }
        sc.close();
    }

}
