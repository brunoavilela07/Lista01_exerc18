import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
// Faça um programa que peça o tamanho de um arquivo para download (em MB)
double tamanho;
System.out.println("Qual o tamanho do arquivo em MB?");
tamanho = input.nextDouble();

// e a velocidade de um link de Internet (em Mbps)
 
double velocidade;
System.out.println("Digite a velocidade de um link de internet em Mbps:");
velocidade = input.nextDouble();

// calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

double tempo;
 tempo = Math.ceil(tamanho*8)/(velocidade*60);

System.out.println("O tempo aproximado de download do arquivo usando este link é de "+ tempo + " minutos");

    }
}
