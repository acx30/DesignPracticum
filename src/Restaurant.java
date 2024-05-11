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
        if(type.equals("Ïæ²Ë"))new HeadChefA("Ïæ²Ë");
        else if(type.equals("´¨²Ë")) new HeadChefA("´¨²Ë");
    }
}
class RestaurantB implements Restaurant{
    private String type;
    RestaurantB(String type){
        this.type=type;
    }
    public void startCook()
    {
        if(type.equals("Ïæ²Ë"))new HeadChefB("Ïæ²Ë");
        else if(type.equals("´¨²Ë")) new HeadChefB("´¨²Ë");
    }
}

