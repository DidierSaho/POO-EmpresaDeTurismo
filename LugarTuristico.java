public class LugarTuristico {
    private String nombre;
    private int distancia;
    private int precio;


    public LugarTuristico(String nombre, int distancia, int precio) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getDistancia(){
        return this.distancia;
    }

    public int getPrecio(){
        return this.precio;
    }

}
