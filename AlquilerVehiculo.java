public class AlquilerVehiculo {

    private int ganancia;
    private int cantidadDeDias;

    private boolean seguroFull;

    private int precioTotal;

   public AlquilerVehiculo(int ganancia,int cantidadDeDias, boolean seguroFull) {
       this.ganancia = ganancia;
       this.cantidadDeDias = cantidadDeDias;
       this.seguroFull = seguroFull;
   }

   private void calcularPrecioTotal() {
       int calculo = cantidadDeDias * ganancia;
       int precioSeguro = 0;
       if (seguroFull) {
           precioSeguro = 100000;
       }else {
           precioSeguro = 60000;
       }
       this.precioTotal = calculo + precioSeguro;
   }

   public int getPrecio(){
       calcularPrecioTotal();
       return this.precioTotal;
   }

}
