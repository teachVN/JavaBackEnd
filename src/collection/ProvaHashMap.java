package collection;

import ereditarieta.Persona;

import java.util.HashMap;
import java.util.Set;

public class ProvaHashMap {

    public static void main(String[] args) {
        HashMap<String, Persona> anagrafica = new HashMap<>();

        Persona p1 = new Persona("Mario", "Rossi", 25);
        Persona p2 = new Persona("Fabio", "Verdi", 27);
        Persona p3 = new Persona("Sara", "Bianchi", 33);


        anagrafica.put("OISUDFSLKJFSLF", p1);
        anagrafica.put("OIWEWRWDKSDSFF", p2);
        anagrafica.put("KJLKJSDOIFJSLK", p3);

        System.out.println(anagrafica.get("OIWEWRWDKSDSFF"));

        System.out.println(anagrafica.containsValue(p3));

        anagrafica.remove("OIWEWRWDKSDSFF");

        System.out.println(anagrafica);

        anagrafica.replace("OISUDFSLKJFSLF", p1, p2);

        System.out.println(anagrafica);

        //procedura per estrarre la chiave conoscendone il valore

        Set<String> cfSet = anagrafica.keySet();

        for(String cf:cfSet){
            if(anagrafica.get(cf).equals(p2)){
                System.out.println(cf);
            }
        }

    }
}
