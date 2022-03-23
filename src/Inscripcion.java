public class Inscripcion extends Liquidacion{
private  int base;

    public Inscripcion (Liquidacion_Servicio Liq){
      super.setTipo("Inscripcion");
      super.setTotal(Liq.ValorInscripcion());
      this.base = 50;

  }
  public int getCosto(){
        return base;              //costo base de inscripción y donde se se define el metodo donde se calcula el valor de inscripcion
  }

}
