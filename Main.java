public class Main {
    public static void main(String[] args) {
        LugarTuristico sanMartin = new LugarTuristico("San Martin de los Andes",500, 1000);
        Excursion excursionPrueba = new Excursion(sanMartin,20, 1000);
        AlquilerVehiculo honda = new AlquilerVehiculo(1000,3,true);
        System.out.println(honda.getPrecio());
    }


}
