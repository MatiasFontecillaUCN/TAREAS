class Match implements TournamentComponent {
    private String name;
    private String description;
    private String team1;
    private String team2;

    public Match(String name, String description, String team1, String team2) {
        this.name = name;
        this.description = description;
        this.team1 = team1;
        this.team2 = team2;

    }

    public void add(TournamentComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(TournamentComponent component) {
        throw new UnsupportedOperationException();
    }

    public TournamentComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void display() {
        System.out.println("  " + getName());
        System.out.println("    " + getDescription());
        System.out.println("    " + getTeam1() + " vs " + getTeam2());
    }
}
