package ca.vanier;

public class ProductPojo {
    private Integer productId;
    private String name;
    private Integer productPrice;

    public ProductPojo(Integer productId, String name, Integer productPrice) {
        this.productId = productId;
        this.name = name;
        this.productPrice = productPrice;
    }

    public Integer getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "ProductPojo{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
