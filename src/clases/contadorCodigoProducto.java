package clases;
public class contadorCodigoProducto {
    
    int aumentador;
    int contador;
    int codigo;

    public contadorCodigoProducto() {
    }

    
    
    public contadorCodigoProducto(int aumentador, int contador, int codigo) {
        this.aumentador = aumentador;
        this.contador = contador;
        this.codigo = codigo;
    }
    
    

    public int getAumentador() {
        return aumentador;
    }

    public void setAumentador(int aumentador) {
        this.aumentador = aumentador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
    
    public void añadirCodigo(){
        codigo = codigo + 1;
    }
    
    
    
}
