import java.util.Random;

public class Jogo {
    public static void main(String[] args) {
        // Cria um objeto Random para gerar ações aleatórias
        Random random = new Random();
        Personagem p1 = new Personagem();
        p1.nome = "Batman";
        
        p1.energia = Math.max(p1.energia, 0);

        while (p1.energia > 0) {
            // Gera um número aleatório entre 0 e 2 (3 possibilidades)
            int acao = random.nextInt(3);
        
            // Define a ação do personagem
            switch (acao) {
                case 0:
                    p1.cacar();
                    break;
                case 1:
                    p1.comer();
                    break;
                case 2:
                    p1.dormir();
                    break;
            }
        
            // Verifica se o personagem ainda está vivo
            p1.morrer(p1);
        
            // Exibe o status do personagem
            System.out.println(p1);
        
            // Exibe o separador
            System.out.println("******************************");
        
            // Pausa o programa por 5 segundos
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {                              
                e.printStackTrace();
            }
        }
    }
}
