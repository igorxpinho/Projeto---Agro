enum Estado {
    DORMINDO,
    ACORDADO
}

public class switchcaseevolution {
    public static void main(String[] args) {
        Estado meuEstado = Estado.ACORDADO; 

        while (true) {
            switch (meuEstado) {
                case DORMINDO:
                    System.out.println("Fazendeiro está dormindo.");
                    
                    System.out.println("E o trator foi colher cenoura, pepino, alface, milho e soja.");
                    
                    break;
                case ACORDADO:
                    System.out.println("Fazendeiro está acordado e está deitado na rede.");
        
                    System.out.println("E o trator foi regar as plantações.");
                    
                    break;
                default:
                    break;
            }

            try {
                Thread.sleep(5000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            
            if (meuEstado == Estado.ACORDADO) {
                meuEstado = Estado.DORMINDO;
            } else {
                meuEstado = Estado.ACORDADO;
            }
        }
    }
}