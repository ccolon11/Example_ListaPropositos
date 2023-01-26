

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Carlos Colón
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        String respuesta;

        System.out.println("Ingrese su Proposito del Año");
        bufEntrada.readLine();

        System.out.println("Ingrese Fecha Inicio del Proposito");
        bufEntrada.readLine();

        System.out.println("¿Desea Agregar otro Proposito a su Lista? Si/No");
        respuesta = bufEntrada.readLine();

        switch(respuesta) {
            case "si":
                System.out.println("Ingrese Nuevo Proposito de Año");
                bufEntrada.readLine(); break;}

        switch(respuesta) {
            case "no":
                break;}

        System.out.println("¿Desea Guardar su Lista de Proposito? Si/No");
        respuesta = bufEntrada.readLine();

        switch (respuesta){
            case "si":
                System.out.println("Guardado");
                break;}

        switch (respuesta){
            case "no":
                System.out.println("Programa Finalizado");}
    }
}