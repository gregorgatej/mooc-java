import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> itemInBox;

    public OneItemBox() {
        this.itemInBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (itemInBox.isEmpty()) itemInBox.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return itemInBox.contains(item);
    }
}
