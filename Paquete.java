import java.lang.reflect.Array;
import java.util.ArrayList;

public class Paquete {
    private ArrayList<LugarTuristico> listaLugares = new ArrayList<>();

    //si puede repetir uso un list

    public void setItinerario(LugarTuristico unLugar){
        if (this.listaLugares.size() == 0) {
            listaLugares.add(unLugar);
        } else if (!this.listaLugares.getLast().getNombre().equals(unLugar.getNombre())) {
            listaLugares.add(unLugar);
        }
    //get(indice-1).getNombre().equals
    }
    public void getItinerario(){
        for (LugarTuristico elemento: listaLugares){
            System.out.print(elemento.getNombre()+' ' + '-');

        }
    }
}




