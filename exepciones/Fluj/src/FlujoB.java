public class FlujoB {

    public static void main(String[] args) { 
        System.out.println("Inicio del main"); 
        metodo1(); //main llama a metodo1
        System.out.println("Fin del main");
    }

    private static void metodo1() { 
        System.out.println("Inicio del metodo1"); 
        try {
            metodo2();
        } catch(MiException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fin de metodo1");
    }

    private static void metodo2() throws MiException {
        System.out.println("Inicio de metodo2");
        throw new ArithmeticException("dio error");
        // System.out.println("Fin de metodo2");
    }

	
}