import java.util.ArrayList;

public class Box implements Packable {
    private int maxCapacity;
    private ArrayList<Packable> items;

    public Box(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : items) {
            weight += item.weight();
        }

        return weight;
    }

    public void add(Packable item) {
        if (weight() + item.weight() < maxCapacity) {
            items.add(item);
        }
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight();
    }
}