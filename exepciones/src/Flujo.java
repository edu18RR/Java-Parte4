public class Flujo {
    public static void main(String[] args)  {
        System.out.println("inicio main");
        metodo1();
        System.out.println("fin main");
    }

    private static void metodo1() {
        System.out.println("inicio metodo1");
        metodo2();
        System.out.println("fin de metodo1");
    }

    private static void metodo2() {
    System.out.println("inicio metodo2");
        for (int i = 1; i <=5; i++) {
            System.out.println(i);
            
            try {//captura la excepcion
                if (i == 3) {
                int num = 0;                        
                int resultado = i/num;
                System.out.println(resultado);
            }
                String test = null;
                System.out.println(test.toString());
                
            } catch (ArithmeticException | NullPointerException excepcion) {//Atrapa el error
                System.out.println("Atrapo Exception");
                System.out.println(excepcion.getMessage());                
                excepcion.printStackTrace();
            }
        }
            System.out.println("fin de metodo2");
    }
}
