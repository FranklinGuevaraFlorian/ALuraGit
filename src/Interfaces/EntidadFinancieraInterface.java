package Interfaces;

import Excepciones.EntidadFinancieraException;
import Model.EntidadFinanciera;

public interface EntidadFinancieraInterface {
    public EntidadFinanciera buscarEntidad(String nombreEntidad) throws EntidadFinancieraException;
}
