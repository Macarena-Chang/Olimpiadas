package app;

public class Deportista extends Persona {
    public double altura; 
    public double peso;
    public String deporte; 
    public int numeracionDeportiva; 

    public void participar(Olimpiada olimpiada){
        // a la lista de participantes agregar nuevo item (el que llama, es decir cada deportista)
        //delegacion
        olimpiada.inscribirDeportista(this);


    }


}