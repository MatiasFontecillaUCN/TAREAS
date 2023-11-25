interface TournamentComponent {
    void add(TournamentComponent component);
    void remove(TournamentComponent component);
    TournamentComponent getChild(int i);
    String getName();
    String getDescription();
    void display();
}
