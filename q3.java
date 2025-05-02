import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        variavel
//        idade (inteiro em anos)
//        salario_mensal (float em mil reais)
//        tempo_emprego (inteiro em meses)
//        possui_dividas (booleano: true ou false)

//        Regras:
//                Se qualquer critério for inválido (idade < 18 ou > 100, salário < 0, tempo_emprego < 0), retorne "Dados inválidos".
//                Se possui_dividas for true e o tempo_emprego for menor que 12 meses, risco é "Alto".
//                Se o salario_mensal for menor que 2 e o tempo_emprego menor que 6, risco é "Alto".
//                Se a idade estiver entre 18 e 25 e o salario_mensal for menor que 3, risco é "Moderado".
//                Se a idade for maior que 60 e o tempo_emprego for menor que 24, risco é "Moderado".
//                Se possui_dividas for true mas tempo_emprego for acima de 36 meses, risco é "Moderado".
//                Se o salario_mensal for maior ou igual a 5 e o tempo_emprego maior ou igual a 36 e possui_dividas for false, risco é "Baixo".
//                Caso nenhuma condição acima seja satisfeita, retorne "Risco Indefinido".

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite o seu salário mensal(mil): ");
        double salario_mensal = sc.nextDouble();
        System.out.println("Digite o seu tempo de emprego(meses): ");
        int tempo_emprego = sc.nextInt();
        System.out.println("Possui dividas?");
        boolean possui_dividas = sc.nextBoolean();

        if (idade < 18 || idade > 100 || salario_mensal < 0 || tempo_emprego <0) {
            System.out.println("Inválido");
        } else if (possui_dividas && tempo_emprego < 12) {
            System.out.println("Risco alto");
        } else if (salario_mensal < 2 && tempo_emprego < 6) {
            System.out.println("Risco alto");
        } else if ((idade > 18 && idade < 25) && salario_mensal < 3 ) {
            System.out.println("Moderado");
        } else if (idade > 60 && tempo_emprego < 24) {
            System.out.println("Moderado");
        } else if (possui_dividas && tempo_emprego > 36) {
            System.out.println("Moderado");
        } else if (salario_mensal >= 5 && tempo_emprego >= 36) {
            System.out.println("Baixo");
        } else {
            System.out.println("Risco Indefinido");
        }

    }
}