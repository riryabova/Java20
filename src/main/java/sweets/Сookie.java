package sweets;

public class Сookie extends Sweets {

    private String taste;
    public Сookie(String name, float weight, int price, String taste) {
        super(name, weight, price);
        this.taste=taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    @Override
    public String toString(){
        return "Сookie "+super.toString()+", taste = "+taste;
    }
}
