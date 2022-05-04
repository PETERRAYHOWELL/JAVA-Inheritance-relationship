package OOP_LAB_TEST_2;

public class Iphone  extends CellPhone //implementing inheritance relationship / child Class Iphone is inhering from CellPhone
{
    private String IsWaterProof;

    //default
    public Iphone()
    {
        super(); //call default of parent class
        IsWaterProof = "";
    }

    //primary
    public Iphone(String model, String network, String screenShot, float price, String isWaterProof)
    {
        super(model, network, screenShot, price);
        IsWaterProof = isWaterProof;
    }

    //copy
    public Iphone(Iphone iphone) {
        super(iphone.Model,iphone.Network,iphone.ScreenShot,iphone.Price);
        IsWaterProof = iphone.IsWaterProof;
    }

    //accessors
    public String getIsWaterProof()
    {
        return IsWaterProof;
    }

    //mutator
    public void setIsWaterProof(String isWaterProof)
    {
        IsWaterProof = isWaterProof;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "Model='" + Model + '\'' +
                ", Network='" + Network + '\'' +
                ", ScreenShot='" + ScreenShot + '\'' +
                ", Price=" + Price +
                ", IsWaterProof='" + IsWaterProof + '\'' +
                '}';
    }
}
