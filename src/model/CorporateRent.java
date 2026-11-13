package model;

public class CorporateRent extends Rent{
    private int orders;

    public CorporateRent(String owner, double price, String Category, int orders){
        super(owner, price, Category);
        if (orders<1){
            System.out.println("Количество лцензий не может быть меньше 1");
            orders=1;
        }
        this.orders=orders;
    }

    public CorporateRent(String owner, double price){
        super(owner, price, "Small");
    }

    public double cost(){
        double Cost=Getprice()*getKoficient();
        if (GetBags()!=null){ //есть ли он
            Cost=Cost+GetBags().GetPrice();
        }
        Cost=orders*Cost;
        return Cost;
    }
}