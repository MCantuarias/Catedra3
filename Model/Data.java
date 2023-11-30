package Model;

public class Data {
    private ArrayList<Alumno> listaAlumnos;
    private ArrayList<Ramo> listaRamos;

//agregar, buscar, eliminar, mostrar
    public Data(){
        listaAlumnos = new ArrayList<>();
        listaRamos = new ArrayList<>();
    }
//ALUMNOS
    public Alumno buscarAlumno(Alumno alumno){
        for(Alumno a : listaAlumnos){
            if(a.getId().equals(alumno.getId())){
                return alumno;
            }
        }return null;
    }
    public void eliminarAlumno(Alumno alumno){
        Alumno aux = buscarAlumno(alumno);
        if(aux != null){
            listaAlumnos.remove(aux);
        }
    }
    public void agregarAlumno(Alumno alumno){
        Alumno aux = buscarAlumno(alumno);
        if(aux != null){
            listaAlumnos.agregarAlumno(aux);
        }
    }
    public void mostrarAlumnos(ArrayList<Alumno> listaAlumnos){
        for(Alumno a : listaAlumnos){
            System.out.println(a.toString());
        }
    }

//RAMOS
    public void buscarRamos(Ramo ramo){
        for(Ramo r : listaRamos){
            if(r.getId().equals(ramo.getId())){
                return ramo;
            }
        }return null;
    }
    public void eliminarRamo(Ramo ramo){
        Ramo aux = buscarRamos(ramo);
        if(aux != null){
            listaRamos.remove(ramo);
        }
    }
    public void agregarRamo(Ramo ramo){
        Ramo aux = buscarRamos(ramo);
        if(aux != null){
            listaRamos.add(ramo)
        }
    }
    public void mostrarRamos(ArrayList<Ramo> listaRamos){
        for(Ramo r : listaRamos){
            System.out.println(r.toString());
        }
    }

    //ALUMNOSS
    public void poblarAlumnos(String directorio){
        try(BufferedReader br = new BufferedReader(new FileReader(directorio))){
            String linea;
            br.nextLine();
            while((linea = br.nextLine()) != null){
                String[] datos = linea.split(",");
                for(i= 3; i> datos.size();i++){
                    String ramo = datos[i];
                    String[] ramos = ++ramo+", ";
                }
                //NO ME ACUERDO DEL SLASH aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                Alumno alumno = Alumno(Integer.valueOf(datos[0]), datos[1], datos[2], Integer.valueOf(datos[3]), ramos+"/n");
                Alumno a = buscarAlumno(alumno);
                if(a != null){
                    listaAlumnos.add(alumno);
                }
            }br.close();
        }catch(Exception e){
            System.out.println("No se encontro el archivo");
        }
    }
    public void escribirArchivoAlumno(String directorio){
        try(BufferedWriter wr = new BufferedWriter(new FileWriter(directorio))){
            wr.write("id,nombre,rut,edad,ramos"+"/n");
            for(Alumno a : listaAlumnos){
                wr.write(a.toString()+"/n");
            }wr.close();
        }catch(Exception e){
            System.out.println("No se encontro el archivo");
        }
    }

    //RAMOSSS
    public void poblarRamos(String directorio){
        try(BufferedReader br = new BufferedReader(new FileReader(directorio))){
            String linea;
            br.nextLine();
            while((linea = br.nextLine()) != null){
                String[] datos = linea.split(",");
                //NO ME ACUERDO DEL SLASH aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                Ramo ramo = Ramo(Integer.valueOf(datos[0]), datos[1]"/n");
                Ramo r = buscarRamos(ramo);
                if(r != null){
                    listaRamos.add(ramo);
                }
            }br.close();
        }catch(Exception e){
            System.out.println("No se encontro el archivo");
        }
    }

    public void escribirArchivoRamos(String directorio){
        try(BufferedWriter wr = new BufferedWriter(new FileWriter(directorio))){
            wr.write("id,nombre"+"/n");
            for(Ramo r : listaRamos){
                wr.write(r.toString()+"/n");
            }wr.close();
        }catch(Exception e){
            System.out.println("No se encontro el archivo");
        }
    }

    public void calcularPromedio(Alumno alumno, Ramo ramo){
        Alumno alumnoAux = buscarAlumno(alumno);
        int idRamo = Ramo.getId();
        
        

        for(i=4;i>alumnoAux.Length();i++){
            if(idRamo == alumnoAux[i]){
                
            }
        }
    }

}
