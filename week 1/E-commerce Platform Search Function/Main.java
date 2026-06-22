

public class Main {

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Mobile", "Electronics"),
            new Product(102, "Laptop", "Electronics"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Headphones", "Electronics"),
        	new Product(105, "Camera", "Electronics")
        	};
        System.out.println("Linear Search :");
        Product found1 = LinearSearch.search(products, "Camera");
        if (found1 != null) {
            System.out.println(found1);
        } else {
            System.out.println("Product Not Found");
        }
        
        System.out.println("Binary Search :");
        Product found2 = BinarySearch.search(products, "Mobile");
        if (found2 != null) {
            System.out.println(found2);
        } else {
            System.out.println("Product Not Found");
        }
    }
}
