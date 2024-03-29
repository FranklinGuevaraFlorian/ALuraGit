package Model;

public class Concepto {
    private String tipo;
    private String descripcion;

    public Concepto(){}
    public Concepto(String tipo, String descripcion){
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tipo: " + getTipo() + "\t Descripción: " + getDescripcion();
    }
}
