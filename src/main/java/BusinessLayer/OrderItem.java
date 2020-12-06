package BusinessLayer;


public class OrderItem {
    private int orderNumber;
    private int lineNumber;
    private int productId;
    private String productDescription;
    private int quantity;
    private double price;
    
    public OrderItem(int orderNum, int lineNum, int prodId, String desc, int qty, double price) {
        this.orderNumber = orderNum;
        this.lineNumber = lineNum;
        this.productId = prodId;
        this.productDescription = desc;
        this.quantity = qty;
        this.price = price;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "orderNumber= " + orderNumber + ", lineNumber= " + lineNumber + ", productId= " + productId + ", productDescription= " + productDescription + ", quantity= " + quantity + ", price= " + price + '}';
    }
    
}
