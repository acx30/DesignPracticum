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
        if(type.equals("���"))System.out.println("���������ѳ���");
        else System.out.println("ˮ����Ƭ�ѳ���");
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
        if(type.equals("���"))System.out.println("�罷��ͷ�ѳ���");
        else System.out.println("���������ѳ���");
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
        if(type.equals("���"))System.out.println("ë�Ϻ������ѳ���");
        else System.out.println("����ţ���ѳ���");
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
        if(type.equals("���"))System.out.println("С����ţ���ѳ���");
        else System.out.println("���������ѳ���");
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
        if(type.equals("���"))System.out.println("����ѪѼ�ѳ���");
        else System.out.println("�����Ź��ѳ���");
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
        if(type.equals("���"))System.out.println("�ɹ��ʳ��ѳ���");
        else System.out.println("���Ŷ����ѳ���");
    }
}
