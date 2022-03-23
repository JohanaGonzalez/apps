public abstract class Liquidacion  {

    //Declarar atributos
   //private int estudiante =  "Estudiante desconocido";     //codigo de estudiante
    private int id_liquidacion; //consecutivo
    private String tipo;        // tipo liquidación
    private int descuento = 1;  // descuento
    private int Total;

    public int getId_liquidacion() {
        return id_liquidacion;
    }

    public void setId_liquidacion(int id_liquidacion) {
        this.id_liquidacion = id_liquidacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
           }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public abstract int getCosto();
}
