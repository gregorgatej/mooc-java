import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if ((item.getWeight() + currentItemsWeight()) <= maxWeight) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (items.contains(item)) return true;

        return false;
    }

    private int currentItemsWeight() {
        int currentWeight = 0;

        for (Item item : items) {
            currentWeight += item.getWeight();
        }

        return currentWeight;
    }
}