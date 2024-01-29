import java.util.ArrayList;

class Category {
    String name;
    ArrayList<Products> products;

    public Category(String name) {
        this.name = name;
        products = new ArrayList<>();
    }
}

