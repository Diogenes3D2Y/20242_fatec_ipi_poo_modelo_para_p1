import java.util.Random;

public class Jogo {
    public static void main(String[] args) {
        
        Random random = new Random();
        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem(2, 10, 10);
        p1.nome = "Batman";
        p2.nome = "Superman";  //Esse personagem representa o "Zé Preguiça"

        
        p1.energia = Math.max(p1.energia, 0);
        p2.energia = Math.max(p2.energia, 0);

        while (true){
            if (p1.energia > 0){ 
            int acaop1 = random.nextInt(3);
        
            
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
            }
        
         }
         else {
            p1.morrer(p1);
            System.out.printf("Superman é o Campeão\n");
         }
        
            
            if (p2.energia > 0) {
                int acaop2 = random.nextInt(10) + 1; 
                if (acaop2 <= 6) { 
                    p2.dormir();
                } else if (acaop2 >= 7 || acaop2 <= 9) { 
                    p2.comer();
                } else if (acaop2 ==10) { 
                    p2.cacar();
                }
            }
            else {
                p2.morrer(p2);
                 System.out.printf("Batman é o Campeão\n");
                 
            }
            int atacado = random.nextInt(2);

            switch (atacado){
                case 0:
                p1.atacar(p2);
                if (p2.energia < 1){
                    System.out.println("Batman é o grande campeao");
                }
                break;
                case 1:
                    p2.atacar(p1);
                    if (p1.energia < 1) {

                        System.out.println("Superman é o grande campeao");
                        
                    }
            }
            
            System.out.println(p1);
            System.out.println(p2);

            System.out.println("******************************\n");
        
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {                              
                e.printStackTrace();
            }
        }
        
    }
}
