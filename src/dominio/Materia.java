package dominio;

import java.util.ArrayList;

public class Materia {
    int numero;
    String descripcion;
    Docente docente;
    Examen examen;
    ArrayList<Estudiante> estudiantes;

    public Materia(int numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public int getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Docente getDocente() {
        return docente;
    }

    public Examen getExamen() {
        return examen;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    
}
