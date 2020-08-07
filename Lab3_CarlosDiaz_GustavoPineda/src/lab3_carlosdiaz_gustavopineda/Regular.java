package lab3_carlosdiaz_gustavopineda;

public class Regular extends ERegistro{
    private String user;
    private String pw;

    public Regular() {
        super();
    }

    public Regular(String user, String pw) {
        this.user = user;
        this.pw = pw;
    }

    public String getUser() {
        return user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
    
}
