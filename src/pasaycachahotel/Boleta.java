package pasaycachahotel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class Boleta extends JFrame implements ActionListener{
    //panel
    private JPanel panel;
    //etiquetas
    private JLabel nombreCompania, direcCompania, telfCompania, rucCompania, faxCompania;
    private JLabel tituloCliente, nombreCliente, direcCliente, telfCliente;
    private JLabel titulofactura, fechaFactura, numFactura, numCliente;  
    private JLabel subTotal, tasaImpuesto, impuesto, total;
    private JLabel comentario;
    //boton
    private JButton imprimir;
    //Scroll de tabla
    private JScrollPane scroll1, scroll2;
    //area de texto
    private JTextArea txtComentario;
    private JTextField cajaDocumento;
    private JComboBox comboDocumento;
    //fecha
    private String fechaActual;
    private String fechaDevolver;
    private DefaultTableModel tablaConsumo ;
    private DefaultTableModel tablaPagos;
    private JLabel doc;
    private JButton Procesar;
    private JFileChooser jf= new JFileChooser();
    private final int tasaImp=16;
    public Boleta(){

            this.setSize(580,750);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setResizable(false);
            this.setTitle("BOLETA");
            iniciarComponentes(); 
    }
    
    public void iniciarComponentes(){
        panel();
        etiqueta();
        tabla();
        cajaTexto();
        boton();
    }
    
    private void panel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(255,255,255));
        this.getContentPane().add(panel);
    }
    
    private void etiqueta(){
        //IMAGEN LOGO*******************************************
        ImageIcon imagen = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/1234.jpg");
        JLabel tituloImagen =  new JLabel(imagen);
        tituloImagen.setBounds(330, 120, 240, 160);
        panel.add(tituloImagen);
        //DATOS EMPRESA*****************************************
        nombreCompania = new JLabel("HOTEL PASAYCACHA S.A.C");
        nombreCompania.setBounds(10, 20, 160, 30);
        panel.add(nombreCompania);
        
        direcCompania = new JLabel("Av. AguaVisis #69.");
        direcCompania.setBounds(10, 60, 120, 20);
        panel.add(direcCompania);
        
        telfCompania = new JLabel("Telf:  333 666 999");
        telfCompania.setBounds(10, 80, 120, 20);
        panel.add(telfCompania);
        
        rucCompania = new JLabel("RUC:  20987654326");
        rucCompania.setBounds(10, 100, 120, 20);
        panel.add(rucCompania);
        
        faxCompania = new JLabel("Fax:  123 456 789");
        faxCompania.setBounds(10, 120, 120, 20);
        panel.add(faxCompania);
        //DATOS DE CLIENTE**************************************
        tituloCliente = new JLabel("BOLETA A:");
        tituloCliente.setBounds(10, 170, 120, 30);
        panel.add(tituloCliente);
        
        doc= new JLabel("Tipo de documento: ");
        doc.setBounds(10, 200, 120, 25);
        panel.add(doc);
        
        nombreCliente = new JLabel("Nombre: ");
        nombreCliente.setBounds(10, 200, 120, 25);
        nombreCliente.setVisible(false);
        panel.add(nombreCliente);
              
        direcCliente = new JLabel("Dir: "); 
        direcCliente.setBounds(10, 220, 120, 25);
        direcCliente.setVisible(false);
        panel.add(direcCliente);
                
        telfCliente = new JLabel("Telf: ");
        telfCliente.setBounds(10, 240, 120, 25);
        telfCliente.setVisible(false);
        panel.add(telfCliente);
        
        //DATOS DE FACTURA**************************************
        titulofactura = new JLabel("BOLETA"); 
        titulofactura.setBounds(440, 10, 120, 40);
        panel.add(titulofactura);
                
        fechaFactura = new JLabel("Fecha: "); 
        fechaFactura.setBounds(360, 60, 100, 20);
        panel.add(fechaFactura);
                
        numFactura = new JLabel("Nº de Boleta: "); 
        numFactura.setBounds(360, 80, 100, 20);
        panel.add(numFactura);
                
        numCliente = new JLabel("Nº de Cliente: "); 
        numCliente.setBounds(360, 100, 100, 20);
        panel.add(numCliente);
        //DATOS DE PAGO*****************************************
        
        tasaImpuesto = new JLabel("tasa de impuesto:"); 
        tasaImpuesto.setBounds(350, 540, 110, 20);
        panel.add(tasaImpuesto);        
                
        impuesto = new JLabel("Impuesto: "); 
        impuesto.setBounds(350, 560, 100, 20);
        panel.add(impuesto); 
        
        subTotal = new JLabel("Subtotal: "); 
        subTotal.setBounds(350, 580, 100, 20);
        panel.add(subTotal);        
                
        
                
        total = new JLabel("TOTAL: "); 
        total.setBounds(350, 600, 100, 20);
        panel.add(total);
        //COMENTARIO********************************************
        comentario = new JLabel("COMENTARIOS:");
        comentario.setBounds(10, 520, 120, 30);
        
        panel.add(comentario);
    }
    
    private String fecha(){
        DateFormat fech= new SimpleDateFormat("dd/MM/YY");
        fechaActual=(fech.format(new Date()));
        return fechaActual;
    }
    private String fechaDevol(int dias){
        Date fechaActual=new Date();
        Date nuevaFecha= new Date(fechaActual.getTime()+TimeUnit.DAYS.toMillis(dias));
        DateFormat fech= new SimpleDateFormat("dd/MM/YYY");
        fechaDevolver=fech.format(nuevaFecha);
        return fechaDevolver;
    }
    
    
    private void tabla(){
        //TABLA DE DATOS DE FACTURA*****************************
        String Fecha=fecha();
        Random rd = new Random();
        String  fac= Integer.toString(rd.nextInt(1000));
        DefaultTableModel tablaFactura = new DefaultTableModel();
        tablaFactura.addColumn(Fecha);
        String []p1 = {"00"+fac};
        String []p2 = {"001"};
        tablaFactura.addRow(p1);
        tablaFactura.addRow(p2);
        JTable tabla1 = new JTable(tablaFactura);
        scroll1 = new JScrollPane(tabla1);
        scroll1.setBounds(460, 60, 100, 55);
        panel.add(scroll1);
        
        //TABLA DE DATOS DE CONSUMO**************************
         tablaConsumo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int filas, int columnas){
                    return false;
            }
        };
        tablaConsumo.addColumn("N°");
        tablaConsumo.addColumn("DESCRIPCION");
        tablaConsumo.addColumn("PxUnidad");
        tablaConsumo.addColumn("TOTAL");
        JTable tabla2 = new JTable(tablaConsumo);
        tabla2.getTableHeader().setReorderingAllowed(false);//para que las celdas no sean modificables
        tabla2.getTableHeader().setResizingAllowed(false);
        if (tabla2.getColumnModel().getColumnCount() > 0) {
            tabla2.getColumnModel().getColumn(0).setPreferredWidth(5);
            tabla2.getColumnModel().getColumn(1).setPreferredWidth(345);
            tabla2.getColumnModel().getColumn(2).setPreferredWidth(35);
            tabla2.getColumnModel().getColumn(3).setPreferredWidth(50);
        }
        scroll2 = new JScrollPane(tabla2);
        scroll2.setBounds(10, 310, 550, 200);
        panel.add(scroll2);
        
        //TABLA DE PAGOS EN SOLES
        tablaPagos = new DefaultTableModel();
        tablaPagos.addColumn("Deuda");
        String []r1 = {"   16%"};
        tablaPagos.addRow(r1);
       
        JTable tabla3 = new JTable(tablaPagos);
        scroll1 = new JScrollPane(tabla3);
        scroll1.setBounds(460, 520, 100, 102);
        panel.add(scroll1);
    }
    
    private void cajaTexto(){
        
        String arc[]={"DNI","Pasaporte"};
        comboDocumento= new JComboBox(arc);
        comboDocumento.setBounds(140, 200, 120, 25);
        panel.add(comboDocumento);
        
        txtComentario = new JTextArea();
        txtComentario.setBounds(10, 550, 310, 140);
        txtComentario.setBackground(Color.lightGray);
        panel.add(txtComentario);
        
        
        
        cajaDocumento = new JTextField();
        cajaDocumento.setBounds(120, 240, 150, 25);
        cajaDocumento.setBackground(Color.lightGray);
        panel.add(cajaDocumento);
    }
    
    private void boton(){
        imprimir = new JButton("IMPRIMIR");
        imprimir.setBounds(380, 630, 150, 40);
        imprimir.addActionListener(this);
        panel.add(imprimir);
        
        Procesar = new JButton("Procesar");
        Procesar.setBounds(120, 280, 120, 25);
        Procesar.addActionListener(this);
        panel.add(Procesar);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Procesar){
            String documento= cajaDocumento.getText();
            int impuest;
            int total;
            for (int i = 0; i < MainRun.listaClientes.size(); i++) {
                if(MainRun.listaClientes.get(i).getDocumento().equals(documento)){
                    Procesar.setVisible(false);
                    comboDocumento.setVisible(false);
                    doc.setVisible(false);
                    cajaDocumento.setVisible(false);
                    nombreCliente.setText("Nombre: "+MainRun.listaClientes.get(i).getNombre());
                    nombreCliente.setVisible(true);
                    direcCliente.setText("Dir: "+MainRun.listaClientes.get(i).getDireccion());
                    direcCliente.setVisible(true);
                    
                    telfCliente.setText("Dir: "+MainRun.listaClientes.get(i).getTelefono());
                    telfCliente.setVisible(true);
                    String []cad={Integer.toString(MainRun.listaHabitacion.get(i).getNdias()),"Alquiler de "+MainRun.listaHabitacion.get(i).getTipoHabitacion(),Integer.toString(MainRun.listaHabitacion.get(i).getPrecioNoche()),Integer.toString(MainRun.listaHabitacion.get(i).getPreciototal())};
                    tablaConsumo.addRow(cad);
                    impuest=(MainRun.listaHabitacion.get(i).getPreciototal()*tasaImp)/100;
                    total=impuest+MainRun.listaHabitacion.get(i).getPreciototal();
                    String []r2={Integer.toString(impuest)};
                    String []r3={Integer.toString(MainRun.listaHabitacion.get(i).getPreciototal())};
                    String []r4={Integer.toString(total)};
                    tablaPagos.addRow(r2);
                    tablaPagos.addRow(r3);
                    tablaPagos.addRow(r4);
                    break;
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "El cliente no fue encontrado");
                }
       
            }
            
        }
        if(e.getSource()==imprimir){
            jf.showSaveDialog(this);
            String comando=e.getActionCommand();
            if(comando.equals(JFileChooser.APPROVE_SELECTION)){
                
            }
        }
    }
}
