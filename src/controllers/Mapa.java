package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHasMap(){
        Map<String,String> mapa= new HashMap();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC");

        System.out.println(mapa);
        System.out.println(mapa.keySet());

        for (String c:mapa.keySet()) {
            System.out.println(mapa.get(c));
            
        }
        System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005"));
    }

    public void runLinkedHashMap(){
        Map<Integer,String> mapa= new LinkedHashMap<>();
        mapa.put(1, "Pedro");
        mapa.put(2, "Carlos");
        mapa.put(3, "Dave");
        mapa.put(4, "Jose");
        mapa.put(5, "Francisco");

        for (Integer c:mapa.keySet()) {
            System.out.println(mapa.get(c));
        }


    }

    public void runTreeMap(){
        Map<Integer,String> items= new TreeMap<>();
        items.put(3, "carro");
        items.put(6, "bici");
        items.put(1, "moto");

        for (Integer c:items.keySet()) {
            System.out.println(items.get(c));
        }

    }

    public void runHashMapObj(){
        
        Map<Empleado,Integer> empleados= new HashMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500);
        empleados.put(new Empleado(1, "Diego", "Dev"),3000);


        System.out.print(empleados);
        System.out.println();
        System.out.println(empleados.keySet());

        /*for (Empleado c:empleados.keySet()) {
            System.out.println(empleados.get(c));
        }*/
    }

    
    public void runTreeMapObj(){
        
        Map<Empleado,Integer> empleados= new TreeMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 1200);
        empleados.put(new Empleado(1, "Juan", "Senior"), 3000);

        System.out.print(empleados);
        System.out.println();
        System.out.println(empleados.keySet());

        /*for (Empleado c:empleados.keySet()) {
            System.out.println(empleados.get(c));
        }*/
    

    }
}
