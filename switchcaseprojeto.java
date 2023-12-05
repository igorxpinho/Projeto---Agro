    public class switchcaseprojeto {
    enum Estado {
        ACORDADO, 
        DORMINDO
    }

    public static void main(String[] args) {
        Estado minhaSituação = Estado.DORMINDO;
        boolean acordar = true; 

        while (acordar) {
            switch (minhaSituação) {
                case ACORDADO:                  
                    System.out.println("Estou acordado, não posso colher abacates porque estou machucado.");
                    break;

                case DORMINDO:
                    System.out.println("Estou dormindo, trator foi colher pepino, soja e milho...");
                    break;

                default:
                    System.out.println("Estado inexistente.");
                    break;
            }    
        }
    }
}