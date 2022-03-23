public class Derecho_Grado extends Liquidacion {

    public Derecho_Grado(Liquidacion_Servicio Liq ) {
        super.setTipo("Derecho_Grado");
        super.setTotal(Liq.ValorDerechosGrado());
    }

    @Override
    public int getCosto() {
        return 0;
    }
}
