package Interfaces;

import Excepciones.EntidadFinancieraException;
import Model.EntidadFinanciera;
import Model.Importe;
import Model.Saldo;

public interface EntidadFinancieraInterface {
    public EntidadFinanciera buscarEntidad(String nombreEntidad) throws EntidadFinancieraException;
    public String deposito(String nombreEntidad, Importe importe);
    public void retiro(String nombreEntidad,Importe importe);
    public Saldo sumarAlSaldo();
}
