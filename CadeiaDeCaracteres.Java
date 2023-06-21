import java.util.Scanner;

public class CadeiaDeCaracteres {

	public static void main(String[] args) {
		
		
		Scanner entrada  = new Scanner(System.in);	
		System.out.print("Insira seu nome: ");
		String nome = entrada.next(); 
		System.out.print("Insira sua idade:");
		int idade = entrada.nextInt(); 
		entrada.close();
		System.out.println("Seu nome é: " + nome + " e a sua idade é: " + idade);
		
		
	}


}