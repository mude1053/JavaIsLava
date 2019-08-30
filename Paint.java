public class Paint {
    protected String colorName;
    protected double sqrfeet;
    protected double price;
    Paint(String colorName,double sqrfeet,double price){
        this.colorName=colorName;
        this.price=price;
        this.sqrfeet=sqrfeet;

    }

    public double calculatePrice(){
        double galon=this.sqrfeet/100;
        double price=this.price*galon;
        return price;

    }

    public String toString() {
        return "Paint{" +
                "colorName='" + colorName + '\'' +
                ", sqrfeet=" + sqrfeet +
                ", price=" + price +
                '}';
    }
}
