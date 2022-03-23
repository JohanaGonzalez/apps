public class Generar {
    public static void main(String args[]){

        Liquidacion liquidacionInscripcionEAFIT = new Inscripcion(new Liquidacion_Eafit());
        System.out.println("El valor de su liquidación de " + liquidacionInscripcionEAFIT.getTipo() + " en EAFIT es " + liquidacionInscripcionEAFIT.getTotal());

        Liquidacion liquidacionMatriculaEAFIT = new Matricula(new Liquidacion_Eafit());
        System.out.println("El valor de su liquidación de " + liquidacionMatriculaEAFIT.getTipo() + " en EAFIT es " + liquidacionMatriculaEAFIT.getTotal());

        Liquidacion LiquidacionGradosEAFIT = new Derecho_Grado(new Liquidacion_Eafit());
        System.out.println("El valor de su liquidación de " + LiquidacionGradosEAFIT.getTipo() + " en EAFIT es " + LiquidacionGradosEAFIT.getTotal());
  }
}
