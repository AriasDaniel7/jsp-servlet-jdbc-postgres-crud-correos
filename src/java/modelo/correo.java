package modelo;

/**
 *
 * @author Daniel Arias
 */
public class correo {
    protected int id;
    protected String nombre;
    protected String correo;
    
    public correo(int id,String nombre,String correo){
        this.id = id;
        this.correo = correo;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
