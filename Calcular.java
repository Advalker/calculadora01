package repeticao;

import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("        \t____calculadora____ \n\n\t  Iniciar calculadora agora? \n\t\t 1[sim] 2[n�o]");
		var decisao = input.nextInt();
		
		while (decisao == 1) {
			System.out.println("escola uma opera��o: \n\t1[+], 2[-], 3[*], 4[/]");
			int operacao = input.nextInt();
			System.out.println("Digite os valores:");
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			
			switch (operacao) {
			case 1:
				System.out.println(num1 + num2 + "\t\ndeseja continuar? \n\t1[sim] \n2[n�o]");
				decisao = input.nextInt();
				
			break;
			
			case 2:
				System.out.println(num1 - num2 + "\ndeseja continuar? \n\t1[sim] \n2[n�o]");
				decisao = input.nextInt();
				
			break;
			
			case 3:
				System.out.println(num1 * num2 + "\ndeseja continuar? \n\t1[sim] \\n2[n�o]");
				decisao = input.nextInt();
				
			break;
			
			case 4:
				System.out.println(num1 / num2 + "\ndeseja continuar? \n\t1[sim] \\n2[n�o]");
				decisao = input.nextInt();
				
			break;
			default:
				System.out.println("Opera�ao inv�lida");
				
			}
				
		}
		
		
		System.out.println("At� a pr�xima!");
		
		input.close();
	}
	
}
