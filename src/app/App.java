package app;

public class App {
    public static void main(String[] args) throws Exception {
        int edad;
        Olimpiada olimpiadaCoronaEdition;
        olimpiadaCoronaEdition = new Olimpiada();

        Maratonista maratonista1;
        maratonista1 = new Maratonista();
        maratonista1.nombre = "Sonic";
        maratonista1.procedencia = "Alemania";
        maratonista1.pasaporte = "AL33564789";
        maratonista1.edad = 35;
        maratonista1.categoria = "Categoria 1";
        maratonista1.energia = 97;

        boolean corrio;

        //maratonista1.participar(olimpiadaCoronaEdition);
        //mientras la energia sea mayor que 0 el maratonista CORRE
        while (maratonista1.energia > 0) {

            corrio = maratonista1.correr();

           /* if (corrio) {
                System.out.println("El maratonista " + maratonista1.nombre + " corrió");

            } else {
                System.out.println("El maratonista " + maratonista1.nombre + " no corrió");

            }*/

            if(maratonista1.energia <=0 ){
                System.out.println("Valor de energia " + maratonista1.energia + " ." + maratonista1.nombre + " ha dejado de correr.");

            }

        }//fin while

        Basquetbolista basquetbolista = new Basquetbolista();
        basquetbolista.nombre ="Manu";
        basquetbolista.entrenar();
        //Olimpiada es una clase que NO se instancian objetos 
        //la lista de participantes a nivel GLOBAL
        //No habia participantes
        olimpiadaCoronaEdition.inscribirDeportista(maratonista1);
        olimpiadaCoronaEdition.inscribirDeportista(basquetbolista);

        int cantidadDeParticipantes;
        cantidadDeParticipantes  = olimpiadaCoronaEdition.participantes.size();//tamaño de la lista
        System.out.println("La cantidad de participantes es " +cantidadDeParticipantes );    

    
    }
}


