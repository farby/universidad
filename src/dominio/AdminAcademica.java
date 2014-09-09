package dominio;

import java.util.ArrayList;

public class AdminAcademica {
    AdminAdministrativa admin;
    ArrayList<Examen> examenes;
    
    public boolean fijarExamen(Materia unaMateria, String fecha){
        boolean fijado = false;
        Examen unExamen = new Examen(fecha);
        if(this.admin.existeMateria(unaMateria)){
            this.admin.buscarMateria(unaMateria).setExamen(unExamen);
        }
        return fijado;
    }
    
    public boolean existeExamen(Examen unExamen){
        boolean existe = false;
        int i = 0;
        while(!existe && i < this.examenes.size()){
            if(this.examenes.get(i).getFecha().equals(unExamen.getFecha())){
                existe = true;
            }
            i++;
        }
        return existe;
    }
        
    public boolean altaEstudianteExamen(
            Estudiante unEstudiante, Materia unaMeteria, Examen unExamen){
        boolean alta = false;
        if(this.admin.estaInscripto(unEstudiante, unaMeteria)
                && this.existeExamen(unExamen)){
            unExamen.getActa().put(unEstudiante, -1);
        }
        return alta;
    }
}
