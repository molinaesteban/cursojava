package domain;


public class Usuario {
    private String tipoUsuario;
    private int idusuario;
    private String password;

    public Usuario( int idusuario,String tipoUsuario,String password){
        this.idusuario=idusuario;
        this.tipoUsuario= tipoUsuario;
        this.password= password;

    }

    public Usuario(int  idusuario) {
        this.idusuario = idusuario;

    }
    public Usuario (String tipoUsuario,String password){
        this.tipoUsuario= tipoUsuario;
        this.password=password;
    }



    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }


    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "tipoUsuario='" + tipoUsuario + '\'' +
                ", idusuario=" + idusuario +
                ", password='" + password + '\'' +
                '}';
    }
}
