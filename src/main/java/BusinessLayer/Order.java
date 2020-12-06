package BusinessLayer;

public class Order {
    private int orderNumber;
    private int customerId;
    private String date;
    
    public Order(int number, int custId, String date) {
        this.orderNumber = number;
        this.customerId = custId;
        this.date = date;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" + "orderNumber= " + orderNumber + ", customerId= " + customerId + ", date= " + date + '}';
    }
 
}
