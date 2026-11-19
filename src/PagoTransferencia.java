public class PagoTransferencia extends MetodoPago {
    private String nombreBanco;

    public PagoTransferencia() {
        super();
    }

    public PagoTransferencia(String referencia, String titular, double montoBase, String nombreBanco) {
        super(referencia, titular, montoBase);
        this.nombreBanco = nombreBanco;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    @Override
    public void mostrarComprobante() {
        System.out.println("----- COMPROBANTE DE PAGO (TRANSFERENCIA) -----");
        System.out.println("Referencia: " + getReferencia());
        System.out.println("Titular: " + getTitular());
        System.out.println("Monto Base: $" + getMontoBase());
        System.out.println("Nombre del Banco: " + nombreBanco);
        System.out.println("-----------------------------------------------");
    }
}
