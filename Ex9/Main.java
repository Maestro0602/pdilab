package Ex9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Transport> list = new ArrayList<>();

        list.add(new TaxiTransport(200));
        list.add(new MetroTransport(200));
        list.add(new BusTransport(200));

        for(Transport x : list){
            x.display_fare();
        }

    }
}
    


