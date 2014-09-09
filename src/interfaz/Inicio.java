package interfaz;

import dominio.AdminAcademica;
import dominio.AdminAdministrativa;

public class Inicio {
    public static void main(String[] args) {
        AdminAcademica academ = new AdminAcademica();
        AdminAdministrativa admin = new AdminAdministrativa();
        frmMenu mnu = new frmMenu(academ, admin);
        mnu.setVisible(true);
    }
}
