package Model;

public class EntidadFinanciera {
    private String nombreEntidad;
    private Double saldoDisponible;
    private String cliente;

    public EntidadFinanciera(){}
    public EntidadFinanciera(String nombreEntidad, Double saldoDisponible) {
        this.nombreEntidad = nombreEntidad;
        this.saldoDisponible = saldoDisponible;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public Double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(Double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public String toString() {
        return "Entidad: " + getNombreEntidad() + "\t Saldo: " + getSaldoDisponible();
    }
}
