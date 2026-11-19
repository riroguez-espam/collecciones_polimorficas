import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista polimórfica de objetos de tipo MetodoPago
        List<MetodoPago> listaPagos = new ArrayList<>();

        // Se agregan automáticamente pagos en efectivo, tarjeta, billetera digital, etc.
        listaPagos.add(new PagoEfectivo("REF-EF01", "Carlos Mendoza", 150.00, 200.00));
        listaPagos.add(new PagoTarjeta("REF-TJ01", "María López", 85.50, "VISA"));
        listaPagos.add(new PagoDigital("REF-BD01", "Juan Perez", 45.00, "Yape / Billetera Digital"));
        listaPagos.add(new PagoEfectivo("REF-EF02", "Ana Gómez", 60.00, 100.00));
        listaPagos.add(new PagoTarjeta("REF-TJ02", "Pedro Ruiz", 210.00, "Mastercard"));
        listaPagos.add(new PagoDigital("REF-BD02", "Lucía Torres", 30.00, "Plin / Billetera Digital"));
        listaPagos.add(new PagoTransferencia("REF-TR01", "David Vargas", 500.00, "Banco Pichincha"));

        // Instancia del procesador de pagos
        ProcesadorPago procesador = new ProcesadorPago();

        // Generar resumen informe de pagos usando instanceof
        procesador.resumenInformePagos(listaPagos);
    }
}
