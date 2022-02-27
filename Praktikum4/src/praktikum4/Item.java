package praktikum4;

/**
 *
 * @author DAFA N.F
 */
public class Item {
    private String name;
    private Item() {
        name = "Ipin";
    }
    public Item(String name) {
        this();
        System.out.println(this.name);
    }
}
