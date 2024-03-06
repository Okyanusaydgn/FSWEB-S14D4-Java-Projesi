package store.models;

public class Bread extends ProductForSale {

    private String FlourType;

    private String color;


    public Bread(String type, double price, String description, String flourType, String color) {
        super(type, price, description);
        FlourType = flourType;
        this.color = color;
    }
 // this anahtar kelimesi, Bread sınıfının kendi özelliklerine (yani FlourType ve color özelliklerine) erişmek için kullanılmıştır.
    @Override
    public void showDetails() {
        System.out.println(super.toString() + this );
    }

    @Override
    public String toString() {
        return "Bread{" +
                "FlourType='" + FlourType + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
