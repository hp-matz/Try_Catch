import java.util.Scanner;

class Main {
  /*
  Entrar com dois valores e fazer a divisão destes
  */

  public static void main(String[] args) {
    //LIMPA A TELA
    clearScreen();
    
    //DECLARAÇÃO e INICIALIZAÇÃO DE VARIÁVEIS 
		Scanner entrada = new Scanner( System.in );
    int valor1 = 0;
    int valor2 = 0;
    int resultado = 0;

    System.out.print("Entre com o primeiro valor: ");
    valor1 = entrada.nextInt();

  
    System.out.print("Entre com o segundo valor: ");
    
    valor2 = entrada.nextInt();
    
    try{
      resultado = valor1 / valor2;
      System.out.println("A divisão dos valores é: " + resultado);
    }catch( Exception e){
      System.out.print("Impossível dividir por zero :/ ");
    }
  }

  private static void clearScreen(){
		System.out.println("\033[H\033[J");
	}

}