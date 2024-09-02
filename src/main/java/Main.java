import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Um programa que leia um valor inteiro N. Este valor será a quantidade de quantidade de valores inteiros x que serao lidos em seguida. Mostre quantos deates valores X estão Dentro do intervalo (10 , 20) e quantos estao fora do intervalo, mostrando essas informações;

  int quantidadeDeNumerosDigitados = sc.nextInt();
  int valoresDentroDoIntervalo = 0;
  int valoresForaDoIntervalo = 0;
  int numeroDigitado;

  for(int i = 0; i < quantidadeDeNumerosDigitados; i++) {
  System.out.println("Digite o valor a ser comparado");
  numeroDigitado = sc.nextInt();
  if( numeroDigitado >= 10 && numeroDigitado <= 20){
valoresDentroDoIntervalo++;
      }else{}
      }
    sc.close();
    }

  
    
  
    
  }


