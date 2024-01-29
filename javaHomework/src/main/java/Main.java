public class Main {
    public static void main(String[] args) {
        // Создание продуктов
        Products product1 = new Products("Телефон", 500, 4.5);
        Products product2 = new Products("Ноутбук", 1200, 4.8);
        Products product3 = new Products("Наушники", 100, 4.0);

        // Создание категорий и добавление продуктов в категории
        Category category1 = new Category("Электроника");
        category1.products.add(product1);
        category1.products.add(product2);
        category1.products.add(product3);

        Category category2 = new Category("Одежда");
        Products product4 = new Products("Футболка", 20, 4.2);
        Products product5 = new Products("Джинсы", 50, 4.7);
        category2.products.add(product4);
        category2.products.add(product5);

        // Создание пользователей
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        // Вывод каталога продуктов
        System.out.println("Каталог продуктов:");
        printCatalog(category1);
        printCatalog(category2);

        // Симуляция покупок пользователей
        user1.basket.addProduct(product1);
        user1.basket.addProduct(product4);

        user2.basket.addProduct(product2);
        user2.basket.addProduct(product5);

        // Вывод покупок посетителей магазина
        System.out.println("\nПокупки пользователей:");
        printPurchases(user1);
        printPurchases(user2);
    }

    public static void printCatalog(Category category) {
        System.out.println("Категория: " + category.name);
        for (Products product : category.products) {
            System.out.println("    - " + product.name + ", Цена: " + product.price + "$, Рейтинг: " + product.rating);
        }
    }

    public static void printPurchases(User user) {
        System.out.println("Пользователь: " + user.username);
        System.out.println("Купленные товары:");
        for (Products item : user.basket.items) {
            System.out.println("    - " + item.name);
        }
    }
}

