interface TournamentComponent {
    void add(TournamentComponent component);
    void remove(String component);
    TournamentComponent getChild(int i);
    String getName();
    String getDescription();
    void display();
    TournamentComponent search(String name);
}
