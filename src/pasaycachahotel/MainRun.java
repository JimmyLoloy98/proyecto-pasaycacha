package pasaycachahotel;

import java.util.ArrayList;

public class MainRun {
    //public static datosPersona  arr[]=new datosPersona[10];
    public static int cont=0;
    static ArrayList<datosPersona> listaClientes = new ArrayList<>();
    static ArrayList<datos> listaHabitacion = new ArrayList<>();
    
    //public static datos  registro[]=new datos[10];
    public static int contRegistro=0;

    public static void main(String[] args) {
        menuPrincipal ok = new menuPrincipal();
        ok.setVisible(true);
    }
}
