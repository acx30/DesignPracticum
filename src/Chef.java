class HeadChefA{
    String cheftype;
    Chef c1,c2;
    HeadChefA(String str)
    {
        cheftype=str;
        c1=new AChefofXIANG();
        c2=new AChefofCHUAN();
        cookSetmeal();
    }
    public void cookSetmeal()//根据成员变量值判断交给对应菜系的厨师做菜
    {
        if(cheftype.equals("湘菜")) {
            c1.cookDishA();
            c1.cookDishB();
            c1.cookDishC();
        }
        else {
            if(cheftype.equals("川菜")) {
                c2.cookDishA();
                c2.cookDishB();
                c2.cookDishC();
            }
        }
    }
}
class HeadChefB{
    String cheftype;
    Chef c1,c2;
    HeadChefB(String str)
    {
        cheftype=str;
        c1=new BChefofXIANG();
        c2=new BChefofCHUAN();
        cookSetmeal();
    }
    public void cookSetmeal()//根据成员变量值判断交给对应菜系的厨师做菜
    {
        if(cheftype.equals("湘菜")) {
            c1.cookDishA();
            c1.cookDishB();
            c1.cookDishC();
        }
        else {
            if(cheftype.equals("川菜")) {
                c2.cookDishA();
                c2.cookDishB();
                c2.cookDishC();
            }
        }
    }
}
public interface Chef {
    void cookDishA();
    void cookDishB();
    void cookDishC();
}

class AChefofXIANG implements Chef{
    ADish1 dish1;
    ADish2 dish2;
    ADish3 dish3;
    AChefofXIANG(){
        dish1=new ADish1("湘菜");
        dish2=new ADish2("湘菜");
        dish3=new ADish3("湘菜");
    }
    public void cookDishA(){
        dish1.isCooked();
    }
    public void cookDishB(){
        dish2.isCooked();
    }
    public void cookDishC(){
        dish3.isCooked();
    }
}
class AChefofCHUAN implements Chef{
    ADish1 dish1;
    ADish2 dish2;
    ADish3 dish3;
    AChefofCHUAN(){
        dish1=new ADish1("川菜");
        dish2=new ADish2("川菜");
        dish3=new ADish3("川菜");
    }
    public void cookDishA(){
        dish1.isCooked();
    }
    public void cookDishB(){
        dish2.isCooked();
    }
    public void cookDishC(){
        dish3.isCooked();
    }
}
class BChefofXIANG implements Chef{
    BDish1 dish1;
    BDish2 dish2;
    BDish3 dish3;
    BChefofXIANG(){
        dish1=new BDish1("湘菜");
        dish2=new BDish2("湘菜");
        dish3=new BDish3("湘菜");
    }
    public void cookDishA(){
        dish1.isCooked();
    }
    public void cookDishB(){
        dish2.isCooked();
    }
    public void cookDishC(){
        dish3.isCooked();
    }
}
class BChefofCHUAN implements Chef{
    BDish1 dish1;
    BDish2 dish2;
    BDish3 dish3;
    BChefofCHUAN(){
        dish1=new BDish1("川菜");
        dish2=new BDish2("川菜");
        dish3=new BDish3("川菜");
    }
    public void cookDishA(){
        dish1.isCooked();
    }
    public void cookDishB(){
        dish2.isCooked();
    }
    public void cookDishC(){
        dish3.isCooked();
    }
}


