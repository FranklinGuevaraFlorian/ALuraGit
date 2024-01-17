import Model.Concepto;
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

        Concepto concepto = new Concepto();
        concepto.setTipo("Pago Deuda");
        concepto.setDescripcion("Me pagaron la deuda del 1400 soles");

        Importe importe = new Importe();
        importe.setCantidadDinero(1400.0);
        importe.setFecha(LocalDate.now());
        importe.setConcepto(concepto);

        lista.forEach(financiera -> System.out.println(financiera));

        ServiciosEntidadFinanciera serviciosEntidadFinanciera = new ServiciosEntidadFinanciera(lista);
        System.out.println("Saldo general actual: " + serviciosEntidadFinanciera.sumarAlSaldo().getDineroDisponible() + "\n");
        String message = "";
        message = serviciosEntidadFinanciera.deposito("BBVA", importe);
        System.out.println(message);
        System.out.println("******************************************************");

        lista.forEach(financiera -> System.out.println(financiera));
        System.out.println("Saldo general actual: " + serviciosEntidadFinanciera.sumarAlSaldo().getDineroDisponible() + "\n");

        System.out.println("******************************************************");

        Importe importe1 = new Importe();
        importe1.setCantidadDinero(2500.45);
        importe1.setFecha(LocalDate.now());
        importe1.setConcepto(concepto);
        message = serviciosEntidadFinanciera.deposito("Interbank",importe1);
        System.out.println(message);

        lista.forEach(financiera -> System.out.println(financiera));
        System.out.println("Saldo general actual: " + serviciosEntidadFinanciera.sumarAlSaldo().getDineroDisponible() + "\n");

    }
}