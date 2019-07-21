package pasaycachahotel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Persona extends JFrame implements ActionListener {
    
    private JPanel panel;
    //
    private JButton btnagregarPersona;
    private JButton btnatras;
    //
    private JTextField cajaNombre;
    private JTextField cajaEdad;
    private JTextField cajaEmail;
    private JTextField cajaProcedencia;
    private JTextField cajaDireccion;
    private JTextField cajaTelefono;
    private JTextField cajaFax;
    private JTextField cajaNroDocumento;
    //
    private JComboBox cmbtipoDocumento;
    private JComboBox cmbsexo;
    private JTextArea  area;
    array ok;
    
    interfasPrincipal2 ventanaPrincipal ;
    public Persona(){
        //ventanaPrincipal = new interfasPrincipal2();
        ok = new array();
        this.setSize(360,550);
        this.setTitle("HOTEL PASAYCACHA Persona");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
        
        
    }

    private void iniciarComponentes(){
        panel();
        etiquetas();
        comboBox();
        cajas();
        botones();
        //caja();
    }
    
    private void panel(){
        panel =new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(255,255,255));
        this.getContentPane().add(panel);
    }
    
    private void etiquetas(){
       
        JLabel anadirPersona =new JLabel("DATOS DEL CLIENTE: ");
        anadirPersona.setFont(new Font("Arial",1,14));
        anadirPersona.setBounds(45,10,150,30);
        panel.add(anadirPersona);
        
    
        JLabel lblnombre =new JLabel("Nombre");
        lblnombre.setFont(new Font("Arial",1,13));
        lblnombre.setBounds(45,40,100,30);
        panel.add(lblnombre);
        
        JLabel lbledad =new JLabel("Edad");
        lbledad.setFont(new Font("Arial",1,13));
        lbledad.setBounds(45,80,100,30);
        panel.add(lbledad);
        
        JLabel lbltipoDocumento =new JLabel("Documento");
        lbltipoDocumento.setFont(new Font("Arial",1,13));
        lbltipoDocumento.setBounds(45,120,100,30);
        panel.add(lbltipoDocumento);
        
        JLabel lblsexo =new JLabel("Sexo");
        lblsexo.setFont(new Font("Arial",1,13));
        lblsexo.setBounds(45,200,100,30);
        panel.add(lblsexo);
        
        JLabel lblemail =new JLabel("Email");
        lblemail.setFont(new Font("Arial",1,13));
        lblemail.setBounds(45,240,100,30);
        panel.add(lblemail);
        
        JLabel lblprocedencia =new JLabel("Procedencia");
        lblprocedencia.setFont(new Font("Arial",1,13));
        lblprocedencia.setBounds(45,280,100,30);
        panel.add(lblprocedencia);
        
        JLabel lblDireccion =new JLabel("Direccion");
        lblDireccion.setFont(new Font("Arial",1,13));
        lblDireccion.setBounds(45,320,100,30);
        panel.add(lblDireccion);
        
        JLabel lblTelefono =new JLabel("Telefono");
        lblTelefono.setFont(new Font("Arial",1,13));
        lblTelefono.setBounds(45,360,100,30);
        panel.add(lblTelefono);
        
        JLabel lblFax =new JLabel("Fax");
        lblFax.setFont(new Font("Arial",1,13));
        lblFax.setBounds(45,400,100,30);
        panel.add(lblFax);
    }
    
    private void cajas(){
        cajaNombre = new JTextField("");
        cajaNombre.setBounds(155, 40, 150, 30);
        cajaNombre.setBackground(Color.lightGray);
        cajaNombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                if(Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        panel.add(cajaNombre);
        
        cajaEdad = new JTextField();
        cajaEdad.setBounds(155, 80, 150, 30);
        cajaEdad.setBackground(Color.lightGray);
        cajaEdad.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                if(!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        
        cajaEdad.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                int indice=cajaEdad.getText().length();
                if(indice>=2){
                    e.consume();
                }
            }
        });
        panel.add(cajaEdad);
        
        cajaNroDocumento = new JTextField();
        cajaNroDocumento.setBackground(Color.lightGray);
        cajaNroDocumento.setBounds(155, 160, 150, 30);
        cajaNroDocumento.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                if(!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        
        cajaNroDocumento.addKeyListener(new KeyAdapter() {                
            @Override
            public void keyTyped(KeyEvent e){
                int opcion = cmbtipoDocumento.getSelectedIndex();
                if(opcion==0){
                    char c =e.getKeyChar();
                    int indice=cajaNroDocumento.getText().length();
                    if(indice>=8){
                        e.consume();
                    }
                }
                if(opcion==1){
                    char c =e.getKeyChar();
                    int indice=cajaNroDocumento.getText().length();
                    if(indice>=11){
                        e.consume();
                    }
                }
                if(opcion==2){
                    char c =e.getKeyChar();
                    int indice=cajaNroDocumento.getText().length();
                    if(indice>=6){
                        e.consume();
                    }
                }
            }
                            
            });
        
        panel.add(cajaNroDocumento);
    
        cajaEmail = new JTextField();
        cajaEmail.setBounds(155, 240, 150, 30);
        cajaEmail.setBackground(Color.lightGray);
        panel.add(cajaEmail);
        
        cajaProcedencia = new JTextField();
        cajaProcedencia.setBounds(155, 280, 150, 30);
        cajaProcedencia.setBackground(Color.lightGray);
        cajaProcedencia.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                if(Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        panel.add(cajaProcedencia);
        
        cajaDireccion = new JTextField();
        cajaDireccion.setBounds(155, 320, 150, 30);
        cajaDireccion.setBackground(Color.lightGray);
        panel.add(cajaDireccion);
        
        cajaTelefono = new JTextField();
        cajaTelefono.setBounds(155, 360, 150, 30);
        cajaTelefono.setBackground(Color.lightGray);
        cajaTelefono.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                if(!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        cajaTelefono.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                int indice=cajaTelefono.getText().length();
                if(indice>=9){
                    e.consume();
                }
            }
        });
        panel.add(cajaTelefono);
        
        cajaFax = new JTextField();
        cajaFax.setBounds(155, 400, 150, 30);
        cajaFax.setBackground(Color.lightGray);
        cajaFax.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                if(!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        cajaFax.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                int indice=cajaFax.getText().length();
                if(indice>=9){
                    e.consume();
                }
            }
        });
        
        panel.add(cajaFax);
    }
    
    private void comboBox(){
        
        String [] documentosCad = {"DNI","RUC","PASAPORTE"};
        cmbtipoDocumento = new JComboBox(documentosCad);
        cmbtipoDocumento.setBounds(155, 120, 150, 30);
        
        panel.add(cmbtipoDocumento);
        
        String [] sexoCad = {"Masculino","Femenino" ,"No definido"};
        cmbsexo= new JComboBox(sexoCad);
        cmbsexo.setBounds(155,200, 150, 30);
        panel.add(cmbsexo);
        
    }
    
    private void botones(){
        
        ImageIcon imges = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/portapap.png");
        btnagregarPersona = new JButton();
        btnagregarPersona.setText("AÑADIR");
        btnagregarPersona.setBounds(45,450 ,110, 35);
        btnagregarPersona.setIcon(new ImageIcon(imges.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        panel.add(btnagregarPersona);
        btnagregarPersona.addActionListener(this);
        
        
        ImageIcon imge = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/regresar.png");
        btnatras = new JButton();
        btnatras.setText("ATRAS");
        btnatras.setBounds(195, 450,110, 35);
        btnatras.setIcon(new ImageIcon(imge.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        btnatras.addActionListener(this);
        panel.add(btnatras);
       
    }
    
    String captarSexo (){
        int op=cmbsexo.getSelectedIndex();
        String sexoCad2="";
                 if(op==0){
                    sexoCad2="masculino";
                }
                if(op==1){
                     sexoCad2="femenino";
                }
                if(op==2){
                     sexoCad2="no definido";
                }
         return sexoCad2;
    }
    String captarTipoDocumento(){
        String DocumentoCad2="";
        int op = cmbtipoDocumento.getSelectedIndex();
            if(op==0){
                DocumentoCad2="DNI";
            }
            if(op==1){
                DocumentoCad2="RUC";
            }
            if(op==2){
                DocumentoCad2="PASAPORTE";
            }
        return DocumentoCad2;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnagregarPersona){
            String nombre=cajaNombre.getText();
            String edad=cajaEdad.getText();
            String documento=cajaNroDocumento.getText();
            String sexo=captarSexo();
            String email=cajaEmail.getText();
            String procedencia =cajaProcedencia.getText();
            String direccion =cajaDireccion.getText();
            String telefono=cajaTelefono.getText();
            String Fax=cajaFax.getText();
            boolean band = true;
            int index=cmbtipoDocumento.getSelectedIndex();
            int cromp=cajaNroDocumento.getText().length();
            int control=Integer.parseInt(cajaEdad.getText());
            if(control>=18 && control<=75){
                switch (index){
                case 0: 
                    cajaNroDocumento.setText("");
                    if(cromp==8){
                        boolean verificar = ok.buscarDocumento(documento);
                        if(verificar){
                            if(nombre.equals("")||documento.equals("")||edad.equals("")||email.equals("")||procedencia.equals("")){
                                JOptionPane.showMessageDialog(rootPane, "Datos incompletos!!");
                                cajaNombre.requestFocus();    
                                band=false;
                            }   
                            if(band){
                                ok.ingresar(new datosPersona(nombre,Integer.parseInt(edad),documento,sexo,email,procedencia,direccion,Integer.parseInt(telefono),Integer.parseInt(Fax)));
                                iniciar();
                                JOptionPane.showMessageDialog(rootPane, "Seregistro exitosamente el cliente!!");
                            }
                        }   
            
                        else{
                            JOptionPane.showMessageDialog(rootPane, "La persona ya esta registrada!!");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Ingrese los 8 digitos del documento");
                    } 
                break;
                
                case 1:
                    cajaNroDocumento.setText("");
                    if(cromp==11){
                        boolean verificar = ok.buscarDocumento(documento);
                        if(verificar){
                            if(nombre.equals("")||documento.equals("")||edad.equals("")||email.equals("")||procedencia.equals("")){
                                JOptionPane.showMessageDialog(rootPane, "Datos incompletos!!");
                                cajaNombre.requestFocus();    
                                band=false;
                            }   
                            if(band){
                                ok.ingresar(new datosPersona(nombre,Integer.parseInt(edad),documento,sexo,email,procedencia,direccion,Integer.parseInt(telefono),Integer.parseInt(Fax)));
                                iniciar();
                            }
                        }   
            
                        else{
                            JOptionPane.showMessageDialog(rootPane, "La persona ya esta registrada!!");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Ingrese los 11 digitos del documento");
                    }
                    
                    break;
                case 2:
                    cajaNroDocumento.setText("");
                    if(cromp==6){
                        boolean verificar = ok.buscarDocumento(documento);
                        if(verificar){
                            if(nombre.equals("")||documento.equals("")||edad.equals("")||email.equals("")||procedencia.equals("")){
                                JOptionPane.showMessageDialog(rootPane, "Datos incompletos!!");
                                cajaNombre.requestFocus();    
                                band=false;
                            }   
                            if(band){
                                ok.ingresar(new datosPersona(nombre,Integer.parseInt(edad),documento,sexo,email,procedencia,direccion,Integer.parseInt(telefono),Integer.parseInt(Fax)));
                                iniciar();
                                JOptionPane.showMessageDialog(null, "Se agrego correctamente el cliente " +nombre);
                            }
                        }   
            
                        else{
                            JOptionPane.showMessageDialog(rootPane, "La persona ya esta registrada!!");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Ingrese los 6 digitos del documento");
                    }
                    break;
                    
                } 
            }
            else{
                JOptionPane.showMessageDialog(null, "Usted no cuneta con la edad requerida para registrarce en el Hotel, Gracias, Buen dia :)");
            }  
        }
        
        if(e.getSource() == btnatras){
            ventanaPrincipal = new interfasPrincipal2();
            ventanaPrincipal.setVisible(true);
            this.setVisible(false);
        }
    }
    

    void iniciar(){
      cajaNombre.setText("");
      cajaEdad.setText("");
      cajaEmail.setText("");
      cajaProcedencia.setText("");
      cajaDireccion.setText("");
      cajaTelefono.setText("");
      cajaFax.setText("");
      cajaNroDocumento.setText("");
      cmbtipoDocumento.setSelectedIndex(0);
      cmbsexo.setSelectedIndex(0);
      cajaNombre.requestFocus();
    }   
}


