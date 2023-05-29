import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ///CARGA DE LOS EMPLEADOS EN LAS LISTAS//// /////////////////////////////////////////////////////
        MensajedeBienvenida();
        Gestion gestion = new Gestion();
        cargarArregloEmpleados(gestion);
        cargarArregloRepartidores(gestion);

///MENU ////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Scanner scan = new Scanner(System.in);
        int opcion = scan.nextInt();

        switch (opcion) {
            case 1: {
                gestion.encontrarempleado("05");
                break;
            }
            case 2: {
                contarEmpleados(gestion);
                break;
            }
            case 3: {
                EliminarEmpleado(gestion);
                break;
            }
            case 4: {
                calcularSueldos(gestion);
                break;
            }
            case 5: {
                System.out.println("Que tenga un dulce dia!");
                break;
            }
            case 6: {AgregarEmpleado(gestion);
            break;}


        }


        scan.close();
    }


    public static void MensajedeBienvenida() {
        System.out.println("Buen Dia!");
        System.out.println("Bienvenido al Sistema de Organizacion de recursos humanos de DulceSitio");
        System.out.println("1: Encontrar Empleado por Legajo ");
        System.out.println("2:Contar Cantidad de Empleados");
        System.out.println("3: Eliminar Empleado");
        System.out.println("4:Calcular sueldos a pagar en total (Empleados + repartidores)");
        System.out.println("5:Salir del sistema");
        System.out.println("6:Agregar empleado");


    }

    public static void cargarArregloEmpleados(Gestion gestion) {
        Vendedor empleado1 = new Vendedor("01", "Choi San", "DulceCalle 1234", "18 octubre 1993", 60000);
        Vendedor empleado2 = new Vendedor("02", "Cristian Ronaldu", "TartaDeManzana 1224", "23 noviembre 1986", 70000);
        Vendedor empleado3 = new Vendedor("03", "Nakamura Namkim", "GummyBear 1343", " 7 Marzo 1990", 90000);
        Administrador empleado4 = new Administrador("04", "Nakamura Niki", "SweetThoot 25", " 9 Marzo 1998", "Marketing");
        Administrador empleado5 = new Administrador("05", "Beatriz Aurora Pinzon", "CaramelApple 3008", " 22 Julio 1998", "Finanzas");
        Administrador empleado6 = new Administrador("06", "Sheldon Cooper", "CinnamonRollo 323", " 21 Junio 1988", "Logistica");

        gestion.agregarEmpleado(empleado1);
        gestion.agregarEmpleado(empleado2);
        gestion.agregarEmpleado(empleado3);
        gestion.agregarEmpleado(empleado4);
        gestion.agregarEmpleado(empleado5);
        gestion.agregarEmpleado(empleado6);

    }

    public static void cargarArregloRepartidores(Gestion gestion) {
        Repartidor empleado1 = new Repartidor("Dave Ghrol", "01", 1002);
        Repartidor empleado2 = new Repartidor("Kim Taehyung", "02", 20002);
        Repartidor empleado3 = new Repartidor("Gerard Way", "03", 20004);

        gestion.agregarRepartidor(empleado1);
        gestion.agregarRepartidor(empleado2);
        gestion.agregarRepartidor(empleado3);

    }

    public static void contarEmpleados(Gestion gestion) {
        int total = gestion.contarEmpleados();
        System.out.println("El total de empleados es " + total);
    }

    public static void EliminarEmpleado(Gestion gestion) {
        System.out.println("Lista antes de eliminar empleado" + gestion.getEmpleados());
        gestion.eliminarEmpleado("03");
        System.out.println("Lista luego de eliminar empleado: " + gestion.getEmpleados());
    }

    public static void calcularSueldos(Gestion gestion) {
        int total = gestion.calcularSueldoEmpleados();
        System.out.println("Total A pagar " + total);
    }

    public static void AgregarEmpleado (Gestion gestion){
        ///REALISTICAMENTE EL DATE DE EL EMPLEADO DEBERIA SER PASADO POR TECLADO, PERO LO HARDOCODEO ACA PARA DEMOSTRAR QUE FUNCIONA///
        Vendedor empleado1 = new Vendedor("08", "Choi Sannie", "Dulce 3554", "3 marzo 1997", 60000);
    gestion.agregarEmpleado(empleado1);
        System.out.println("Empleado Agregado correctamente");
        System.out.println(empleado1);


    }

}


