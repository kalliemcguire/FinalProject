
package DataLayer;

import BusinessLayer.OrderItem;
import java.util.ArrayList;

public class OrderItemDataManager {
    
    private ArrayList<OrderItem> orderItems;
    
    public OrderItemDataManager() {
        this.orderItems = new ArrayList<OrderItem>();
    }
    
    public OrderItem create(OrderItem itemToCreate) {
        this.orderItems.add(itemToCreate);
        
        return itemToCreate;        
    }
    
    public ArrayList<OrderItem> getAll() {
        return this.orderItems;
    }
    
    public ArrayList<OrderItem> getByOrderNumber(int orderNumber) {
        ArrayList<OrderItem> output = new ArrayList<OrderItem>();
        
        for (OrderItem order : this.orderItems) {
            if (order.getOrderNumber() == orderNumber) {
                output.add(order);
            }
        }
        return output;
    }
}
