import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int resposta = 0;
	    System.out.println("Digite um número inteiro: "); 
	    int num1 = entrada.nextInt();
	    System.out.println("Digite outro número inteiro: "); 
	    int num2 = entrada.nextInt();
	    System.out.println("Escolha um operando: + - * /: "); 
	    char operador = entrada.next().charAt(0);	
	    
	    entrada.close();
	    
	    
	    if( operador == '*' ) {
	    	resposta = num1 * num2;
	    }
	    else if ( operador == '/') {
	    	resposta = num1 / num2;
		}
		else if ( operador == '+') {
			resposta = num1 + num2; 
		}
		else if ( operador == '/') {
		    resposta = num1 - num2;
		}else {
			System.out.println("Comando inválido.");
		}
			System.out.println("O resultado é: " + resposta );
	    
	
		    
		}
	}