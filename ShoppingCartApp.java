/**
 * Main application class for the Shopping Cart.
 * Handles menu, product list, cart operations, and user interaction.
 */
public class ShoppingCartApp {
    // class code...
}

import java.util.*;

/**
 * Initializes the product list with predefined products.
 */
public class ShoppingCartApp {
    private static final int MAX_CART_ITEMS = 8;
    private List<Product> products = new ArrayList<>();
    private List<CartItem> cart = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public ShoppingCartApp() {
        products.add(new Product(1, "Laptop", 45000));
        products.add(new Product(2, "Smartphone", 15000));
        products.add(new Product(3, "Headphones", 2000));
        products.add(new Product(4, "Keyboard", 1200));
        products.add(new Product(5, "Mouse", 800));
        products.add(new Product(6, "Charger", 500));
        products.add(new Product(7, "USB Cable", 300));
        products.add(new Product(8, "Backpack", 2500));
    }

    /**
     * Displays the main menu and handles user input for cart operations.
     */

    public void menu() {
        while (true) {
            System.out.println("===== Shopping Cart =====");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Update Cart");
            System.out.println("5. Remove from Cart");
            System.out.println("6. Checkout");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: viewProducts(); break;
                case 2: addToCart(); break;
                case 3: viewCart(); break;
                case 4: updateCart(); break;
                case 5: removeFromCart(); break;
                case 6: checkout(); break;
                case 7: System.out.println("Thank you!"); return;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    /**
     * Displays all available products with their ID, name, and price.
     */

    private void viewProducts() {
        System.out.println("ID\tName\t\tPrice");
        for (Product p : products) {
            System.out.printf("%d\t%s\t\t%d\n", p.getId(), p.getName(), p.getPrice());
        }
    }
    /**
     * Adds a product to the cart or updates quantity if already present.
     * Checks for cart size and valid input.
     */

    private void addToCart() {
        if (cart.size() >= MAX_CART_ITEMS) {
            System.out.println("Cart is full (max 8 items).");
            return;
        }
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        Product product = findProductById(id);
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }
        System.out.print("Enter Quantity: ");
        int qty = scanner.nextInt();
        if (qty <= 0) {
            System.out.println("Invalid quantity.");
            return;
        }
        CartItem item = findCartItemById(id);
        if (item != null) {
            item.setQuantity(item.getQuantity() + qty);
        } else {
            cart.add(new CartItem(product, qty));
        }
        System.out.println("Product added to cart.");
    }

    /**
     * Displays all items in the cart with name, price, quantity, subtotal, and total price.
     */

    private void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        int total = 0;
        System.out.println("Name\tPrice\tQty\tSubtotal");
        for (CartItem item : cart) {
            int subtotal = item.getSubtotal();
            total += subtotal;
            System.out.printf("%s\t%d\t%d\t%d\n", item.getProduct().getName(), item.getProduct().getPrice(), item.getQuantity(), subtotal);
        }
        System.out.println("Total: " + total);
    }

    /**
     * Updates the quantity of a product in the cart.
     * Validates product existence and input.
     */

    private void updateCart() {
        System.out.print("Enter Product ID to update: ");
        int id = scanner.nextInt();
        CartItem item = findCartItemById(id);
        if (item == null) {
            System.out.println("Item not in cart.");
            return;
        }
        System.out.print("Enter new quantity: ");
        int qty = scanner.nextInt();
        if (qty <= 0) {
            System.out.println("Invalid quantity.");
            return;
        }
        item.setQuantity(qty);
        System.out.println("Cart updated.");
    }
    /**
     * Removes a product from the cart by its ID.
     */

    private void removeFromCart() {
        System.out.print("Enter Product ID to remove: ");
        int id = scanner.nextInt();
        CartItem item = findCartItemById(id);
        if (item == null) {
            System.out.println("Item not in cart.");
            return;
        }
        cart.remove(item);
        System.out.println("Item removed from cart.");
    }

    /**
     * Displays the final bill, empties the cart, and thanks the user.
     */

    private void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        viewCart();
        cart.clear();
        System.out.println("Checkout complete. Thank you!");
    }

    /**
     * Finds a product by its ID from the product list.
     *
     * @param id the product ID
     * @return the Product object or null if not found
     */

    private Product findProductById(int id) {
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    /**
     * Finds a cart item by its product ID from the cart.
     *
     * @param id the product ID
     * @return the CartItem object or null if not found
     */

    private CartItem findCartItemById(int id) {
        for (CartItem item : cart) {
            if (item.getProduct().getId() == id) return item;
        }
        return null;
    }
    /**
     * Main method to start the Shopping Cart application.
     *
     * @param args command-line arguments
     */

    public static void main(String[] args) {
        new ShoppingCartApp().menu();
    }
}
