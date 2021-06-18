package dominio;

public class Doctor {
    String titulo;
    int AñosExperiencia;

    public Doctor(String titulo,int AñosExperiencia) {
        this.titulo = titulo;
        this.AñosExperiencia = AñosExperiencia;
    }

    @Override
    public String toString() {
        return "Doctor{" + super.toString()+
                "titulo='" + titulo + '\'' +
                ", AñosExperiencia=" + AñosExperiencia +
                '}';
    }
}
