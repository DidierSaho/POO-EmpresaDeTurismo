import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LugarTuristico sanMartin = new LugarTuristico("San Martin de los Andes",500, 1000);
        LugarTuristico villaLangostura = new LugarTuristico("Villa La Angostura",100, 2000);
        LugarTuristico bariloche = new LugarTuristico("Bariloche",50, 100);

        Excursion excursionPrueba = new Excursion(sanMartin,20, 1000);
        AlquilerVehiculo honda = new AlquilerVehiculo(1000,3,true);
        System.out.println(honda.getPrecio());


//        ArrayList<Integer> listaNumero = new ArrayList<>();
//
//        listaNumero.add(1);
//        listaNumero.add(2);
//        System.out.println(listaNumero.size());

        Paquete paquete1 = new Paquete();
        paquete1.setItinerario(sanMartin);
        paquete1.setItinerario(villaLangostura);
        paquete1.setItinerario(sanMartin);
        paquete1.setItinerario(bariloche);
        paquete1.setItinerario(villaLangostura);

        paquete1.getItinerario();
        System.out.println(" ");
        Paquete paquete2 = new Paquete();
        paquete2.setItinerario(villaLangostura);
        paquete2.setItinerario(bariloche);
        paquete2.setItinerario(bariloche);
        paquete2.setItinerario(sanMartin);
        paquete2.getItinerario();
    }


}
