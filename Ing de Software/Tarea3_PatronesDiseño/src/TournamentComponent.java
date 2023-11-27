/**
 * Interfaz para un componente en un torneo.
 */
interface TournamentComponent {

    /**
     * Añade un componente a este componente.
     *
     * @param component El componente a añadir.
     */
    void add(TournamentComponent component);

    /**
     * Elimina un componente de este componente por nombre.
     *
     * @param component El nombre del componente a eliminar.
     */
    void remove(String component);

    /**
     * Recupera un componente hijo en un índice dado.
     *
     * @param i El índice del componente hijo a recuperar.
     * @return El componente hijo en el índice dado.
     */
    TournamentComponent getChild(int i);

    /**
     * Recupera el nombre de este componente.
     *
     * @return El nombre de este componente.
     */
    String getName();

    /**
     * Recupera la descripción de este componente.
     *
     * @return La descripción de este componente.
     */
    String getDescription();

    /**
     * Muestra información sobre este componente.
     */
    void display();

    /**
     * Busca un componente por nombre.
     *
     * @param name El nombre del componente a buscar.
     * @return El componente con el nombre dado, o null si no se encuentra tal componente.
     */
    TournamentComponent search(String name);
}
