class User {
    String username;
    String password;
    Basket basket;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        basket = new Basket();
    }
}

