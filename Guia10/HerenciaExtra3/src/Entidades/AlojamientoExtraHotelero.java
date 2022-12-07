
package Entidades;


public class AlojamientoExtraHotelero extends Alojamiento {
   protected Boolean privado;
   protected Integer CantMetrosCuadrados;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(Boolean privado, Integer CantMetrosCuadrados) {
        this.privado = privado;
        this.CantMetrosCuadrados = CantMetrosCuadrados;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Integer getCantMetrosCuadrados() {
        return CantMetrosCuadrados;
    }

    public void setCantMetrosCuadrados(Integer CantMetrosCuadrados) {
        this.CantMetrosCuadrados = CantMetrosCuadrados;
    }

    @Override
    public String toString() {
        return "" + "privado=" + privado + ", CantMetrosCuadrados=" + CantMetrosCuadrados + '}';
    }
   
   public void crearAlojamiento(){
       super.crearHotel();
      int n= (int) ((Math.random()*2)+1);
      if (n==1){
          privado= true;
      }else{
          privado = false;
      }
      CantMetrosCuadrados= (int) ((Math.random()*10000)+1000);
   }
}
