import java.util.Scanner;

public class RoboEspantalho {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Número de estações
        int C = sc.nextInt(); // Número de comandos
        int S = sc.nextInt(); // Estação mais próxima à área devastada

        int[] comandos = new int[C];
        for (int i = 0; i < C; i++) {
            comandos[i] = sc.nextInt();
        }

        int estacaoAtual = 1; // Inicializa o robô na estação 1
        int contadorEstacaoS = 0; // Inicializa o contador de vezes que o robô permaneceu na estação S

        for (int i = 0; i < C; i++) {
            if (estacaoAtual == S) {
                contadorEstacaoS++;
            }
            estacaoAtual += comandos[i];
            if (estacaoAtual < 1) {
                estacaoAtual = N;
            } else if (estacaoAtual > N) {
                estacaoAtual = 1;
            }
        }

        if (estacaoAtual == S) {
            contadorEstacaoS++;
        }

        System.out.println(contadorEstacaoS);

        sc.close();
    }

}
