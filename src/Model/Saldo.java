package Model;

public class Saldo {
    private Double dineroDisponible;
    public Saldo(){}
    public Double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(Double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }
    public void comer(String comida){}
    public Byte devolverEdad(byte edad){return null;}
    private Integer a;
    private Boolean b;

    @Override
    public String toString() {
        return "Saldo total disponible:" + getDineroDisponible();
    }
}
