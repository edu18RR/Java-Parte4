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
        }
            System.out.println("fin de metodo2");
    }
}