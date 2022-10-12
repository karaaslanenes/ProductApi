package ca.vanier;

import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import org.junit.Test;

public class TestProduct {
    @Test
    public void testProduct01(){
        ProductPojo productPojo=new ProductPojo(323,"laptop",568);
        ProductPojo productPojo2=new ProductPojo(123,"laptop",985);
        Assert.assertEquals(productPojo.getName(),productPojo2.getName());
        Assert.assertTrue(productPojo.getProductPrice()< productPojo2.getProductPrice());

    }
}
