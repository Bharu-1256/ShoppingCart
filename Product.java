/**
 * Represents a product in the shop.
 * Contains product id, name, and price.
 */
public class Product {
    /**
     * Unique identifier for the product.
     */
    private int id;

    /**
     * Name of the product.
     */

    private String name;

    /**
     * Price of the product.
     */

    private int price;

    /**
     * Constructs a Product with the specified id, name, and price.
     *
     * @param id    the unique product identifier
     * @param name  the name of the product
     * @param price the price of the product
     */

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * Returns the product's unique identifier.
     *
     * @return the product id
     */
    public int getId() { return id; }
    /**
     * Returns the product's name.
     *
     * @return the product name
     */
    public String getName() { return name; }

    /**
     * Returns the product's price.
     *
     * @return the product price
     */
    public int getPrice() { return price; }
}
