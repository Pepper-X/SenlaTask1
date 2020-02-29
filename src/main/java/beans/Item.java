package beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item implements Comparable<Item> {
    private String name;
    private double weight;
    private double cost;


    @Override
    public int compareTo(Item o) {
        return Double.compare(cost, o.cost);
    }
}
