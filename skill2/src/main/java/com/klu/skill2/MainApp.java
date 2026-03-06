package com.klu.skill2;

public class klu.skill2;
 {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        Product p = new Product("Laptop", "Gaming", 80000, 5);
        dao.insertProduct(p);

        Product pr = dao.getProduct(1);
        if (pr != null) {
            System.out.println(pr.getName());
            System.out.println(pr.getPrice());
        }
    }
}
