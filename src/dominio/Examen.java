package dominio;

import java.util.Hashtable;

class Examen {
    String fecha;
    Hashtable<Estudiante, Integer> acta;

    public Examen(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Hashtable<Estudiante, Integer> getActa() {
        return acta;
    }

    public void setActa(Hashtable<Estudiante, Integer> acta) {
        this.acta = acta;
    }
    
    
}
