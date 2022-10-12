import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
     // Variáveis \\
    int numero_aleatorio, jogada = 1, chute=0, niveis, numero_chutado;

    Random random = new Random();
    Scanner input = new Scanner(System.in);

    // Gerar números aleatórios. \\
    numero_aleatorio = random.nextInt(100) + 1;

    // Menu \\
    System.out.println("Bem vindo ao jogo de adivinhação!");
    System.out.println("Tente acertar um número de 0 a 100.");
    System.out.println("Escolha os níveis: ");
    System.out.println("[1] Fácil | [2] Médio | [3] Difícil ");
    niveis = input.nextInt();

    // Níveis \\
    switch (niveis) {
        case 1: chute = 15;
        break;
        case 2: chute = 10;
        break;
        case 3: chute = 5;
        break;
        default: System.out.println("Número inválido!");
    }

    // Lógica \\
    while(jogada <= chute) {
        System.out.println("Você tem " + chute +" chances!");
        System.out.println(jogada + " Jogada de " + chute);
        numero_chutado = input.nextInt();

        if(numero_chutado == numero_aleatorio) {
            System.out.println("Parabéns você acertou! com " + jogada + " jogadas restantes.");
            break;
        }else if(numero_chutado < numero_aleatorio){
            System.out.println("O número chutado é menor que o número aleatório!");
        }else {
            System.out.println("O número chutado é maior que o número aleatório!");
        }
        jogada ++;
    }
    }
}
