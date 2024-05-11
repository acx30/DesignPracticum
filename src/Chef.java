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
    public void cookSetmeal()//���ݳ�Ա����ֵ�жϽ�����Ӧ��ϵ�ĳ�ʦ����
    {
        if(cheftype.equals("���")) {
            c1.cookDishA();
            c1.cookDishB();
            c1.cookDishC();
        }
        else {
            if(cheftype.equals("����")) {
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
    public void cookSetmeal()//���ݳ�Ա����ֵ�жϽ�����Ӧ��ϵ�ĳ�ʦ����
    {
        if(cheftype.equals("���")) {
            c1.cookDishA();
            c1.cookDishB();
            c1.cookDishC();
        }
        else {
            if(cheftype.equals("����")) {
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
        dish1=new ADish1("���");
        dish2=new ADish2("���");
        dish3=new ADish3("���");
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
        dish1=new ADish1("����");
        dish2=new ADish2("����");
        dish3=new ADish3("����");
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
        dish1=new BDish1("���");
        dish2=new BDish2("���");
        dish3=new BDish3("���");
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
        dish1=new BDish1("����");
        dish2=new BDish2("����");
        dish3=new BDish3("����");
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


