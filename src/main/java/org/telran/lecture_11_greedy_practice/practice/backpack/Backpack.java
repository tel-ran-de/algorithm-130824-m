package org.telran.lecture_11_greedy_practice.practice.backpack;
import lombok.Getter;
import java.util.Objects;

@AllArgsConstructor
@Getter
public class Item {
    public String name;
    public int weight;
    public int value;
    public int unit_value; // Удельная ценность - цена за единицу веса

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return weight == item.weight && value == item.value && unit_value == item.unit_value && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, value, unit_value);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", value=" + value +
                ", unit_value=" + unit_value +
                '}' + "\n";
    }
}
