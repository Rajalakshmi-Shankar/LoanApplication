package loan_application;

/**
 * Represents property details.
 */
public class Property {

    private String address;
    private double propertyValue;

    public Property(String address, double propertyValue) {
        this.address = address;
        this.propertyValue = propertyValue;
    }

    public String getAddress() {
        return address;
    }

    public double getPropertyValue() {
        return propertyValue;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPropertyValue(double propertyValue) {
        this.propertyValue = propertyValue;
    }

    public void displayProperty() {
        System.out.println("Property Address : " + address);
        System.out.println("Property Value   : " + propertyValue);
    }
}
