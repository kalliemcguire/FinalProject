
import BusinessLayer.Customer;
import BusinessLayer.Order;
import BusinessLayer.OrderItem;
import BusinessLayer.Product;
import DataLayer.CustomerDataManager;
import DataLayer.OrderDataManager;
import DataLayer.OrderItemDataManager;
import DataLayer.ProductDataManager;
import java.util.ArrayList;

public class OrderSystem {
    public static void main(String[] args) {
        
        CustomerDataManager customerDm = new CustomerDataManager();
        OrderDataManager orderDm = new OrderDataManager();
        OrderItemDataManager orderItemDm = new OrderItemDataManager();
        ProductDataManager productDm = new ProductDataManager();
        
        Customer cust1 = new Customer(100, "Jane", "Smith", "6201234567");
        Customer cust2 = new Customer(101, "Emma", "Jones", "6202345678");
        Customer cust3 = new Customer(102, "Susie", "Greene", "6207654321");
        
        Product prod1 = new Product(500, "Pink sweater", 20, 34.99);
        Product prod2 = new Product(600, "Green sweater", 10, 39.99);
        Product prod3 = new Product(700, "White pants", 30, 59.99);
        
        Order order1 = new Order(1, 100, "December 1, 2020");
        Order order2 = new Order(2, 101, "December 2, 2020");
        Order order3 = new Order(3, 102, "December 4, 2020");
        
        OrderItem orderItem1 = new OrderItem(1, 10, 500, "Pink sweater", 1, 34.99);
        OrderItem orderItem2 = new OrderItem(1, 20, 600, "Green sweater", 1, 39.99);
        OrderItem orderItem3 = new OrderItem(2, 20, 600, "Green sweater", 1, 39.99);
        OrderItem orderItem4 = new OrderItem(2, 30, 700, "White pants", 1, 59.99);
        OrderItem orderItem5 = new OrderItem(3, 10, 500, "Pink sweater", 1, 34.99);
        OrderItem orderItem6 = new OrderItem(3, 30, 700, "White pants", 1, 59.99);
        
        customerDm.create(cust1);
        customerDm.create(cust2);
        customerDm.create(cust3);
        
        productDm.create(prod1);
        productDm.create(prod2);
        productDm.create(prod3);
        
        orderDm.create(order1);
        orderDm.create(order2);
        orderDm.create(order3);
        
        orderItemDm.create(orderItem1);
        orderItemDm.create(orderItem2);
        orderItemDm.create(orderItem3);
        orderItemDm.create(orderItem4);
        orderItemDm.create(orderItem5);
        orderItemDm.create(orderItem6);
        
        ArrayList<Customer> allCustomers = customerDm.getAll();
        System.out.println(allCustomers);
        
        ArrayList<Order> allOrders = orderDm.getAll();
        System.out.println(allOrders);
        
        ArrayList<OrderItem> allOrderItems = orderItemDm.getAll();
        System.out.println(allOrderItems);
    }
   
}
