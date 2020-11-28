package sweets;

public class Candy extends Sweets {
    private String type;

    public Candy(){}

    public Candy(String name, float weight, int price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
       return "Candy "+super.toString()+", type = "+type;
    }
}
