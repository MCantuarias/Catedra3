package View;
import Controller.*;
public class Menu {
    Controlador Controlador;

    public int menu(){
        Scanner.sc = new Scanner(System.in);
        System.out.println("Eliga una de las siguientes opciones");
        System.out.println("Imprimir lista alumnos");
        System.out.println("imprimir lista ramos");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        opcion = sc.nextInt();
    }return opcion;


}
