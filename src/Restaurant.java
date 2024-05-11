public interface Restaurant {
    public void startCook();
}
class RestaurantA implements Restaurant{
    private String type;
    RestaurantA(String type){
        this.type=type;
    }
    public void startCook()
    {
        if(type.equals("���"))new HeadChefA("���");
        else if(type.equals("����")) new HeadChefA("����");
    }
}
class RestaurantB implements Restaurant{
    private String type;
    RestaurantB(String type){
        this.type=type;
    }
    public void startCook()
    {
        if(type.equals("���"))new HeadChefB("���");
        else if(type.equals("����")) new HeadChefB("����");
    }
}

