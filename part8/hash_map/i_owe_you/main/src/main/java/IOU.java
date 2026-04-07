import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> owingMapping;

    public IOU () {
        this.owingMapping = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.owingMapping.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if (this.owingMapping.containsKey(toWhom)) {
            return this.owingMapping.get(toWhom);
        }

        return 0.0;
    }
}