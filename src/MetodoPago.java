public class MetodoPago {
    private String referencia;
    private String titular;
    private double montoBase;

    public MetodoPago() {
    }

    public MetodoPago(String referencia, String titular, double montoBase) {
        this.referencia = referencia;
        this.titular = titular;
        this.montoBase = montoBase;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getMontoBase() {
        return montoBase;
    }

    public void setMontoBase(double montoBase) {
        this.montoBase = montoBase;
    }

    public void mostrarComprobante() {
        System.out.println("----- COMPROBANTE DE PAGO -----");
        System.out.println("Referencia: " + referencia);
        System.out.println("Titular: " + titular);
        System.out.println("Monto Base: $" + montoBase);
        System.out.println("-------------------------------");
    }

    public void mostrarimpuesto() {
        System.out.println("Impuesto desde clase principal ");
    }
}
