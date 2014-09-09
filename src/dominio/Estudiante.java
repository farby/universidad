package dominio;

class Estudiante {
    int numero;
    String nombre;
    String mail;

    public Estudiante(int numero, String nombre, String mail) {
        this.numero = numero;
        this.nombre = nombre;
        this.mail = mail;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    @Override
    public String toString() {
        return "Nombre " + nombre + " - Número " + numero;
    }

    public boolean equals(Estudiante unEstudiante) {
        boolean igual = false;
        if(this.getNumero() == unEstudiante.getNumero()
                || this.getNombre().equals(unEstudiante.getNombre())){
            igual = true;
        }
        return igual;
    }
    
}
