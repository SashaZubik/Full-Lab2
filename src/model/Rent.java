package model;

public abstract class Rent{

    private final String owner;
    private final double price;
    private final String Category;

    private SleepingBag isSleepingBag=null;

    public Rent(String name, double price, String category){
        this.owner=name;
        if (price<=0.0){
            System.out.println("Цена не может быть равна 0 или быть меньше 0");
            price=100.0;
        }
        this.price=price;
        this.Category=category;
    }

    public Rent(String name, double price){
        this(name, price, "Small");
    }
    public double getKoficient(){
        double result=switch (Getcategory()) {
            case "Small" -> {
                yield 1.0;
            }
            case "Medium" -> {
                yield 1.6;
            }
            case "Large" -> {
                yield 2.30;
            }
            default ->{
                yield 1.0;
            }
        };
        return result;
    }

    public void addBag(SleepingBag b){
        this.isSleepingBag=b;
    }

    public void addBag(SleepingBag b, boolean warm){
        this.isSleepingBag=b;
        b.setPrice(b.GetPrice()*1.5);
    }

    public abstract double cost();

    public String Getname(){
        return owner;
    }
    public double Getprice(){
        return price;
    }
    public String Getcategory(){
        return Category;
    }
    public SleepingBag GetBags(){return isSleepingBag; }

}