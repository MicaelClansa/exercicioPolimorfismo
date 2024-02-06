package core.entity;

public class UsedProduct extends Product{

    private String manufactureDate;

    public UsedProduct(String name, Double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return String.format("%s (used) $ %.2f (Manufacture date: %s)", getName(), getPrice(), getManufactureDate());
    }
}
