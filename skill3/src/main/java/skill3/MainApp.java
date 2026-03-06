package skill3;

public class MainApp {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        dao.insertProduct(new Product("Laptop", "Electronics", 80000, 5));
        dao.insertProduct(new Product("Mobile", "Electronics", 30000, 10));

        dao.sortPriceAsc().forEach(p ->
            System.out.println(p.getName() + " " + p.getPrice()));
    }
}
