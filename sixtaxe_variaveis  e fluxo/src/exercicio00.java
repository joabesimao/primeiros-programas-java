public class exercicio00 {
	
    public static void main(String args[]) {
    	
        for(int linha = 0; linha < 5; linha++) {
        	
            for (int coluna = 1; coluna < 5; coluna++) {
            	
                if (coluna > linha ) {
                	
                    break;
                }
                System.out.print(linha);
            }
            System.out.println();
        }
    }
}