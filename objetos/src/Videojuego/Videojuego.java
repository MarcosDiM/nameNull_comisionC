package Videojuego;

public class Videojuego {
    private String titulo, genero, empresa;

    //constructor vacio
    public Videojuego(){};

    //constructor lleno

    public Videojuego(String titulo, String genero, String empresa) {
        this.titulo = titulo;
        this.genero = genero;
        this.empresa = empresa;
    }

    //setter and getter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}


