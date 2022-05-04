package OOP_LAB_TEST_2;

public class Samsung extends CellPhone //implementing inheritance relationship / child Class Samsung is inhering from CellPho

{
    private String HasStylus;

    //default
    public Samsung()
    {
        super(); //call default of parent class
        HasStylus = "";
    }

    //primary
    public Samsung(String model, String network, String screenShot, float price, String hasStylus)
    {
        super(model, network, screenShot, price);
        HasStylus = hasStylus;
    }

    //copy
    public Samsung(Samsung samsung)
    {
        super(samsung.Model,samsung.Network,samsung.ScreenShot,samsung.Price);
        HasStylus = samsung.HasStylus;
    }

    //accessors
    public String getHasStylus()
    {
        return HasStylus;
    }

    //mutators
    public void setHasStylus(String hasStylus)
    {
        HasStylus = hasStylus;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "Model='" + Model + '\'' +
                ", Network='" + Network + '\'' +
                ", ScreenShot='" + ScreenShot + '\'' +
                ", Price=" + Price +
                ", HasStylus='" + HasStylus + '\'' +
                '}';
    }
}
