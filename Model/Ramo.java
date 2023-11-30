package Model;

import java.util.*;

public class Ramo {
    private int id;
    private String nombre;
    private ArrayList<Double> notas;

    public Ramo(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        notas = new ArrayList<>();
    }

    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setId(int id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //Faltaaaaaaaaaaaaaaaaaaaaaaaaaaaa
    @Override
    public String toString(){
        return getId+","+getNombre;
    }



}
