
package DataLayer;

import BusinessLayer.Order;
import java.util.ArrayList;

public class OrderDataManager {

    private ArrayList<Order> orders;
    
    public OrderDataManager() {
        this.orders = new ArrayList<Order>();
    }
    
    public Order create(Order orderToCreate) {
        this.orders.add(orderToCreate);
        
        return orderToCreate;
    }
    
    public ArrayList<Order> getAll() {
        return this.orders;
    }
    
    public ArrayList<Order> getByOrderNumber(int orderNumber) {
        ArrayList<Order> output = new ArrayList<Order>();
        
        for (Order order : this.orders) {
            if (order.getOrderNumber() == orderNumber) {
                output.add(order);
            }
        }
        return output;
    }
}
