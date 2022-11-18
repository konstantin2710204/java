public class Category {
    Product product;
    private String names;

    public Category(String names) {
        names = product.getName();
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    public void setNames() {
        this.names = names;
        System.out.println(this.names);
    }

    public static void fillCategory(Product product) {
        product.addProduct(new Product("HP Spectre x360", 141999, 5.0));
        product.addProduct(new Product("DELL XPS 13", 117990, 4.9));
        product.addProduct(new Product("APPLE MacBook Pro 16",269990,4.9 ));
        product.addProduct(new Product("ASUS ROG Zephyrus G14", 171990, 4.8));
    }
}


