package Service;

import Excepciones.EntidadFinancieraException;
import Interfaces.ImporteInterface; 
import Model.EntidadFinanciera;
import Model.Importe;

import java.time.LocalDate;

public class ServiciosImportes implements ImporteInterface {

    @Override
    public void guardarMonto(Importe importe, String nombreEntidad) {
        ServiciosEntidadFinanciera serviciosEntidadFinanciera = new ServiciosEntidadFinanciera();

        EntidadFinanciera entidadFinanciera = null;
        double monto = 0.0;

        try {
            entidadFinanciera = serviciosEntidadFinanciera.buscarEntidad(nombreEntidad);
            monto = entidadFinanciera.getSaldoDisponible();
            monto += importe.getCantidadDinero();
            entidadFinanciera.setSaldoDisponible(monto);
        }catch (EntidadFinancieraException e){

        }






    }

    @Override
    public void gastarMonto() {

    }
}
