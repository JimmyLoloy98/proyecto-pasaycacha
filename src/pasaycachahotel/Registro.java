package pasaycachahotel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Registro extends JFrame implements ActionListener {

    private JPanel Panel;
    private JComboBox cboTipoDocumento;
    private JLabel lblTipoDocumento, lblDocumento,lblListaHabitaciones,lblDias;
    private JTextField txtDocumento,txtDias;
    private JButton btnVerificar, btnRegistrar, btnRegresar;
    private JTextArea texClientes;
    private JScrollPane scpClientes, scpServicio;
    private JTable jTablaServicio;
    private DefaultTableModel mdServicio;
    private int conta;
    private int indice=0;
    
    MainRun compara;
    
    private String tempDefoult;
    private String precioN;
    public Registro() {
        JOptionPane.showMessageDialog(null, "Instrucciones: \n 1. Seleccione la habitacion \n 2.Indique la cantidad de dias a Hospedarse \n 3. Digite su documento \n 4. Procese la información \n 5. Registre al Cliente ");
        this.setSize(820, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setBackground(Color.WHITE);
        this.setTitle("REGISTRO");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        IniciarComponentes();
        compara= new MainRun();
    }

    public void IniciarComponentes() {
        Panel();
        EtiquetasJlabel();
        comboBox();
        CajasDeTexto();
        Botones();
        TextoArea();
        jTabla();

    }

    private void Panel() {
        Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setBackground(new Color(255, 255, 255));
        this.add(Panel);

    }

    public void EtiquetasJlabel() {

        lblTipoDocumento = new JLabel("Tipo documento:");
        lblTipoDocumento.setBounds(30, 30, 150, 30);
        lblTipoDocumento.setFont(new Font("Arial", 1, 13));
        Panel.add(lblTipoDocumento);

        lblDocumento = new JLabel("Ingrese documento:");
        lblDocumento.setBounds(30, 70, 150, 30);
        lblDocumento.setFont(new Font("Arial", 1, 13));
        Panel.add(lblDocumento);
        
        lblListaHabitaciones = new JLabel("LISTA DE HABITACIONES");
        lblListaHabitaciones.setBounds(420, 70, 400, 50);
        lblListaHabitaciones.setFont(new Font("Arial", 1, 25));
        Panel.add(lblListaHabitaciones);
        
        lblDias = new JLabel("Dias a quedarse: ");
        lblDias.setBounds(360, 350, 200, 30);
        lblDias.setFont(new Font("Arial", 1, 13));
        Panel.add(lblDias);
    }

    public void comboBox() {
        cboTipoDocumento = new JComboBox();
        cboTipoDocumento.setBounds(180, 30, 150, 30);
        cboTipoDocumento.setFont(new Font("Arial", 1, 13));
        cboTipoDocumento.addItem("DNI");
        cboTipoDocumento.addItem("RUC");
        cboTipoDocumento.addItem("PASAPORTE");
        Panel.add(cboTipoDocumento);

    }

    public void CajasDeTexto() {
        txtDocumento = new JTextField();
        txtDocumento.setFont(new Font("Arial", 1, 13));
        txtDocumento.setBackground(Color.LIGHT_GRAY);
        txtDocumento.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                if(!Character.isDigit(c)){
                        e.consume();
                }
            }
        });
        
        
        
            txtDocumento.addKeyListener(new KeyAdapter() {                
            @Override
            public void keyTyped(KeyEvent e){
                int opcion = cboTipoDocumento.getSelectedIndex();
                if(opcion==0){
                    char c =e.getKeyChar();
                    int indice=txtDocumento.getText().length();
                    if(indice>=8){
                        e.consume();
                    }
                }
                if(opcion==1){
                    char c =e.getKeyChar();
                    int indice=txtDocumento.getText().length();
                    if(indice>=11){
                        e.consume();
                    }
                }
                if(opcion==2){
                    char c =e.getKeyChar();
                    int indice=txtDocumento.getText().length();
                    if(indice>=6){
                        e.consume();
                    }
                }
            }
                            
            });
        
        
        txtDocumento.setBounds(180, 70, 150, 30);
        Panel.add(txtDocumento);
        
        txtDias = new JTextField();
        txtDias.setFont(new Font("Arial", 1, 13));
        txtDias.setBackground(Color.LIGHT_GRAY);
        txtDias.setBounds(490, 350, 150, 30);
        txtDias.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                if(!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        
        txtDias.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                int indice=txtDias.getText().length();
                String demo=txtDias.getText();
                if(indice>=2){
                    e.consume();
                }
            }
        });
        Panel.add(txtDias);

        
    }

    private void Botones() {
        
        ImageIcon imag = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/proceso.png");
        btnVerificar = new JButton("PROCESAR");
        btnVerificar.setBounds(190, 110, 130, 30);
        btnVerificar.setIcon(new ImageIcon(imag.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        btnVerificar.addActionListener(this);
        Panel.add(btnVerificar);
        
        ImageIcon imagen = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/portapap.png");
        btnRegistrar = new JButton("REGISTRAR");
        btnRegistrar.setBounds(230, 600, 130, 30);
        btnRegistrar.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        btnRegistrar.addActionListener(this);
        Panel.add(btnRegistrar);
        
        ImageIcon imagens = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/regresar.png");
        btnRegresar = new JButton("REGRESAR");
        btnRegresar.setBounds(30, 600, 130, 30);
        btnRegresar.setIcon(new ImageIcon(imagens.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        btnRegresar.addActionListener(this);
        Panel.add(btnRegresar);
    }

    private void TextoArea() {
        texClientes = new JTextArea();
        texClientes.setFont(new Font("Andale Mono",3,12));
        scpClientes = new JScrollPane(texClientes);
        scpClientes.setBounds(30, 150, 300, 400);
        Panel.add(scpClientes);

    }

    private void jTabla() {
        mdServicio = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int filas, int columnas){
                    return false;
            }
        };

        mdServicio.addColumn("N° Habitación");
        mdServicio.addColumn("Tipo de habitación(S/.)");
        mdServicio.addColumn("Precio por noche");
        String[] p1 = {"N° 201", "Individual simple", "40"};
        String[] p2 = {"N° 202", "Doble de uso individual", "60"};
        String[] p3 = {"N° 203", "Habitación doble", "70"};
        String[] p4 = {"N° 204", "Con cama supletoria", "70"};
        String[] p5 = {"N° 301", "Habitación triple", "80"};
        String[] p6 = {"N° 302", "Habitación matrimonial", "80"};
        String[] p7 = {"N° 304", "Habitación familiar", "100"};
        String[] p8 = {"N° 401", "Junior Suites", "150"};
        String[] p9 = {"N° 402", "Suite nupcial", "300"};
        String[] p10 = {"N° 403", "Suite", "500"};

        mdServicio.addRow(p1);
        mdServicio.addRow(p2);
        mdServicio.addRow(p3);
        mdServicio.addRow(p4);
        mdServicio.addRow(p5);
        mdServicio.addRow(p6);
        mdServicio.addRow(p7);
        mdServicio.addRow(p8);
        mdServicio.addRow(p9);
        mdServicio.addRow(p10);
        jTablaServicio = new JTable(mdServicio);
        
        jTablaServicio.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                int seleccion = jTablaServicio.rowAtPoint(e.getPoint());
                if(seleccion==0){
                    tempDefoult=String.valueOf(jTablaServicio.getValueAt(0, 1));
                    precioN=String.valueOf(jTablaServicio.getValueAt(0, 2));
                }
                if(seleccion==1){
                    tempDefoult=String.valueOf(jTablaServicio.getValueAt(1, 1));
                    precioN=String.valueOf(jTablaServicio.getValueAt(1, 2));
                }
                if(seleccion==2){
                    tempDefoult=String.valueOf(jTablaServicio.getValueAt(2, 1));
                    precioN=String.valueOf(jTablaServicio.getValueAt(2, 2));
                }
                if(seleccion==3){
                    tempDefoult=String.valueOf(jTablaServicio.getValueAt(3, 1));
                    precioN=String.valueOf(jTablaServicio.getValueAt(3, 2));
                }
                if(seleccion==4){
                    tempDefoult=String.valueOf(jTablaServicio.getValueAt(4, 1));
                    precioN=String.valueOf(jTablaServicio.getValueAt(4, 2));
                }
                if(seleccion==5){
                    tempDefoult=String.valueOf(jTablaServicio.getValueAt(5, 1));
                    precioN=String.valueOf(jTablaServicio.getValueAt(4, 2));
                }
                if(seleccion==6){
                    tempDefoult=String.valueOf(jTablaServicio.getValueAt(6, 1));
                    precioN=String.valueOf(jTablaServicio.getValueAt(6, 2));
                }
                if(seleccion==7){
                    tempDefoult=String.valueOf(jTablaServicio.getValueAt(7, 1));
                    precioN=String.valueOf(jTablaServicio.getValueAt(7, 2));
                }
                if(seleccion==8){
                    tempDefoult=String.valueOf(jTablaServicio.getValueAt(8, 1));
                    precioN=String.valueOf(jTablaServicio.getValueAt(8, 2));
                }
                if(seleccion==9){
                    tempDefoult=String.valueOf(jTablaServicio.getValueAt(9, 1));
                    precioN=String.valueOf(jTablaServicio.getValueAt(9, 2));
                }
            }
        });
        jTablaServicio.getTableHeader().setReorderingAllowed(false);//para que las celdas no sean modificables
        jTablaServicio.getTableHeader().setResizingAllowed(false);//para que no se pueda reordenas las columnas
        
        if (jTablaServicio.getColumnModel().getColumnCount() > 0) {
            jTablaServicio.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTablaServicio.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTablaServicio.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        scpServicio = new JScrollPane(jTablaServicio);
        scpServicio.setBounds(360, 150, 430, 183);
        Panel.add(scpServicio);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int j=0;
        if(ae.getSource()==btnVerificar){
            String documento=txtDocumento.getText();
            boolean band = true;
            int index=cboTipoDocumento.getSelectedIndex();
            int cromp=txtDocumento.getText().length();
            switch (index){
                case 0: 
                    if(cromp==8){
                        int i;
                        boolean boo=false;
                        if(MainRun.listaClientes.size()>0){
                            for(i=0 ; i<MainRun.listaClientes.size(); i++){
                                if(MainRun.listaClientes.get(i).getDocumento().equals(documento)){                    
                                    boo=true;
                                    conta=i;
                                    indice=i;
                                    break;
                                    
                                }
                            }
                            if(boo==true){
                                texClientes.setText(MainRun.listaClientes.get(i).toString() +"\n Cuarto a alquilar: "+tempDefoult+"\n\n precio por noche: "+precioN+"\n\n EL CLIENTE SI ESTA REGISTRADO,BUEN DIA :)");
                                txtDocumento.setText("");
                                texClientes.getText();
                                indice=i;
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "No se encontro el documento: "+documento);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "No hay personas registradas");

                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Ingrese los 8 digitos del documento");
                    }
                    
                break;
                
                case 1:
                    
                    if(cromp==11){
                        int i;
                        boolean boo=false;
                        if(MainRun.listaClientes.size()>0){
                           
                            for(i=0 ; i<MainRun.listaClientes.size(); i++){
                                if(MainRun.listaClientes.get(i).getDocumento().equals(documento)){                     
                                    boo=true;
                                    j=i;
                                    indice=i;
                                    break;
                                    
                                }
                            }
                            if(boo==true){
                                texClientes.setText(MainRun.listaClientes.get(i).toString() + "\n Cuarto a alquilar: "+tempDefoult+"\n\n precio por noche: "+precioN+"\n\n EL CLIENTE SI ESTA REGISTRADO,BUEN DIA :)");
                                txtDocumento.setText("");
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "No se encontro el documento: "+documento);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "No hay personas registradas");

                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Ingrese los 11 digitos del documento");
                    }
                    
                    break;
                case 2:
                   
                    if(cromp==6){
                        int i;
                        boolean boo=false;
                        if(MainRun.listaClientes.size()>0){
                            for(i=0 ; i<MainRun.listaClientes.size(); i++){
                                if(MainRun.listaClientes.get(i).getDocumento().equals(documento)){                    
                                    boo=true;
                                    indice=i;
                                    break;
                                }
                            }
                            if(boo==true){
                                texClientes.setText(MainRun.listaClientes.get(i).toString());
                                txtDocumento.setText("");
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "No se encontro el documento: "+documento);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "No hay personas registradas");

                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Ingrese los 8 digitos del documento");
                    }
                    break;
                    
            }
        }
        if(ae.getSource()==btnRegistrar){
            String habitacion=txtDias.getText();
            int precioTotal= Integer.parseInt(habitacion)*Integer.parseInt(precioN);
            if(!"".equals(texClientes.getText())){
                if(tempDefoult!=null){
                    array ok = new array();
                    ok.guardarHabitacion((new datos(tempDefoult,Integer.parseInt(precioN),precioTotal,Integer.parseInt(habitacion))),indice);
                    JOptionPane.showMessageDialog(this, "Se registro exitosamente en la habitacion del hotel");
                    JOptionPane.showMessageDialog(this, indice);
                    txtDias.setText("");
                    texClientes.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Elija una habitacion por Favor");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Ingrese un DNI para regsitar");
            }
            
        }
        if(ae.getSource() == btnRegresar){
            interfasPrincipal2 regresar = new interfasPrincipal2();
            regresar.setVisible(true);
            this.setVisible(false);
        }
    }

}
