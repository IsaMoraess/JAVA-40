import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //Calcule a hipotenusa de um triângulo retângulo usando os lados a e b fornecidos pelo usuário
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor do lado  a: ");
    double ladoA = sc.nextDouble();

    System.out.println("Digite o valor do lado b: ");
    double ladoB = sc.nextDouble();

    double hipotenusa = Math.sqrt(ladoA * ladoA + ladoB * ladoB);

    System.out.println("A hipotenusa de um trigualo retanhulo e: " +hipotenusa);
    }
}
