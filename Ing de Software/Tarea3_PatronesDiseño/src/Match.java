/**
 * Representa un partido en un torneo.
 * Esta clase implementa la interfaz TournamentComponent.
 */
class Match implements TournamentComponent {
    private String name;
    private String description;
    private String team1;
    private String team2;

    /**
     * Construye un nuevo partido con el nombre, descripción y equipos dados.
     *
     * @param name El nombre del partido.
     * @param description La descripción del partido.
     * @param team1 El primer equipo en el partido.
     * @param team2 El segundo equipo en el partido.
     */
    public Match(String name, String description, String team1, String team2) {
        this.name = name;
        this.description = description;
        this.team1 = team1;
        this.team2 = team2;
    }

    /**
     * Lanza una excepción UnsupportedOperationException, ya que no se puede añadir un componente a un partido.
     *
     * @param component El componente a añadir.
     */
    public void add(TournamentComponent component) {
        throw new UnsupportedOperationException();
    }

    /**
     * Lanza una excepción UnsupportedOperationException, ya que no se puede eliminar un componente de un partido.
     *
     * @param component El nombre del componente a eliminar.
     */
    public void remove(String component) {
        throw new UnsupportedOperationException();
    }

    /**
     * Lanza una excepción UnsupportedOperationException, ya que un partido no tiene componentes hijos.
     *
     * @param i El índice del componente hijo a recuperar.
     * @return Nada.
     */
    public TournamentComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    /**
     * Recupera el nombre de este partido.
     *
     * @return El nombre de este partido.
     */
    public String getName() {
        return name;
    }

    /**
     * Recupera la descripción de este partido.
     *
     * @return La descripción de este partido.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Recupera el nombre del primer equipo en este partido.
     *
     * @return El nombre del primer equipo.
     */
    public String getTeam1() {
        return team1;
    }

    /**
     * Recupera el nombre del segundo equipo en este partido.
     *
     * @return El nombre del segundo equipo.
     */
    public String getTeam2() {
        return team2;
    }

    /**
     * Muestra información sobre este partido.
     */
    public void display() {
        System.out.println("  " + getName());
        System.out.println("    " + getDescription());
        System.out.println("    " + getTeam1() + " vs " + getTeam2());
    }

    /**
     * Busca un partido por nombre.
     *
     * @param name El nombre del partido a buscar.
     * @return Este partido si su nombre coincide con el nombre dado, o null en caso contrario.
     */
    public TournamentComponent search(String name){
        if(this.name.equals(name)){
            return this;
        }
        return null;
    }
}