package Controller;
import Model.*;
import View.*;
public class Controlador {
    Menu menu;
    Data data;

    public Menu(){
        menu = new Menu();
        data = new Data();
    public void iniciar(){
        int opcion = menu.menu()
        boolean continuar = true;

        while(continuar){
            switch(opcion){
                case 1:
                    imprimirArrayAlumnos();
                case 2:
                    imprimirArrayRamos();
                case 3:
                case 4:
                case 5:
            }
        }
    }

    public ArrayList<String> transformarRamos(){
        ArrayList<String> aux = new ArrayList<>();
        for(Alumno r : listaRamos){
            aux.add(a.toString());
        }return aux
    }
    public void imprimirArrayRamos(){
        ArrayList<String> aux = transformarRamos();
        for(String s : aux){
            System.out.println(s);
        }
    }

    public ArrayList<String> transformarAlumnos(){
        ArrayList<String> aux = new ArrayList<>();
        for(Alumno a : listaAlumnos){
            aux.add(a.toString());
        }return aux
    }
    public void imprimirArrayAlumnos(){
        ArrayList<String> aux = transformarAlumnos();
        for(String s : aux){
            System.out.println(s);
        }
    }

}
