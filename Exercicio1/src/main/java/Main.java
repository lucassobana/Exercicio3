import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione entre a porta e ou ou");

        // Entrada de dados
        String leitura = sc.nextLine();
        char var = leitura.charAt(0);

        // Mostrando a tabela da verdade
        if (var == 'e')
        {
            System.out.println("A B S \n0 0 0 \n0 1 0 \n1 0 0 \n1 1 1");
        }
        else
        {
            System.out.println("A B S \n0 0 0 \n0 1 1 \n1 0 1 \n1 1 1");
        }

        sc.close();
    }
}
