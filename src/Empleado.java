import java.util.Objects;

public abstract class Empleado {
     ///su legajo, nombre, apellido, dirección y
    ///fecha de nacimiento
    private String legajo;
    private String nombre;
    private String Direccion;
    private String fechaNacimiento;



//// CONSTRUCTORES//////////////////////////////////////////////////////////////////////////////////////////////////////

    //---->VACIO
    public Empleado() {
    }

    //----> CON PARAMETROS

    public Empleado(String legajo, String nombre, String direccion, String fechaNacimiento) {
        this.legajo = legajo;
        this.nombre = nombre;
        Direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }


    ///GETTERS SETTERS//////////////////////////////////////////////////////////////////////////////////////////////////

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }



    ///--->ToString


    @Override
    public String toString() {
        return "(Empleado : " +
                "Legajo:" + legajo + '\'' +
                " Nombre:'" + nombre + '\''
                ;
    }

    ///---->equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado empleado)) return false;
        return legajo.equals(empleado.legajo);
    }

    @Override
    public int hashCode() {
        return legajo.hashCode();
    }
    ///---->CompareTo



}
