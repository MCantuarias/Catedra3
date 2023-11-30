package Model;

import java.util.*;

public class Alumno {
    private int id;
    private String nombre;
    private String rut;
    private int edad;
    private ArrayList<Ramo> ramos;

    public Alumno(int id, String nombre, String rut, int edad){
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        ramos = new ArrayList<>();
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }
    public String getRut(){
        return rut;
    }
    public int getEdad(){
        return edad;
    }
    public ArrayList<Ramo> getRamos(){
        return ramos;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setRut(String rut){
        this.rut = rut;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public ArrayList<String> mostrarRamos(ArrayList<Ramo> ramos){
        for(Ramo o : ramos){

        }
    }

    public String retornarIds(){
        ArrayList<Ramo> ramos = alumno.getRamos();

        }
    }
    //Falta
    @Override
    public String toString(){
        return getId()+","+getNombre()+","+getRut()+","+getEdad+","+ramo.getId();
    }
}
