import java.util.Scanner;

public class Calculadora {
        public static void main(String[] args) {
            // Variáveis \\
            int sA,sB,sbA,sbB,mA,mB,dA,dB, resultado;
            int menu;

            Scanner input = new Scanner(System.in);
            while(true) {
                // Menu \\
                System.out.println(""             +
                        "[1] Soma             \n" +
                        "[2] Subtração        \n" +
                        "[3] Divisão          \n" +
                        "[4] Multiplicação    \n" +
                        "[5] Sair do programa \n" +
                        "");
                menu = input.nextInt();
                // SOMA
                if(menu == 1) {
                System.out.println("Coloque os valores para soma:  \n " );
                System.out.println("Valor A: ");
                sA = input.nextInt();
                System.out.println("Valor B: ");
                sB = input.nextInt();
                resultado = (sA + sB);
                System.out.println("Resultado:" + resultado );
                continue;
            }
            // SUBTRAÇÃO
            if(menu == 2) {
                System.out.println("Coloque os valores para subtrair: \n");
                System.out.println("Valor A: ");
                sbA = input.nextInt();
                System.out.println("Valor B: ");
                sbB = input.nextInt();
                resultado = (sbA - sbB);
                System.out.println("Resultado:" + resultado);
                continue;
            }
            // DIVISÃO
            if(menu == 3) {
                System.out.println("Coloque os valores para dividir: \n");
                System.out.println("Valor A: ");
                dA = input.nextInt();
                System.out.println("Valor B: ");
                dB = input.nextInt();
                resultado = (dA / dB);
                System.out.println("Resultado:" + resultado);
                continue;
            }
            // MULTIPLICAÇÃO
            if(menu == 4) {
                System.out.println("Coloque os valores para multiplicar: \n");
                System.out.println("Valor A: ");
                mA = input.nextInt();
                System.out.println("Valor B: ");
                mB = input.nextInt();
                resultado = (mA * mB);
                System.out.println("Resultado: " + resultado);
                continue;
            }
            // SAIR
            if (menu == 5) {
                System.out.println("Você está saindo do programa!");
                break;
            }
            input.close();
        }
     }
}