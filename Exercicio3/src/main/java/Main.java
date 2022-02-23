import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois numeros");

        // Variaveis dos numeros
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        // Escolha da operação
        System.out.println("Agora escolha a operacao a ser realizada \n 1 = soma 2 = subtração 3 = multiplicação 4 = divisão 5 = exponencial");
        int op = sc.nextInt();

        // Mostrando a operação
        switch (op){
            case 1:
            {
                System.out.println(num1 + num2);
                break;
            }
            case 2:
            {
                System.out.println(num1 - num2);
                break;
            }
            case 3:
            {
                System.out.println(num1 * num2);
                break;
            }
            case 4:
            {
                System.out.println(num1 / num2);
                break;
            }
            case 5:
            {
                System.out.println(Math.pow(num1,num2));
                break;
            }
        }

    }
}
