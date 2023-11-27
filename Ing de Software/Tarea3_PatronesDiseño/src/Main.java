/**
 * Clase principal que ejecuta el programa.
 */
public class Main {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Definimos los partidos, con sus respectivos equipos y estadios.
        TournamentComponent match1 = new Match("Cuarto de final 1", "Estadio Elías Figueroa Brander", "Chile", "Uruguay");
        // ... (otros partidos)

        // Definimos las rondas del torneo, con sus respectivos partidos.
        TournamentComponent quarterfinal = new TournamentRound("Cuarto de final", "Valparaiso");
        // ... (otras rondas)

        // Desplegamos los partidos del torneo, a partir de la final.
        finals.display();

        // Buscamos un partido por nombre.
        String name = "Cuarto de final 1";
        TournamentComponent searchedMatch = finals.search(name);

        // Si encontramos el partido, lo mostramos.
        if(searchedMatch != null){
            System.out.println("Encontrado, la informacion de lo buscado es: ");
            searchedMatch.display();
        } else {
            System.out.println(name + " no encontrado");
        }

        // Eliminamos un partido por nombre.
        System.out.println("Eliminando: "+ name);
        finals.remove(name);

        // Buscamos el partido eliminado para verificar que se ha eliminado.
        TournamentComponent searchDeletedMatch = finals.search(name);

        // Si encontramos el partido, significa que no se eliminó correctamente.
        if(searchDeletedMatch != null){
            System.out.println("Encontrado, la informacion de lo buscado es: ");
            searchDeletedMatch.display();
        } else {
            System.out.println(name + " no encontrado");
        }

        // Desplegamos los partidos del torneo, a partir de la final, para verificar que el partido se eliminó.
        finals.display();
    }
}