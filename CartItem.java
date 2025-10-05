/**
 * Represents an item in the shopping cart.
 * Contains a product and its quantity.
 */
public class CartItem {
    // class code...
}

public class CartItem {
    /**
     * The product associated with this cart item.
     */
    private Product product;

    /**
     * The quantity of the product in the cart.
     */
    private int quantity;
    /**
     * Constructs a CartItem with the specified product and quantity.
     *
     * @param product  the product to add to the cart
     * @param quantity the quantity of the product
     */

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    /**
     * Returns the product associated with this cart item.
     *
     * @return the product
     */
    public Product getProduct() { return product; }

    /**
     * Returns the quantity of the product in the cart.
     *
     * @return the quantity
     */
    public int getQuantity() { return quantity; }

    /**
     * Sets the quantity of the product in the cart.
     *
     * @param quantity the new quantity
     */
    public void setQuantity(int quantity) { this.quantity = quantity; }

    /**
     * Returns the subtotal price for this cart item.
     *
     * @return the subtotal (product price multiplied by quantity)
     */
    public int getSubtotal() { return product.getPrice() * quantity; }
}
