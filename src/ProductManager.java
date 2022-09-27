public class ProductManager {
    public void Add(Product product){
        System.out.println("Product is added" + product.getName());
    }
    public void Add(int id, String name, String description,String color){
        System.out.println("Product is added " + id + " " +name);
    }
}
