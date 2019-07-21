package pasaycachahotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class previoComprobante extends JFrame implements ActionListener{
    //panel
    private JPanel panel;
    //etiquetas
    private JLabel tipoComprobante;
    //comboBox
    private JComboBox  cmbTipoComprobante;
    //textFields
    //private JTextField captaTipoDoc;
    //botones
    private JButton verificar, verRegistro;
    
    private JMenuBar menuPrincipal;
    private JMenu opciones;
    private JMenuItem regresar;
    
    public previoComprobante(){
        this.setSize(380,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("HOTEL PASAYCACHA S.A.C");
        iniciarComponentes();
    }
    
    private void iniciarComponentes (){
        panel();
        etiqueta();
        combox();
        boton();
        menu();
    }
    
    private void panel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(255,255,255));
        this.getContentPane().add(panel);
    }
    
    private void etiqueta(){        
        tipoComprobante = new JLabel("Tipo de Comprobante: ");
        tipoComprobante.setBounds(30, 30, 140, 30);
        panel.add(tipoComprobante);
    }
    
    private void combox(){
        String[] items2 = {" BOLETA"," FACTURA"};
        cmbTipoComprobante = new JComboBox(items2);
        cmbTipoComprobante.setBounds(180, 30, 160, 30);
        panel.add(cmbTipoComprobante);
    }
    
    private void boton(){
        
        ImageIcon imag = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/facturar.png");
        verificar = new JButton("EMITIR COMPROBANTE");
        verificar.addActionListener(this);
        verificar.setIcon(new ImageIcon(imag.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        verificar.setBounds(5, 80, 190, 30);
        panel.add(verificar);
        
        verRegistro = new JButton("VER CONSUMOS");
        verRegistro.setBounds(200, 80, 160, 30);
        panel.add(verRegistro);
    }
    
    private void menu(){
        menuPrincipal = new JMenuBar();
        setJMenuBar(menuPrincipal);
        
        ImageIcon imagen = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/ajustes.png");
        opciones = new JMenu("Opciones");
        opciones.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        menuPrincipal.add(opciones);
        
        
        ImageIcon imge = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/regresar.png");
        regresar = new JMenuItem("Regresar");
        regresar.setIcon(new ImageIcon(imge.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        regresar.addActionListener(this);
        opciones.add(regresar);
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == verificar){
                    int opcion = cmbTipoComprobante.getSelectedIndex();
                    if(opcion == 0){
                        Boleta tipoBoleta = new Boleta();
                        tipoBoleta.setVisible(true);
                        dispose();
                    }
                    if(opcion == 1){
                        Factura tipoFactura = new Factura();
                        tipoFactura.setVisible(true);
                        dispose();
                    } 
        }
        
        if(e.getSource() == regresar){
            interfasPrincipal2 regresa = new interfasPrincipal2();
            regresa.setVisible(true);
            dispose();
        }
    }  
}
