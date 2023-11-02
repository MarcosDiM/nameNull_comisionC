
package Persona;
public class Persona {
    private String nombre;
    public Persona(){}

    //constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //  setter and getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //accion
    public void caminar(){ //acciones
        System.out.println("Estoy caminando");
    }
}
