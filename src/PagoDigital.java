public class PagoDigital extends MetodoPago {
    private String nombrePlataforma;

    public PagoDigital() {
        super();
    }

    public PagoDigital(String referencia, String titular, double montoBase, String nombrePlataforma) {
        super(referencia, titular, montoBase);
        this.nombrePlataforma = nombrePlataforma;
    }

    public String getNombrePlataforma() {
        return nombrePlataforma;
    }

    public void setNombrePlataforma(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
    }

    @Override
    public void mostrarComprobante() {
        System.out.println("----- COMPROBANTE DE PAGO (DIGITAL) -----");
        System.out.println("Referencia: " + getReferencia());
        System.out.println("Titular: " + getTitular());
        System.out.println("Monto Base: $" + getMontoBase());
        System.out.println("Plataforma: " + nombrePlataforma);
        System.out.println("-----------------------------------------");
    }
}
