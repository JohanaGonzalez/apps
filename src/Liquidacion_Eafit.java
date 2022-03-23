public class Liquidacion_Eafit implements Liquidacion_Servicio {
    public boolean descuento;  // descuento

    public Liquidacion_Eafit() {
        this.descuento = false;

    }
    @Override
    public int Valor(){
        if (descuento){
            return 50 - 10;}
        else {
            return 50;
        }
    }

    @Override
    public int ValorMatricula() {
        return 100;
    }

    @Override
    public int ValorInscripcion() {
        if (descuento){
            return 50 - 10;}
        else {
            return 50;
        }
    }

    @Override
    public int ValorDerechosGrado() {
        return ValorMatricula() * 15 / 100 ;
    }
}
