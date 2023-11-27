import java.util.ArrayList;
import java.util.List;

class TournamentRound implements TournamentComponent {
    private List<TournamentComponent> components = new ArrayList<>();
    private String name;
    private String description;

    public TournamentRound(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(TournamentComponent component) {
        components.add(component);
    }

    public void remove(String searchedComponent) {
        for (TournamentComponent component : components) {
            if(component.getName().equals(searchedComponent)) {
                components.remove(component);
            }else{

                try {
                    component.remove(searchedComponent);
                }catch (Exception e){
                    return;
                }
            }
        }
    }

    public TournamentComponent getChild(int i) {
        return components.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void display() {
        System.out.println(getName());
        System.out.println(getDescription());

        for (TournamentComponent component : components) {
            component.display();
        }
    }

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