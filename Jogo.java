import java.util.Random;

public class Jogo {
    public static void main(String[] args) {
        // Cria um objeto Random para gerar ações aleatórias
        Random random = new Random();
        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem(2, 10, 10);
        p1.nome = "Batman";
        p2.nome = "Superman";  //Esse personagem representa o "Zé Preguiça"

        
        p1.energia = Math.max(p1.energia, 0);
        p2.energia = Math.max(p2.energia, 0);

        // while (p1.energia > 0 || p2.energia > 0) 
        while (true){
            if (p1.energia > 0){ 
            // Gera um número aleatório entre 0 e 2 (3 possibilidades)
            int acaop1 = random.nextInt(3);
        
            // Define a ação do personagem
            switch (acaop1) {
                case 0:
                    p1.cacar();
                    break;
                case 1:
                    p1.comer();
                    break;
                case 2:
                    p1.dormir();
                    break;
                // case 3:
                //     p1.atacar(p2);

                //     if(p2.energia <= 0){
                //         System.out.printf("Batman usou Kryptonita\n");
                //     }

                //     System.out.println(p1);
                //     System.out.println(p2);
            }
        
         }
         else {
            // Verifica se o personagem ainda está vivo
            p1.morrer(p1);
            System.out.printf("Superman é o Campeão\n");
         }
        
            // Ações do Zé Preguiça (probabilidade 60% dormir, 30% comer, 10% caçar)
            if (p2.energia > 0) {
                int acaop2 = random.nextInt(10) + 1; // Gera um número entre 0 e 9
                if (acaop2 <= 6) { // 60% de chance de dormir
                    p2.dormir();
                } else if (acaop2 >= 7 || acaop2 <= 9) { // 30% de chance de comer
                    p2.comer();
                } else if (acaop2 ==10) { // 10% de chance de caçar
                    p2.cacar();
                }
            }
            else {
                p2.morrer(p2);
                 System.out.printf("Batman é o Campeão\n");
                 
            }

            

            // Exibe o status do personagem
            System.out.println(p1);
            System.out.println(p2);
            // Exibe o separador
            System.out.println("******************************\n");
        
            // Faz o programa "dormir" por 5 segundos
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {                              
                e.printStackTrace();
            }
        }
        
    }
}
