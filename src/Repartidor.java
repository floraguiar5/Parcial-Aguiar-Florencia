public class Repartidor implements CobrarSueldo{
    private String nombre;
    private String identificador;
private int kilometroRecorridos;


    ///METODOS///////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///CONSTRUCTOR//
    //--->VACIO//

    public Repartidor() {
    }

    ///--->CON PARAMETROS///

    public Repartidor(String nombre, String identificador, int kilometroRecorridos) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.kilometroRecorridos = kilometroRecorridos;
    }

    //GETTERS Y SETTERS////////////////////////////////////////////////////////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getKilometroRecorridos() {
        return kilometroRecorridos;
    }

    public void setKilometroRecorridos(int kilometroRecorridos) {
        this.kilometroRecorridos = kilometroRecorridos;
    }

    //TO STRING/////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return
                "(Nombre : " + nombre + '\'' +
                "Identificador " + identificador + '\'' +
                "Cantidad de Kilometros Recorridos " + kilometroRecorridos +
                ")";
    }


    //OTROS METODOS/////////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Repartidor that)) return false;

        return identificador.equals(that.identificador);
    }

    @Override
    public int hashCode() {
        return identificador.hashCode();
    }

    //COBRARSUELDO///
    @Override
    public int cobrarSueldo() {
        return kilometroRecorridos*3;
    }

}
