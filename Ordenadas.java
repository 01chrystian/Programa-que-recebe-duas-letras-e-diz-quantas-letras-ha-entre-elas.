package Letras;

import java.util.Scanner;

public class Ordenadas {

	

	public static void main(String[] args) {
	     
	    Scanner sc = new Scanner(System.in);
	    String[] vetor = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	    
	    
	    
        System.out.println("Escolha a alternativa: "+ "\n");
	    
	    System.out.println("(1)-" + "A" +"  (8)-" + "H"+"   (15)-"+ "O"+"  (22)-"+ "V"); 
	    System.out.println("(2)-" + "B" +"  (9)-" + "I"+"   (16)-"+ "P"+"  (23)-"+ "W");
	    System.out.println("(3)-" + "C" +"  (10)-"+ "J"+"  (17)-"+ "Q"+"  (24)-"+ "X");
	    System.out.println("(4)-" + "D" +"  (11)-"+ "K"+"  (18)-"+ "R"+"  (25)-"+ "Y");
	    System.out.println("(5)-" + "E" +"  (12)-"+ "L"+"  (19)-"+ "S"+"  (26)-"+ "Z");
	    System.out.println("(6)-" + "F" +"  (13)-"+ "M"+"  (20)-"+ "T"+ "");
	    System.out.println("(7)-" + "G" +"  (14)-"+ "N"+"  (21)-"+ "U"+ "\n");
	    
	    System.out.println("Digite o numero da sua letra: ");
	    int a = sc.nextInt();
	    
	    System.out.println("Digite o numero da sua outra letra: ");
	    int b = sc.nextInt();
	    
	    int letra1 = a;
	    int letra2 = b;
	    int diferenca = ((letra1 - letra2) * (-1));
	    System.out.println("Voce escolheu as letras: " + vetor[letra1-1] + " e " + vetor[letra2-1] );
	    String[] mostraLetra = new String[letra1];
	    String[] mostraLetra1 = new String[letra2];
	    
	    	
	    if (letra1 < letra2) {
	    	System.out.println("\n"+"A diferenca entre essas letras sao de: " + (diferenca - 1) + " letras");
	    }else {
	    
		    	System.out.println("\n" +"Estao fora de ordem alfabetica" );
	    
	    }
		
	}

}
