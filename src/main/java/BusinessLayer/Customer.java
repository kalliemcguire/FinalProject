package BusinessLayer;

public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    
    public Customer(int id, String fName, String lName, String phone) {
        this.customerId = id;
        this.firstName = fName;
        this.lastName = lName;
        this.phoneNumber = phone;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId= " + customerId + ", firstName= " + firstName + ", lastName= " + lastName + ", phoneNumber= " + phoneNumber + '}';
    }
    
}
