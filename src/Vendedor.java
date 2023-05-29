public class Vendedor extends Empleado implements CobrarSueldo{
    private int totalVentasMensuales;





    ///METODOS///////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///CONSTRUCTORES.///
    ///--->CON PARAMETROS
    public Vendedor(String legajo, String nombre, String direccion, String fechaNacimiento, int totalVentasMensuales) {
        super(legajo, nombre, direccion, fechaNacimiento);
        this.totalVentasMensuales = totalVentasMensuales;
    }

    //--->VACIO

    public Vendedor() {
    }


    ///GETTERS Y SETTERS////////////////////////////////////////////////////////////////////////////////////////////////


    public int getTotalVentasMensuales() {
        return totalVentasMensuales;
    }

    public void setTotalVentasMensuales(int totalVentasMensuales) {
        this.totalVentasMensuales = totalVentasMensuales;
    }


    ///TOSTRING////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {

        return super.toString() + " Rol: Vendedor)";
    }

    ///OTROS METODOS//////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public int cobrarSueldo() {
        return ((30*this.totalVentasMensuales)/100);
    }

}
