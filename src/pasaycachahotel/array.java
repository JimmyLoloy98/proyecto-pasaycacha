package pasaycachahotel;

import javax.swing.JOptionPane;

public class array {
    void ingresar(datosPersona c){
        if(MainRun.listaClientes.size()<10){
                MainRun.listaClientes.add(c);
            MainRun.cont++;
        }
        else{
            JOptionPane.showMessageDialog(null, "El hotel tiene tiene todas sus habitaciones ocupadas, buen dia :)");
        }  
    }
    public boolean buscarDocumento(String document){
            boolean boo=false;
            boolean veri=true;
            if(MainRun.cont>0){
                for(int i=0 ; i<MainRun.listaClientes.size(); i++){
                    if(MainRun.listaClientes.get(i).getDocumento().equals(document)){                     
                        boo=true;
                        break;
                    }
                }
                if(boo==true){
                   veri=false;
                }
            }
            if(MainRun.listaClientes.size()==0){
                veri=true;
            }
           
            return veri;
    }
    public void guardarHabitacion(datos z,int indice){
        if(indice<10){
            //for (int i = 0; i < 1; i++) {
                MainRun.listaHabitacion.add(z);
            //}
            MainRun.contRegistro++;
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay Habitaciones disponibles");
        }
    }
}
