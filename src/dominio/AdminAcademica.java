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
}
