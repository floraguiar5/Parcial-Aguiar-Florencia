public class Administrador extends Empleado implements CobrarSueldo {
    private String area;

///METODOS//////////////////////////////////////////////////////////////////////////////////////////////////////////////


    ////CONSTRUCTORES ///
    //---> VACIO

    public Administrador() {
    }

    ///----> PARAMETROS

    public Administrador(String legajo, String nombre, String direccion, String fechaNacimiento, String area) {
        super(legajo, nombre, direccion, fechaNacimiento);
        this.area = area;
    }

    //GETTERS Y SETTERS ////////////////////////////////////////////////////////////////////////////////////////////////

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


///TOSTRING/////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public String toString() {
        return super.toString() +
                " Rol: Administrador )"+
                "Area:" + area + '\'' +
                ')';
    }

    @Override
    public int cobrarSueldo() {
        return 15;
    }
}
