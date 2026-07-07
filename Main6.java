/*Online Shopping Cart

Classes:

Product
Cart
Customer

Functions:

Add Product
Remove Product
Calculate Total

Concept: Composition */
class Product{
    String name="Laptop";
    int price=50000;
}
class Customer{
    String name="Dhaniya";
}
class Cart{
Product product=new Product();
    void addProduct(){
        System.out.println(product.name+" added to cart.");
    }
    void removeProduct(){
        System.out.println(product.name+" removed from cart.");
    }
    void calculateTotal(){
        System.out.println("Total Price: ₹" + product.price);
    }
}
public class Main6 {
    public static void main(String[] args) {
        Customer customer=new Customer();
        Cart cart=new Cart();
        System.out.println("Customer: "+customer.name);
        cart.addProduct();
        cart.calculateTotal();
        cart.removeProduct();
    }
}