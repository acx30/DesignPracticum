public interface Dish {
    public void isCooked();
}
class ADish1 implements Dish{
    private String type;
    ADish1(String type)
    {
        this.type=type;
    }
    public void isCooked()
    {
        if(type.equals("œÊ≤À"))System.out.println("¿±Ω∑≥¥»‚“—≥¥÷∆");
        else System.out.println("ÀÆ÷Û»‚∆¨“—≥¥÷∆");
    }
}
class ADish2 implements Dish{
    private String type;
    ADish2(String type)
    {
        this.type=type;
    }
    public void isCooked()
    {
        if(type.equals("œÊ≤À"))System.out.println("∂ÁΩ∑”„Õ∑“—≥¥÷∆");
        else System.out.println("À·¿±º¶‘”“—≥¥÷∆");
    }
}
class ADish3 implements Dish{
    private String type;
    ADish3(String type)
    {
        this.type=type;
    }
    public void isCooked()
    {
        if(type.equals("œÊ≤À"))System.out.println("√´ œ∫Ï…’»‚“—≥¥÷∆");
        else System.out.println("¬È¿±≈£Õ‹“—≥¥÷∆");
    }
}
class BDish1 implements Dish{
    private String type;
    BDish1(String type)
    {
        this.type=type;
    }
    public void isCooked()
    {
        if(type.equals("œÊ≤À"))System.out.println("–°≥¥ª∆≈£»‚“—≥¥÷∆");
        else System.out.println("¬Ï“œ…œ ˜“—≥¥÷∆");
    }
}
class BDish2 implements Dish{
    BDish2(String type)
    {
        this.type=type;
    }
    private String type;
    public void isCooked()
    {
        if(type.equals("œÊ≤À"))System.out.println("”¿÷›—™—º“—≥¥÷∆");
        else System.out.println("∑€’Ù≈≈π«“—≥¥÷∆");
    }
}
class BDish3 implements Dish{
    BDish3(String type)
    {
        this.type=type;
    }
    private String type;
    public void isCooked()
    {
        if(type.equals("œÊ≤À"))System.out.println("∏…π¯∑ ≥¶“—≥¥÷∆");
        else System.out.println("¬È∆≈∂π∏Ø“—≥¥÷∆");
    }
}
