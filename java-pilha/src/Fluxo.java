
public class Fluxo {
	  
	    

	    public static void main(String[] args) {
	        System.out.println("Ini do main");
	        metodo1();
	        System.out.println("Fim do main");
	        metodo3();
	        
	    }

	 
		private static void metodo1() {
	        System.out.println("Ini do metodo1");
	        metodo2();
	  
	        System.out.println("Fim do metodo1");
	    }

	    private static void metodo2() {
	        System.out.println("Ini do metodo2");
	        
	        for(int i = 0; i <= 5; i++) {
	            System.out.println(i);
	            try {
	            	int a = i / 0;
	            }catch (ArithmeticException erro) {
	            	String msg = erro.getLocalizedMessage();
	            	System.out.println("AE "+ msg);
					System.out.println("arit.exc");
	            	erro.printStackTrace();
				}
	            
	        }
	        System.out.println("Fim do metodo2");
	        
	       }
	    private static void metodo3() {
	 		System.out.println("iniciar autodestruição");
	 		  for(int cont = 10; cont >= 0 ; cont --) {
		            System.out.println(cont + " segundos");
		           
		        }
	 		}
	  
	}