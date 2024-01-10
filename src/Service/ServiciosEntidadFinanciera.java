package Service;

import Excepciones.EntidadFinancieraException;
import Interfaces.EntidadFinancieraInterface;
import Model.EntidadFinanciera;

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
        throw new EntidadFinancieraException("No existe Entidad con el nombre");
    }
}
