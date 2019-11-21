import java.util.Scanner;
public class Teste {
	public static void main(String[] args) {
	int n1 , n2 , result;
	Scanner ler = new Scanner (System.in);
	
	System.out.print("Digite o primeiro numero: ");
	n1=ler.nextInt();
	
	System.out.print("Digite o segundo número:  ");
	n2=ler.nextInt();
	
	result= soma(n1,n2);
	System.out.print(result);

	}

public static int soma(int n1,int n2) {
	int result=n1+n2;
	return result;
	
}

}
