package domain;

public class Persona {

        private int idpersona;
        private String nombre;
        private String email;
        
        public Persona() {
        }

        public Persona(int idpersona) {
            this.idpersona = idpersona;
        }

        public Persona(String nombre, String email) {
            this.email = email;
            this.nombre= nombre;
        }
        public Persona( int idpersona,String nombre,String email){
            this.idpersona=idpersona;
            this.nombre = nombre;
            this.email = email;
        }

        public int getIdpersona() {
            return idpersona;
        }

        public void setIdpersona(int idpersona) {
            this.idpersona = idpersona;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "idpersona=" + idpersona +
                    ", nombre='" + nombre + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }


