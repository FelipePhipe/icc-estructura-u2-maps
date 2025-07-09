import java.net.Socket;

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Felipe Parra"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        System.out.println("RUNHASHMAP: ");
        mapa.runHasMap();
        System.out.println();
        System.out.println("RUNLINKEDHASHMAP: ");
        mapa.runLinkedHashMap();
        System.out.println();
        System.out.println("RUNTREEMAP: ");
        mapa.runTreeMap();
        System.out.println();
        System.out.println("RUNHASHMAPOBJ: ");
        mapa.runHashMapObj();
        System.out.println();
        System.out.println("RUNTREEMAPOBJ: ");
        mapa.runTreeMapObj();
    }

    private static void runEmpleadoExample() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
