import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getNotas();
    }

    public static void getNotas() {

        Scanner escaneando = new Scanner(System.in);

        System.out.println("Digite \"OK\" para calcular: ");
        String resp = escaneando.next();

        while (resp.equals("OK")) {
            System.out.println("** Calculando média do aluno **");

            System.out.println("nota 1: ");
            double n1 = escaneando.nextDouble();

            System.out.println("nota 2: ");
            double n2 = escaneando.nextDouble();

            System.out.println("nota 3: ");
            double n3 = escaneando.nextDouble();

            System.out.println("nota 4: ");
            double n4 = escaneando.nextDouble();

            double[] notas = {n1, n2, n3, n4 };

            double m = calcMedia(notas);

            System.out.println("Media final é " + m);

            retornaStatus(m);

            System.out.println("Digite \"OK\" para ir de novo!");
            resp = escaneando.next();
        }

        System.out.println("Tmj!");
    }

    public static double calcMedia(double[] notas) {
        double media = 0;

        for (int i = 0; i < notas.length; i++){
            media += notas[i];
        }

        return media / 4;
    }

    public static void retornaStatus(double n) {
        if (n >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (n < 7 && n >= 5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}