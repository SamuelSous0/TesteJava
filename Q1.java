import java.util.Scanner;

public class Q1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado A:");
        int A = sc.nextInt();
        System.out.println("Digite o lado B");
        int B = sc.nextInt();
        System.out.println("Digite o lado C");
        int C = sc.nextInt();
        // Equilátero (todos os lados iguais),
        // Isósceles (dois lados iguais),
        // Escaleno (todos os lados diferentes).
        // a < b + c
        // b < a + c
        // c < a + b
        // // Três números inteiros positivos a, b e c.
        if(A<B+C && B<A+C && C<A+B) {
            if(A==B && A==C&& C==B) {
                System.out.println("Esse triângulo é Equilátero");
            } else if((A==B && A!=C)||(B==C && C!=A)||(C==A && C!=B)) {
                System.out.println("Esse triângulo é Isósceles");
            } else {
                System.out.println("Esse triângulo é Escaleno");
            }
        } else{
            System.out.println("Triângulo inválido");
        }
      


    }
}
