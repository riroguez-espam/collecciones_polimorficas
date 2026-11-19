public class PagoEfectivo extends MetodoPago {
    private double montoEntregado;

    public PagoEfectivo() {
        super();
    }

    public PagoEfectivo(String referencia, String titular, double montoBase, double montoEntregado) {
        super(referencia, titular, montoBase);
        this.montoEntregado = montoEntregado;
    }

    public double getMontoEntregado() {
        return montoEntregado;
    }

    public void setMontoEntregado(double montoEntregado) {
        this.montoEntregado = montoEntregado;
    }

    public double calcularVuelto() {
        return this.montoEntregado - getMontoBase();
    }

    @Override
    public void mostrarComprobante() {
        System.out.println("----- COMPROBANTE DE PAGO (EFECTIVO) -----");
        System.out.println("Referencia: " + getReferencia());
        System.out.println("Titular: " + getTitular());
        System.out.println("Monto Base: $" + getMontoBase());
        System.out.println("Monto Entregado: $" + montoEntregado);
        System.out.println("Vuelto: $" + calcularVuelto());
        System.out.println("------------------------------------------");
    }

    @Override
    public void mostrarimpuesto() {
        System.out.println("Pago efectivo no lleva impuesto");
    }

}
