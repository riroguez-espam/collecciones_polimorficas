import java.util.List;

public class ProcesadorPago {

    public void resumenInformePagos(List<MetodoPago> pagos) {
        int efectivo = 0;
        int tarjeta = 0;
        int digital = 0;
        int transferencia = 0;
        int otros = 0;

        if (pagos != null) {
            for (MetodoPago pago : pagos) {
                if (pago instanceof PagoEfectivo) {
                    efectivo++;
                } else if (pago instanceof PagoTarjeta) {
                    tarjeta++;
                } else if (pago instanceof PagoDigital) {
                    digital++;
                } else if (pago instanceof PagoTransferencia) {
                    transferencia++;
                } else if (pago != null) {
                    otros++;
                }
            }
        }

        System.out.println("========== RESUMEN INFORME DE PAGOS ==========");
        System.out.println("Total de pagos registrados: " + (pagos != null ? pagos.size() : 0));
        System.out.println("Pagos en Efectivo: " + efectivo);
        System.out.println("Pagos con Tarjeta: " + tarjeta);
        System.out.println("Pagos con Billetera Digital: " + digital);
        if (transferencia > 0) {
            System.out.println("Pagos con Transferencia: " + transferencia);
        }
        if (otros > 0) {
            System.out.println("Otros métodos de pago: " + otros);
        }
        System.out.println("==============================================");
    }
}
