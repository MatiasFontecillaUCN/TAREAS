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
        TournamentComponent match1 = new Match("Cuarto de final 1", "Estadio Elías Figueroa Brander", "Chile",
                "Uruguay");
        TournamentComponent match2 = new Match("Cuarto de final 2", "Estadio Sausalito", "Bolivia", "Perú");
        TournamentComponent match3 = new Match("Cuarto de final 3", "Estadio Elías Figueroa Brander", "Argentina",
                "Colombia");
        TournamentComponent match4 = new Match("Cuarto de final 4", "Estadio Sausalito", "Brasil", "Paraguay");
        TournamentComponent match5 = new Match("Semifinal 1", "Estadio Calvo y Bascuñan", "Chile", "Perú");
        TournamentComponent match6 = new Match("Semifinal 2", "Estadio Calvo y Bascuñan", "Argentina", "Paraguay");
        TournamentComponent match7 = new Match("Final", "Estadio Nacional", "Chile", "Argentina");

        // Defino las rondas del torneo, con sus respectivos partidos. Las rondas de cuartos de final, semifinales y finales.
        TournamentComponent quarterfinal = new TournamentRound("Cuarto de final", "Valparaiso");
        quarterfinal.add(match1);
        quarterfinal.add(match2);
        quarterfinal.add(match3);
        quarterfinal.add(match4);

        TournamentComponent semifinal = new TournamentRound("Semifinales", "Antofagasta");
        semifinal.add(match5);
        semifinal.add(match6);
        semifinal.add(quarterfinal);

        TournamentComponent finals = new TournamentRound("Final", "Copa America");
        finals.add(match7);
        finals.add(semifinal);

        // Despliego los partidos del torneo, a partir de la final.
        finals.display();
        System.out.println("    " );

        // Buscamos un partido por nombre.
        String name = "Cuarto de final 1";
        System.out.println("Buscando: "+name)
        TournamentComponent searchedMatch = finals.search(name);

        // Si encontramos el partido, lo mostramos.
        if(searchedMatch != null){
            System.out.println("Encontrado, la informacion de lo buscado es: ");
            searchedMatch.display();
        } else {
            System.out.println(name + " no encontrado");
        }
        System.out.println("    " );

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
        System.out.println("    " );

        // Desplegamos los partidos del torneo, a partir de la final, para verificar que el partido se eliminó.
        finals.display();
    }
}
