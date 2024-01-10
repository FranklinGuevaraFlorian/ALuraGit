package Interfaces;

import Model.Concepto;
import Model.Importe;

import java.time.LocalDate;

public interface ImporteInterface {
    public void guardarMonto(Importe importe, String nombreEntidad);
    public void gastarMonto();
}
