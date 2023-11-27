/**
 * Interface for a component in a tournament.
 */
interface TournamentComponent {

    /**
     * Adds a component to this component.
     *
     * @param component The component to be added.
     */
    void add(TournamentComponent component);

    /**
     * Removes a component from this component by name.
     *
     * @param component The name of the component to be removed.
     */
    void remove(String component);

    /**
     * Retrieves a child component at a given index.
     *
     * @param i The index of the child component to retrieve.
     * @return The child component at the given index.
     */
    TournamentComponent getChild(int i);

    /**
     * Retrieves the name of this component.
     *
     * @return The name of this component.
     */
    String getName();

    /**
     * Retrieves the description of this component.
     *
     * @return The description of this component.
     */
    String getDescription();

    /**
     * Displays information about this component.
     */
    void display();

    /**
     * Searches for a component by name.
     *
     * @param name The name of the component to search for.
     * @return The component with the given name, or null if no such component is found.
     */
    TournamentComponent search(String name);
}
