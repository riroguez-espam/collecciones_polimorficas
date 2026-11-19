public class PagoTarjeta extends MetodoPago {
    private String marcaTarjeta;

    public PagoTarjeta() {
        super();
    }

    public PagoTarjeta(String referencia, String titular, double montoBase, String marcaTarjeta) {
        super(referencia, titular, montoBase);
        this.marcaTarjeta = marcaTarjeta;
    }

    public String getMarcaTarjeta() {
        return marcaTarjeta;
    }

    public void setMarcaTarjeta(String marcaTarjeta) {
        this.marcaTarjeta = marcaTarjeta;
    }

    @Override
    public void mostrarComprobante() {
        System.out.println("----- COMPROBANTE DE PAGO (TARJETA) -----");
        System.out.println("Referencia: " + getReferencia());
        System.out.println("Titular: " + getTitular());
        System.out.println("Monto Base: $" + getMontoBase());
        System.out.println("Marca de Tarjeta: " + marcaTarjeta);
        System.out.println("-----------------------------------------");
    }
}
