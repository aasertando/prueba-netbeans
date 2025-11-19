package clases;
public class clase3EnviarDatosTabla {
    int codigo;
    String nombre;
    double precio;
    int cantidad;

    //inicio constructor
    public clase3EnviarDatosTabla(int codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public clase3EnviarDatosTabla() {
    }
    
    //fin constructor
    
    
    //inicio getter y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    //fin getter y setters
    
    
    
}
