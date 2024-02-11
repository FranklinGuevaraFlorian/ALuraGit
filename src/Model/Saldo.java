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
    private Integer a;
    @Override
    public String toString() {
        return "Saldo total disponible:" + getDineroDisponible();
    }
}
