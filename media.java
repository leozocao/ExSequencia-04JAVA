import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double n1, n2, n3, n4, soma, media;

        System.out.print("Digite a primeira nota: ");
        n1 = teclado.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = teclado.nextDouble();
        System.out.print("Digite a terceira nota: ");
        n3 = teclado.nextDouble();
        System.out.print("Digite a quarta nota: ");
        n4 = teclado.nextDouble();

        soma = n1 + n2 + n3 + n4;
        media = soma / 4;

        System.out.print("A média das notas digitadas é: " + media);
    
        teclado.close();
    
    }

}