package Clases;

import java.util.ArrayList;

public class Alumno {
    private String nombreCompleto;
    private Long legajo;
    ArrayList<Notas> listaNotas = new ArrayList<>();

    public Alumno() {
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Long getLegajo() {
        return legajo;
    }

    public void setLegajo(Long legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreCompleto +
                ", Legajo: " + legajo +
                ", Notas: " + listaNotas;
    }

    public void cargarListaNotas(Notas objetoNotas) {
        listaNotas.add(objetoNotas);
    }

    public ArrayList<Notas> getListaNotas() {
        return listaNotas;
    }

    public double calcularPromedio() {
        double sumatoria = 0.0;
        for (Notas nota : listaNotas) {
            sumatoria += nota.getNotaExamen();
        }
        return sumatoria / listaNotas.size();
    }
}