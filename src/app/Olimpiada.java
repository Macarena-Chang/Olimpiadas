package app;

import java.util.ArrayList;
import java.util.List;
public class Olimpiada {
    //tipo de dato , nombre de variable (participantes. es una lista de deportista)
    //luego del new se instancia deportista
    
    //Inicializando array 
    //ArrayList <tipo> str = new ArrayList<Type>();
    public List <Deportista> participantes = new ArrayList<>(); 
    public void inscribirDeportista(Deportista depor){
        this.participantes.add(depor);
        
    };
}