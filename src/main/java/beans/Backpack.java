package beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Backpack {
    private List<Item> items;
    private double maxWeight;
    private double bestCost;


}
