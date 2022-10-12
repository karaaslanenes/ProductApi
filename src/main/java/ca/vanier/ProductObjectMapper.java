package ca.vanier;

import java.util.ArrayList;
import java.util.List;

public class ProductObjectMapper {
    public static void main(String[] args) {
        List<Object> productList=new ArrayList<>();
        ProductPojo productPojo=new ProductPojo(323,"laptop",568);
        productList.add(productPojo.getProductPrice());
        productList.add(productPojo.getProductId());
        productList.add(productPojo.getName());


        System.out.println(productList);

    }

}
