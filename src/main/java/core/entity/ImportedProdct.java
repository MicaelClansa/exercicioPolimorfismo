package core.entity;

public class ImportedProdct extends Product{

    private Double customsFee;

    public ImportedProdct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProdct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return String.format("%s $ %.2f (Custom fee: $ %.2f", getName(), totalPrice(), getCustomsFee());
    }

    public Double totalPrice(){
        return getPrice() + customsFee;
    }
}
