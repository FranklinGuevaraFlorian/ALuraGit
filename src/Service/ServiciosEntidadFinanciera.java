package Service;

import Excepciones.EntidadFinancieraException;
import Interfaces.EntidadFinancieraInterface;
import Model.EntidadFinanciera;
import Model.Importe;
import Model.Saldo;

import java.util.ArrayList;

public class ServiciosEntidadFinanciera implements EntidadFinancieraInterface {

    private ArrayList<EntidadFinanciera> entidades;

    public ServiciosEntidadFinanciera(){}
    public ServiciosEntidadFinanciera(ArrayList<EntidadFinanciera> entidades){
        this.entidades = entidades;
    }

    @Override
    public EntidadFinanciera buscarEntidad(String nombreEntidad) throws EntidadFinancieraException {
         for (EntidadFinanciera item: entidades) {
            if(item.getNombreEntidad().equals(nombreEntidad)){
                return item;
            }
        }
        throw new EntidadFinancieraException("No existe Entidad con el nombre: " + nombreEntidad);
    }

    @Override
    public String deposito(String nombreEntidad, Importe importe){

        EntidadFinanciera entidadFinanciera = null;
        double saldo = 0.0;
        String mensaje = "El deposito de: " + importe.getCantidadDinero() + " REGISTRADO";
        try {
            entidadFinanciera = buscarEntidad(nombreEntidad);
            saldo = entidadFinanciera.getSaldoDisponible();
            saldo += importe.getCantidadDinero();
            entidadFinanciera.setSaldoDisponible(saldo);
        }catch (EntidadFinancieraException e){
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override
    public void retiro(String nombreEntidad, Importe importe){

    }

    @Override
    public Saldo sumarAlSaldo() {
        Saldo saldoTotal = new Saldo();
        double saldo = 0.0;
        for (int i = 0; i < entidades.size(); i++){
            saldo += entidades.get(i).getSaldoDisponible();
        }
        saldoTotal.setDineroDisponible(saldo);
        return  saldoTotal;
    }

}
