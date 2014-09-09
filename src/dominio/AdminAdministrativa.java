package dominio;

import java.util.ArrayList;

public class AdminAdministrativa {
    ArrayList<Estudiante> estudiantes;
    ArrayList<Docente> docentes;
    ArrayList<Materia> materias;
    
    public boolean existeEstudiante(Estudiante unEstudiante){
        boolean existe = false;
        int i = 0;
        while(!existe && i < this.estudiantes.size()){
            if(this.estudiantes.get(i).equals(unEstudiante)){
                existe = true;
            }
            i++;
        }
        return existe;
    }
    
    public boolean matricularEstudiante(Estudiante unEstudiante, Materia unaMateria){
        boolean matriculado = false;
        if(this.existeEstudiante(unEstudiante) && this.existeMateria(unaMateria)){
            this.buscarMateria(unaMateria).getEstudiantes().add(unEstudiante);
            matriculado = true;
        }
        return matriculado;
    }
    
    public boolean existeMateria(Materia unaMateria){
        boolean existe = false;
        int i = 0;
        while(!existe && i < materias.size()){
            if(materias.get(i).getNumero() == unaMateria.getNumero()){
                existe = true;
            }
            i++;
        }
        return existe;
    }
    
    public boolean materiaSinDocente(Materia unaMateria){
        boolean sinDoc = true;
        int i = 0;
        while(!sinDoc && i < this.materias.size()){
            if(this.materias.get(i).getNumero() == unaMateria.getNumero()){
                if(this.materias.get(i).getDocente() != null){
                    sinDoc = false;
                }
            }
            i++;
        }
        return sinDoc;
    }
    
    
    public Materia buscarMateria(Materia unaMateria){
        boolean encontrada = false;
        int i = 0;
        while(!encontrada && i < materias.size()){
            if(materias.get(i).getNumero() == unaMateria.getNumero()){
                return unaMateria;
            }
            i++;
        }
        return null;
    }
    
    public boolean existeDocente(Docente unDocente){
        boolean existe = false;
        int i = 0;
        while(!existe && i < docentes.size()){
            if(docentes.get(i).getNombre().equals(unDocente.getNombre())){
                existe = true;
            }
            i++;
        }
        return existe;
    }
    
    public boolean altaEstudiante(int num, String nom, String mail){
        boolean alta;
        Estudiante unEstudiante = new Estudiante(num, nom, mail);
        if(!this.existeEstudiante(unEstudiante)){
            alta = false;
        }
        else{
            this.estudiantes.add(unEstudiante);
            alta = true;
        }
        return alta;
    }
    
    public boolean altaMateria(int num, String des){
        boolean alta;
        Materia unaMateria = new Materia(num, des);
        if(!this.existeMateria(unaMateria)){
            alta = false;
        }
        else{
            this.materias.add(unaMateria);
            alta = true;
        }
        return alta;
    }

    public boolean altaDocente(String nom, String mail, int grd, Materia mat){
        boolean alta;
        Docente unDocente = new Docente(nom, mail, grd);
        if(!this.existeDocente(unDocente)
                || !this.existeMateria(mat)
                || !this.materiaSinDocente(mat)){
            alta = false;
        }
        else{
            this.docentes.add(unDocente);
            this.buscarMateria(mat).setDocente(unDocente);
            alta = true;
        }
        return alta;
    }
}
