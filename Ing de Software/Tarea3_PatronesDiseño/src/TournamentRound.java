import java.util.ArrayList;
import java.util.List;

/**
 * Representa una ronda en un torneo.
 * Esta clase implementa la interfaz TournamentComponent.
 */
class TournamentRound implements TournamentComponent {
    private List<TournamentComponent> components = new ArrayList<>();
    private String name;
    private String description;

    /**
     * Construye una nueva ronda de torneo con el nombre y descripción dados.
     *
     * @param name El nombre de la ronda.
     * @param description La descripción de la ronda.
     */
    public TournamentRound(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Añade un componente a esta ronda.
     *
     * @param component El componente a añadir.
     */
    public void add(TournamentComponent component) {
        components.add(component);
    }

    /**
     * Elimina un componente de esta ronda por nombre.
     *
     * @param searchedComponent El nombre del componente a eliminar.
     */
    public void remove(String searchedComponent) {
        for (TournamentComponent component : components) {
            if(component.getName().equals(searchedComponent)) {
                components.remove(component);
            } else {
                try {
                    component.remove(searchedComponent);
                } catch (Exception e) {
                    return;
                }
            }
        }
    }

    /**
     * Recupera un componente hijo en un índice dado.
     *
     * @param i El índice del componente hijo a recuperar.
     * @return El componente hijo en el índice dado.
     */
    public TournamentComponent getChild(int i) {
        return components.get(i);
    }

    /**
     * Recupera el nombre de esta ronda.
     *
     * @return El nombre de esta ronda.
     */
    public String getName() {
        return name;
    }

    /**
     * Recupera la descripción de esta ronda.
     *
     * @return La descripción de esta ronda.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Muestra información sobre esta ronda y sus componentes.
     */
    public void display() {
        System.out.println(getName());
        System.out.println(getDescription());

        for (TournamentComponent component : components) {
            component.display();
        }
    }

    /**
     * Busca un componente por nombre.
     *
     * @param name El nombre del componente a buscar.
     * @return El componente con el nombre dado, o null si no se encuentra tal componente.
     */
    public TournamentComponent search(String name){
        for(TournamentComponent component : components){
            TournamentComponent result = component.search(name);
            if(result != null){
                return result;
            }
        }
        return null;
    }
}