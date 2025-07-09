package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    private Map<Integer, Empleado> empleados;

    public EmpleadoDAOHashMap() {
        this.empleados = new HashMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp.getId(), emp);
        
    }

    @Override
    public void list() {
        for (Empleado e : empleados.values()) {
            System.out.println(e);
        }
    }

    @Override
    public void remove(int id) {
        empleados.remove(id);
        
    }
}
