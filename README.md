1. Problem Statement 
Build a simple Shopping Cart application in Python where a user can add products to a cart, view the 
cart, update quantities, remove items, and checkout. 
The system should use predefined products and allow up to 8 items in the cart. 
2. Features & Functionalities 
1. View Products – Display all available products with price and ID. 
2. Add to Cart – Add product to cart with quantity. 
3. View Cart – Display all items in the cart with total price. 
4. Update Cart – Change quantity of a product in the cart. 
5. Remove from Cart – Delete a product from the cart. 
6. Checkout – Show final bill and empty the cart. 
7. Exit Program – Close the application.
8. 4. Data Structure 
Products List (Predefined) 
products = [ 
{"id": 1, "name": "Laptop", "price": 45000}, 
{"id": 2, "name": "Smartphone", "price": 15000}, 
{"id": 3, "name": "Headphones", "price": 2000}, 
{"id": 4, "name": "Keyboard", "price": 1200}, 
{"id": 5, "name": "Mouse", "price": 800}, 
{"id": 6, "name": "Charger", "price": 500}, 
{"id": 7, "name": "USB Cable", "price": 300}, 
{"id": 8, "name": "Backpack", "price": 2500} 
] 
Cart List 
• Maximum 8 items 
• Each item stored as a dictionary: 
cart = [ 
{"id": 1, "name": "Laptop", "price": 45000, "quantity": 1}, 
{"id": 3, "name": "Headphones", "price": 2000, "quantity": 2} 
] 
5. Functions to Implement 
• view_products(products) – Display all available products. 
• add_to_cart(products, cart, product_id, quantity) – Add item to cart. 
• view_cart(cart) – Display all cart items with total price. 
• update_cart(cart, product_id, quantity) – Update quantity of a product. 
• remove_from_cart(cart, product_id) – Delete product from cart. 
• checkout(cart) – Display bill and empty cart. 
• menu() – Display menu and handle user input. 
6. Menu Example 
===== Shopping Cart ===== 
1. View Products 
2. Add to Cart 
3. View Cart 
4. Update Cart 
5. Remove from Cart 
6. Checkout 
7. Exit 
Enter your choice:  # ShoppingCart
