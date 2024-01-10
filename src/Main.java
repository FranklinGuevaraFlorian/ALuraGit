import Model.EntidadFinanciera;
import Model.Importe;
import Model.Saldo;
import Service.ServiciosEntidadFinanciera;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Saldo saldo = new Saldo();

        EntidadFinanciera entidadFinanciera = new EntidadFinanciera();
        entidadFinanciera.setNombreEntidad("Interbank");
        entidadFinanciera.setSaldoDisponible(250.5);

        EntidadFinanciera entidadFinanciera1 = new EntidadFinanciera();
        entidadFinanciera1.setNombreEntidad("BCP");
        entidadFinanciera1.setSaldoDisponible(120.35);

        EntidadFinanciera entidadFinanciera2 = new EntidadFinanciera();
        entidadFinanciera2.setNombreEntidad("BBVA");
        entidadFinanciera2.setSaldoDisponible(15.0);

        ArrayList<EntidadFinanciera> lista = new ArrayList<EntidadFinanciera>();
        lista.add(entidadFinanciera);
        lista.add(entidadFinanciera1);
        lista.add(entidadFinanciera2);

        ServiciosEntidadFinanciera serviciosEntidadFinanciera = new ServiciosEntidadFinanciera(lista);
        String message = "";
        EntidadFinanciera entidadBuscada = null;
        try {
            entidadBuscada = serviciosEntidadFinanciera.buscarEntidad("BCP");
        }catch (Exception e){
            message = e.getMessage();
        }finally {
            System.out.println(entidadBuscada);
        }
        System.out.println(message);

       /* double total = 0.0;
        for (EntidadFinanciera item: lista) {
            total += item.getSaldoDisponible();
            System.out.println(item);
        }
        //System.out.println("\t\t\t\t total:" + total);

        Importe importe = new Importe();
        importe.setCantidadDinero(111.0);
        importe.setFecha(LocalDate.now());

        Importe importe1 = new Importe();
        importe1.setCantidadDinero(240.4);
        importe1.setFecha(LocalDate.now());
        System.out.println(importe1);
*/
    }
}