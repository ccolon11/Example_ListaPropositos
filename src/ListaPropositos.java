import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Carlos Colón
 */
public class ListaPropositos {
    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        String respuesta;
        int i;
        int K = 2;
        
        System.out.println("Ingrese su Proposito del Año");
        bufEntrada.readLine();
        System.out.println("Ingrese Fecha Actual");
        bufEntrada.readLine();
        
        //se establece la cantidad de propositos que podrá guardar
        //el usuario mediante el bucle for
        for (i = 0; i < K; i++){
        System.out.println("¿Desea Agregar otro Proposito a su Lista? Si/No");
        respuesta = bufEntrada.readLine();
        if (respuesta.equals("no")) {break;}
        System.out.println("Ingrese Nuevo Propósito de Año");
        bufEntrada.readLine();}
            
        System.out.println("¿Desea Guardar Propósito(s) Ingresado? Si/No");
        respuesta = bufEntrada.readLine();

        if (respuesta.equals("si")) {System.out.println("Guardado");}

        else if (respuesta.equals("no")) {System.out.println("Programa Finalizado");}

        else {System.out.println("Respuesta Incorrecta");
             System.out.println("Programa Finalizado");}   
    }
}
