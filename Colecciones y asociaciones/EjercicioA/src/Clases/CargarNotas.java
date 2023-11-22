package Clases;

import java.util.ArrayList;

import java.util.Scanner;



    public class CargarNotas {
        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
            String respuestaNotas;
            String respuestaAlumno;
            do {
                Alumno alumno=new Alumno();

                System.out.println("CARGAR ALUMNO.");
                System.out.print("Nombre completo: ");
                alumno.setNombreCompleto(leer.next());
                System.out.print("Legajo: ");
                alumno.setLegajo(leer.nextLong());

                System.out.println("-------------------------");

                System.out.println("CARGAR NOTAS.");
                do{
                    Notas notas = new Notas();
                    System.out.print("Nombre de la catedra: ");
                    notas.setCatedra(leer.next());

                    System.out.print("Nota del examen de " + notas.getCatedra() + ": ");
                    notas.setNotaExamen(leer.nextDouble());

                    alumno.cargarListaNotas(notas);

                    System.out.print("¿Cargar mas notas? (s/n): ");
                    respuestaNotas = leer.next().toLowerCase();
                    while (!respuestaNotas.equals("s")&&!respuestaNotas.equals("n")){
                        System.out.print("Ingrese una respuesta correcta: ");
                        respuestaNotas = leer.next().toLowerCase();
                    }

                }while (!respuestaNotas.equals("n"));

                alumnos.add(alumno);

                System.out.print("¿Cargar otro alumno? (s/n): ");
                respuestaAlumno = leer.next().toLowerCase();
                while (!respuestaAlumno.equals("s")&&!respuestaAlumno.equals("n")){
                    System.out.print("Ingrese una respuesta correcta: ");
                    respuestaAlumno = leer.next().toLowerCase();
                }


            } while (!respuestaAlumno.equals("n"));

            System.out.println("------------------------------------------");
            System.out.println("PROMEDIO DE NOTAS POR ALUMNO.");
            for (Alumno alumno: alumnos) {
                System.out.println(alumno);
                System.out.println("El promedio de notas es: " +alumno.calcularPromedio());

            }
        }
    }
