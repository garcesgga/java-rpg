package Armar;
 
import java.util.ArrayList;
import java.util.List;

public class Arsenal{
    public static List<Arma_IF> arsenal = new ArrayList<>(100);
    
    
    public static void addArma(){
        arsenal.add(new Fuzil());
        arsenal.add(new Revolver());
        arsenal.add(new Desarmado());
        arsenal.add(new Faca());
        arsenal.add(new MagiaFogo());
        arsenal.add(new MagiaAgua());
        arsenal.add(new MagiaEscudo());
        arsenal.add(new GarrasTriplas());
        arsenal.add(new SoproDeFogo());
    }
    
    
}

