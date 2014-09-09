package dominio;

public class Sistema {
    AdminAcademica academ;
    AdminAdministrativa admin;

    public Sistema(AdminAcademica academ, AdminAdministrativa admin) {
        this.academ = academ;
        this.admin = admin;
    }

    public AdminAcademica getAcadem() {
        return academ;
    }

    public AdminAdministrativa getAdmin() {
        return admin;
    }
    
}
