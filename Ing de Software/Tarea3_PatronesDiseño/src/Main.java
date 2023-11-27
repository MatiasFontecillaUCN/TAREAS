public class Main {
    public static void main(String[] args) {
        TournamentComponent match1 = new Match("Match 1", "La Bombonera", "Boca Juniors", "Team 2");
        TournamentComponent match2 = new Match("Match 2", "Estadio Nacional", "Team 3", "Team 4");
        TournamentComponent match3 = new Match("Match 3", "Etihad Stadium", "Team 5", "Team 6");
        TournamentComponent match4 = new Match("Match 4", "El Monumental", "River Plate", "Team 8");

        TournamentComponent round1 = new TournamentRound("Grupo A", "Primera Fase");
        round1.add(match1);
        round1.add(match2);

        TournamentComponent round2 = new TournamentRound("Grupo B", "Primera Fase");
        round2.add(match3);
        round2.add(match4);

        TournamentComponent round3 = new TournamentRound("Copa Libertadores", "Brazil 2014");
        round3.add(round1);
        round3.add(round2);

        String name = "Match 1";
        TournamentComponent FindMatch = round3.search(name);

        if(FindMatch != null){
            System.out.println("Encontrado, la informacion de lo buscado es: ");
            FindMatch.display();
        }
        else{
            System.out.println(name + " no encontrado");
        }

        //round3.display();
    }
}
