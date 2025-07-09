package controllers;

import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {
    private Map<Integer, Empleado> empleados;

    public EmpleadoDAOTreeMap() {
        this.empleados = new TreeMap<>();
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

