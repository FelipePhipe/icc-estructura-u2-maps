package models;


public class Empleado implements Comparable<Empleado>{
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public int hashCode(){
        return id ;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        // Comprueba si el objeto es null o de diferente clase
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Castea el objeto a la clase actual
        Empleado otraPersona = (Empleado) obj;
        // Compara los atributos
        return id == otraPersona.id;
    }

    



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }

    @Override
    public int compareTo(Empleado o) {

        int result= Integer.compare(this.id,o.id);
        if(result!=0){
            return result;
        }
        int resultName= this.name.compareTo(o.name);
        //if(resultName!=0){
            return resultName;
        //}
        
    }
}