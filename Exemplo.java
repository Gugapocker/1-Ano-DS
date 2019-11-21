import java.util.Scanner;

public class Exemplo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 1, n, n2;
		System.out.println("Digite um número");
		n = ler.nextInt();
		n2 = n;
		while (i < n) {
			n2 = n2 * i;
			i = i + 1;
		}
		System.out.println("O fatorial de " + n + " é: " + n2);
	}

}
