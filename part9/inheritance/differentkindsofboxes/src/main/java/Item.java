import java.util.Objects;

public class Item {
    private String name;
    private int weight;

    public boolean equals(Object object) {
        if (!(object instanceof Item)) return false;
        if (this == object) return true;
        Item item = (Item) object;
        return java.util.Objects.equals(name, item.name);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}