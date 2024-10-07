import java.util.Random;

public class Jogo {
    public static void main(String[] args) {
        // Cria um objeto Random para gerar ações aleatórias
        Random random = new Random();
        Personagem p1 = new Personagem();
        p1.nome = "Batman";


        // Loop infinito
        while (true) {
            // Gera um número aleatório entre 0 e 2 (3 possibilidades)
            int acao = random.nextInt(3);

            // Define a ação do personagem
            switch (acao) { 
                case 0:
                    p1.cacar();  //método corrigido dnv
                    break;
                case 1:
                    p1.comer();
                    break;
                case 2:
                    p1.dormir();
                    break;
            }
            System.out.println(p1);

            // Exibe o separador
            System.out.println("******************************");

            // Pausa o programa por 5 segundos
            try {
                Thread.sleep(5000); // 5000 milissegundos = 5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
