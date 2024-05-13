public class Excursion {
    private int PrecioExcursion;
    private int ganancia;
    private int costoPorKm;
    private LugarTuristico lugarTuristico;

    public Excursion(LugarTuristico unLugar, int costoPorKm, int ganancia) {
        this.lugarTuristico = unLugar;
        this.costoPorKm = costoPorKm;
        this.ganancia = ganancia;
        this.PrecioExcursion = calcularPrecioExcursion();
    }

    public void setCostoPorkm(int valor){
        this.costoPorKm = valor;
    }


    private int calcularPrecioExcursion(){
        int idaVuelta = lugarTuristico.getDistancia() * 2;
        return idaVuelta * costoPorKm + ganancia;
    }

    public int getPrecioExcursion(){
        return this.PrecioExcursion;
    }


}
