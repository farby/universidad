package dominio;

public class Docente {
    String nombre;
    String mail;
    int grado;

    public Docente(String nombre, String mail, int grado) {
        this.nombre = nombre;
        this.mail = mail;
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
    
    
}
