package OOP_LAB_TEST_2;

public class CellPhone
{
    protected String Model;
    protected String Network;
    protected String ScreenShot;
    protected float Price;

    //default
    public CellPhone()
    {
        Model = "";
        Network = "";
        ScreenShot = "";
        Price = 0.0f;
    }

    //primary
    public CellPhone(String model, String network, String screenShot, float price)
    {
        Model = model;
        Network = network;
        ScreenShot = screenShot;
        Price = price;
    }

    //copy
    public CellPhone(CellPhone cellPhone)
    {
        Model = cellPhone.Model;
        Network = cellPhone.Network;
        ScreenShot = cellPhone.ScreenShot;
        Price = cellPhone.Price;
    }

    //accessors
    public String getModel()
    {
        return Model;
    }

    public String getNetwork()
    {
        return Network;
    }

    public String getScreenShot()
    {
        return ScreenShot;
    }

    public float getPrice()
    {
        return Price;
    }

    //mutators
    public void setModel(String model)
    {
        Model = model;
    }

    public void setNetwork(String network)
    {
        Network = network;
    }

    public void setScreenShot(String screenShot)
    {
        ScreenShot = screenShot;
    }

    public void setPrice(float price)
    {
        Price = price;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "Model='" + Model + '\'' +
                ", Network='" + Network + '\'' +
                ", ScreenShot='" + ScreenShot + '\'' +
                ", Price=" + Price +
                '}';
    }
}
