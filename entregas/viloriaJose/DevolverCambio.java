import java.util.Scanner;

class DeveloperCambio {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        final  int PRECIOUNO;
        PRECIOUNO = 232;

        int dineroIngresado;

        System.out.println("Debes pagar " + PRECIOUNO + "€, ingrese el dinero:");
        
        dineroIngresado = scanner.nextInt();
        
        boolean puedePagar;
        int cambio;

        puedePagar = (dineroIngresado >= PRECIOUNO);
        cambio = dineroIngresado - PRECIOUNO;

        System.out.println( puedePagar ? "Tu cambio es " + cambio + "€" : "No tienes suficiente dinero");

        final int PRECIODOS;
        PRECIODOS = 1;

        System.out.println("Debes pagar " + PRECIODOS + "€, ingrese el dinero:");
        
        dineroIngresado = scanner.nextInt();
        puedePagar = dineroIngresado >= PRECIODOS;
        cambio = dineroIngresado - PRECIODOS;
        
        System.out.println(puedePagar ? "Tu cambio es " + cambio + "€" : "No tienes suficiente dinero");

        final int PRECIOTRES;
        PRECIOTRES = 37;

        final int PRECIOCUATRO;
        PRECIOCUATRO = 5;

        System.out.println();
        
    }
}