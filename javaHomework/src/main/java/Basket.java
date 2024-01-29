import java.util.ArrayList;

class Basket {
    ArrayList<Products> items;

    public Basket() {
        items = new ArrayList<>();
    }

    public void addProduct(Products product) {
        items.add(product);
    }

    public void removeProduct(Products product) {
        items.remove(product);
    }
}

