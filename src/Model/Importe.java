package Model;

import Interfaces.ImporteInterface;

import java.time.LocalDate;

public class Importe  {
    private Double cantidadDinero;
    private LocalDate fecha;
    private Concepto concepto;

    public Importe(){}
    public  Importe(Double cantidadDinero, LocalDate fecha,Concepto concepto){
        this.cantidadDinero = cantidadDinero;
        this.fecha = fecha;
        this.concepto = concepto;

    }

    public Double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(Double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Concepto getConcepto() {
        return concepto;
    }

    public void setConcepto(Concepto concepto) {
        this.concepto = concepto;
    }

    @Override
    public String toString() {
        return "Importe: " + getCantidadDinero() +"\t fecha: " + getFecha() + "\n Concepto: " + concepto;
    }
}
