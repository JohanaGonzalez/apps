public class Matricula extends Liquidacion{

    public Matricula(Liquidacion_Servicio Liq ){
       // super.setEstudiante(10);
        super.setTipo("Matricula");
        super.setTotal(Liq.ValorMatricula());

    }

    @Override
    public int getCosto() {
        return 0;
    }
}
