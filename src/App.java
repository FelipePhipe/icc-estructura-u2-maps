import java.net.Socket;

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Felipe Parra"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    /*private static void runMapExamlpe() {
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
        System.out.println("RUNTREEMAPOBJ:  ");
        mapa.runTreeMapObj();
    }*/

    private static void runEmpleadoExample() {
        EmpleadoContoller empleadoContollerHash = new EmpleadoContoller(new EmpleadoDAOHashMap());
        EmpleadoContoller empleadoContollerTree = new EmpleadoContoller(new EmpleadoDAOTreeMap());



        Empleado emp1= new Empleado(4, "Pedro", "DEV");
        Empleado emp2= new Empleado(2, "Pedro", "DEV");
        Empleado emp3= new Empleado(5, "Juan", "DEV");
        Empleado emp4= new Empleado(3, "Maria", "DEV");
        Empleado emp5= new Empleado(1, "Juan", "DEV");

        empleadoContollerHash.agregarEmpleado(emp1);
        empleadoContollerHash.agregarEmpleado(emp2);
        empleadoContollerHash.agregarEmpleado(emp3);
        empleadoContollerHash.agregarEmpleado(emp4);
        empleadoContollerHash.agregarEmpleado(emp5);

        empleadoContollerTree.agregarEmpleado(emp1);
        empleadoContollerTree.agregarEmpleado(emp2);
        empleadoContollerTree.agregarEmpleado(emp3);
        empleadoContollerTree.agregarEmpleado(emp4);
        empleadoContollerTree.agregarEmpleado(emp5);


        System.out.println("---HASH MAP---");
        empleadoContollerHash.list();
        empleadoContollerHash.remove(2);
        System.out.println("LISTA DE EMPLEADOS ELIMINADOS");
        empleadoContollerHash.list();
        System.out.println();

        System.out.println("---TREE MAP---");
        empleadoContollerTree.list();
        empleadoContollerTree.remove(2);
        System.out.println("LISTA DE EMPLEADOS ELIMINADOS");
        empleadoContollerTree.list();

    }

    private static void runEjerccios() {
        Ejercicios e = new Ejercicios();

        System.out.println("Anagramas (listen, silent): " + Ejercicios.areAnagrams("listen", "silent"));
        System.out.println("Anagramas (hello, bello): " + Ejercicios.areAnagrams("hello", "bello"));

        int[] resultado = e.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
        if (resultado != null)
            System.out.println("Índices que suman 5: [" + resultado[0] + ", " + resultado[1] + "]");
        else
            System.out.println("No hay suma igual a 5");

        e.contarCaracteres("hola");
        System.out.println("sonAnagramas(roma, amor): " + e.sonAnagramas("roma", "amor"));


    }
}
