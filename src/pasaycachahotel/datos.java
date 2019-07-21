package pasaycachahotel;

public class datos {
    private String TipoHabitacion;
    private int precioNoche;
    private int preciototal;
    private int Ndias;

    public datos(String TipoHabitacion, int precioNoche, int preciototal, int Ndias) {
        this.TipoHabitacion = TipoHabitacion;
        this.precioNoche = precioNoche;
        this.preciototal = preciototal;
        this.Ndias = Ndias;
    }

    public String getTipoHabitacion() {
        return TipoHabitacion;
    }

    public void setTipoHabitacion(String TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }

    public int getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(int precioNoche) {
        this.precioNoche = precioNoche;
    }

    public int getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(int preciototal) {
        this.preciototal = preciototal;
    }

    public int getNdias() {
        return Ndias;
    }

    public void setNdias(int Ndias) {
        this.Ndias = Ndias;
    }

    @Override
    public String toString() {
        return TipoHabitacion +precioNoche +preciototal +Ndias;
    }

    
    
    
    
    
    
}
