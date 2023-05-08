public class FlujoB {

    public static void main(String[] args) { System.out.println("Inicio del main"); metodo1();
        System.out.println("Fin del main");
    }

    private static void metodo1() { 
        System.out.println("Inicio del metodo1"); 
        try {
            metodo2();
        } catch (MiException me) {
            me.printStackTrace();
        }
        System.out.println("Fin del metodo1");

    }

    private static void metodo2() {
        System.out.println("Inicio del metodo2");
        throw new MiException("Mi excepcion fue lanzada");
    }
}
