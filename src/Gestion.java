import java.util.ArrayList;

public class Gestion {

    private double sueldosTotales;
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private ArrayList<Repartidor> repartidores = new ArrayList<>();


    ///METODOS//

    ///CONSTRUCTORES ///

///---> CON PARAMETROS

    public Gestion(double sueldosTotales, ArrayList<Empleado> empleados, ArrayList<Repartidor> repartidores) {
        this.sueldosTotales = sueldosTotales;
        this.empleados = empleados;
        this.repartidores = repartidores;
    }


    ///--->VACIO

    public Gestion() {
    }


///GETTERS Y SETTERS ///

    public double getSueldosTotales() {
        return sueldosTotales;
    }

    public void setSueldosTotales(double sueldosTotales) {
        this.sueldosTotales = sueldosTotales;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Repartidor> getRepartidores() {
        return repartidores;
    }

    public void setRepartidores(ArrayList<Repartidor> repartidores) {
        this.repartidores = repartidores;
    }


///OTROS METODOS///


    ///BUSCAR POR LEGAJO //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Empleado encontrarempleado(String legajo) {
        Empleado empleado1 = null; ///---> variable temporal que almacenara los empleados de la lista para realizar la verificacion
        if (this.empleados.size() != 0) { ///----> si la lista posee empleados
            for (int it = 0; it < empleados.size(); it++) {
                empleado1 = empleados.get(it);
                if (empleado1.getLegajo().compareTo(legajo) == 0) {
                    System.out.println("Empleado encontrado");
                    return empleado1;
                }
            }
        }
        return empleado1;
    }


    ///CONTAR EMPLEADOS//////////////////////////////////////////////////////////////////////////////////////////////////////////


    public int contarEmpleados() {
        return this.empleados.size();
    }

    ///AGREGAR EMPLEADO /////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    ///AGREGAR REPARTIDOR////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void agregarRepartidor(Repartidor repartidor) {
        this.repartidores.add(repartidor);
    }


    ///ELIMINAR POR LEGAJO///////////////////////////////////////////////////////////////////////////////////////////////////////////


    public void eliminarEmpleado(String legajo) {
        Empleado empleado1 = null; ///---> variable temporal que almacenara los empleados de la lista para realizar la verificacion
        if (empleados.size() != 0) { ///----> si la lista posee empleados
            for (int it = 0; it < empleados.size(); it++) {
                empleado1 = empleados.get(it);
                if (empleado1.getLegajo().compareTo(legajo) == 0) {
                    empleados.remove(it);
                    System.out.println("Empleado eliminado");
                }

            }
        }

    }

    ///DEVOLVER LISTADO///////////////////////////////////////////////////////////////////////////////////////////////////

    public ArrayList<Empleado> devolverEmpleado() {
        return this.empleados;
    }


    ///CALCULAR SUELDOS DE REPARTIDORES////////////////////////////////////////////////////////////////
    public int calcularTotalSueldosRepartidores() {
        int total = 0;
        Repartidor repartidor1 = null; ///---> variable temporal que almacenara los empleados de la lista para realizar la verificacion
        if (this.repartidores.size() != 0) { ///----> si la lista posee empleados
            for (int it = 0; it < this.repartidores.size(); it++) {
                repartidor1 = this.repartidores.get(it);
                total += repartidor1.cobrarSueldo(); //--->Calcula el total a pagar por empleado y lo suma al total general de empleados
            }
        }
        return total;
    }


    ///CALCULAR SUELDO DE EMPLEADOS////////////////////////////////////////////////////////////////////////////


    public int calcularSueldoEmpleados() {
        int total = 0;

        Empleado empleado;
        for (int it = 0; it < this.empleados.size(); it++) {
            empleado = this.empleados.get(it);

            if (empleado.getClass() == Vendedor.class) {
                total += ((Vendedor) empleado).cobrarSueldo();
            }

            if (empleado.getClass() == Administrador.class) {
                total += ((Administrador) empleado).cobrarSueldo();

            }
        }
        return total;

    }






        ///CALCULAR TOTAL////////////////////////////////////////////////////////////////////////////////////////////

        public int calcularTotalSueldos (){
            int totalRepartidores = calcularTotalSueldosRepartidores();
            int totalEmpleados = calcularSueldoEmpleados();
            return  totalEmpleados+totalRepartidores;
        }


}

