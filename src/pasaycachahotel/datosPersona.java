package pasaycachahotel;

public class datosPersona {
    private  String nombre;
    private  int edad;
    private  String documento;
    private  String sexo;
    private  String email;
    private  String procedencia;
    private  String direccion;
    private  int telefono;
    private  int fax;

    public datosPersona(String nombre,int edad, String documento, String sexo, String email, String procedencia, String direccion, int telefono, int fax) {
        this.nombre=nombre;
        this.edad = edad;
        this.documento = documento;
        this.sexo = sexo;
        this.email = email;
        this.procedencia = procedencia;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fax = fax;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return " Nombre:  "+nombre + "\n Edad:  " + edad + "\n Documento:  " + documento + "\n Sexo:  " + sexo + "\n Email:  " + email + "\n Procedencia:  " + procedencia + "\n Dirección:  " + direccion + "\n Fax:  " + fax;
    }

    
}
