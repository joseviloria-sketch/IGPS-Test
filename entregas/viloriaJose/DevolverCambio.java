import java.util.Scanner;

class DeveloperCambio {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        final  int PRECIO_UNO;
        PRECIO_UNO = 232;

        int dineroIngresado;

        System.out.println("Debes pagar " + PRECIO_UNO + "€, ingrese el dinero:");
        
        dineroIngresado = scanner.nextInt();
        
        boolean puedePagar;
        int cambio;

        puedePagar = (dineroIngresado >= PRECIO_UNO);
        cambio = dineroIngresado - PRECIO_UNO;

        System.out.println( puedePagar ? "Tu cambio es " + cambio + "€" : "No tienes suficiente dinero");

        final int PRECIO_DOS;
        PRECIO_DOS = 1;

        System.out.println("Debes pagar " + PRECIO_DOS + "€, ingrese el dinero:");
        
        dineroIngresado = scanner.nextInt();
        puedePagar = dineroIngresado >= PRECIO_DOS;
        cambio = dineroIngresado - PRECIO_DOS;
        
        System.out.println(puedePagar ? "Tu cambio es " + cambio + "€" : "No tienes suficiente dinero");

        final int PRECIO_TRES;
        PRECIO_TRES = 37;

        System.out.println("Debes pagar " + PRECIO_TRES + "€, ingrese el dinero:");

        dineroIngresado = scanner.nextInt();
        puedePagar = dineroIngresado >= PRECIO_TRES;
        cambio = dineroIngresado - PRECIO_TRES;

        System.out.println(puedePagar ? "Tu cambio es " + cambio + "€" : "No tienes suficiente dinero");

        final int PRECIO_CUATRO;
        PRECIO_CUATRO = 5;

        System.out.println("Debes pagar " + PRECIO_CUATRO + "€, ingrese el dinero:");

        dineroIngresado = scanner.nextInt();
        puedePagar = dineroIngresado >= PRECIO_CUATRO;
        cambio = dineroIngresado - PRECIO_CUATRO;

        System.out.println(puedePagar ? "Tu cambio es " + cambio + "€" : "No tienes suficiente dinero");

        System.out.println();
        
    }
}