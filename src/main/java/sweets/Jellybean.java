package sweets;

public class Jellybean extends Sweets {

    private String colour;
    public Jellybean(String name, float weight, int price, String colour) {
        super(name, weight, price);
        this.colour=colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    @Override
    public String toString(){
        return "Jellybean "+super.toString()+", colour = "+colour;
    }
}
