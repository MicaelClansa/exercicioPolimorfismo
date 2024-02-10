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
    public void priceTag(){
        System.out.print(getName() + " $ " + totalPrice() + " (Custom fee: $ " + getCustomsFee() + ")");
    }

    public Double totalPrice(){
        return getPrice() + customsFee;
    }
}
