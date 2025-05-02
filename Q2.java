import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaDeNotas = 0;
        boolean algumaZero = false;
        boolean alguma25 = false;
        boolean todasMaiorIgual20 = true;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            int nota = sc.nextInt();

            if (nota < 0 || nota > 25) {
                System.out.println("Inválido");
                return;
            }

            somaDeNotas += nota;

            if (nota == 0) {
                algumaZero = true;
            }

            if (nota == 25) {
                alguma25 = true;
            }

            if (nota < 20) {
                todasMaiorIgual20 = false;
            }
        }

        if (somaDeNotas < 50) {
            System.out.println("Aluno Reprovado");
        } else if (somaDeNotas <= 74 && !algumaZero) {
            System.out.println("Aluno Regular");
        } else if (somaDeNotas <= 89 && alguma25) {
            System.out.println("Aluno Bom");
        } else if (somaDeNotas >= 90 && todasMaiorIgual20) {
            System.out.println("Aluno Excelente");}}}
