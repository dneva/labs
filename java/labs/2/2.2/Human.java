package Lab1;

public class Human {
    private String name;
    private Head HumanHead;
    private Hand RightHand;
    private Hand LeftHand;
    private Leg RightLeg;
    private Leg LeftLeg;
    public Human(String n, String s)
    {
        name=n;
        HumanHead=new Head();
        RightHand=new Hand("Right");
        LeftHand=new Hand("Left");
        RightLeg=new Leg("Right");
        LeftLeg=new Leg("Left");
        HumanHead.SetSay(s);

    }

    public void SetName(String n)
    {
        name=n;
    }
    public String GetName()
    {
        return name;
    }
    public void SetSay(String s)
    {
        HumanHead.SetSay(s);
    }
    public String GetSay()
    {
        return HumanHead.GetSay();
    }
    public void Test()
    {
        RightHand.Wawe();
        LeftHand.Wawe();
        RightLeg.Step();
        LeftLeg.Step();
    }
}
