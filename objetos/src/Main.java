import Auto.Auto;
import Persona.Persona;
import Videojuego.Videojuego;
import java.util.Arrays;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        //vamos a instanciar una clase (crear un objeto)
        Persona persona1 = new Persona();
        persona1.setNombre("Sofia");
        Persona persona2 = new Persona("Camila");
        System.out.println("La primera persona es " + persona1.getNombre());
        System.out.println("¿Qué estás haciendo " + persona1.getNombre() + "?");
        System.out.println("Respuesta: ");
        persona1.caminar();


        //VIDEOJUEGO identacion
        Videojuego videojuego1 = new Videojuego();
        videojuego1.setTitulo("Super Mario Bros");
        videojuego1.setGenero("Videojuego de plataformas");
        videojuego1.setEmpresa("Nintendo");
        System.out.println("El primer videojuego es " + videojuego1.getTitulo());
        System.out.println("Su género es: " + videojuego1.getGenero());
        System.out.println("La empresa creadora es: " + videojuego1.getEmpresa());

        System.out.println(" ");

        Videojuego videojuego2 = new Videojuego();
        videojuego2.setTitulo("Crash Bash");
        videojuego2.setGenero("Videojuego de plataformas");
        videojuego2.setEmpresa("Sony Computer Entertainment");
        System.out.println("El segundo videojuego es " + videojuego2.getTitulo());
        System.out.println("Su género es: " + videojuego2.getGenero());
        System.out.println("La empresa creadora es: " + videojuego2.getEmpresa());


        //AUTO identacion
        Auto auto1 = new Auto();
        auto1.setPatente("123ABC");
        auto1.setMarca("Ford");
        auto1.setModelo("Mustang");
        System.out.println("El primer auto es " + auto1.getMarca());
        System.out.println("Su modelo es: " + auto1.getModelo());
        System.out.println("La patente es: " + auto1.getPatente());

        System.out.println(" ");

        Auto auto2 = new Auto();
        auto1.setPatente("456DEF");
        auto1.setMarca("Toyota");
        auto1.setModelo("Corolla");
        System.out.println("El segundo auto es: " + auto1.getMarca());
        System.out.println("Su modelo es: " + auto1.getModelo());
        System.out.println("La patente es: " + auto1.getPatente());

         */

        String nombre;
        Persona[] arrayPersonas = new Persona[4];

        for (int i = 0; i < arrayPersonas.length; i++) {
            nombre = JOptionPane.showInputDialog("Ingrese su nombre");
            arrayPersonas[i] = new Persona(nombre); // en esta seccion creamos el nuevo objeto en el array. acá añadimos el objeto al array
        }
        for (int i = 0; i < arrayPersonas.length; i++) {
            System.out.println("Persona " + i + " " + arrayPersonas[i].getNombre());

        }

        for (int i = 0; i < arrayPersonas.length; i++) {
            if(arrayPersonas[0] == i){

            }
        }
    }




}
