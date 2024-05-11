public interface Ordering {
    public void serving(String s1,String s2);
}

class Customer implements Ordering{
    public void serving(String s1,String s2) {
        if (s1.equals("A")) {
            System.out.println("请稍等--------------------");
            try{
                Thread.currentThread().sleep(5000);}
            catch (Exception exception){}
            new RestaurantA(s2).startCook();
            System.out.println("已上菜--------------------");
        }
        else if (s1.equals("B")) {
            System.out.println("请稍等--------------------");
            try {
                Thread.currentThread().sleep(5000);
            } catch (Exception exception) {
            }
            new RestaurantB(s2).startCook();
            System.out.println("已上菜--------------------");
        }
    }
}

class Proxy implements Ordering{
     private Ordering ordering;
     Proxy(Ordering o)
     {
         ordering=o;
     }
     public void serving(String s1,String s2){
         useCoupon();
         ordering.serving(s1,s2);
     }
     public void useCoupon()
     {
         System.out.println("已使用九折优惠券");
     }
}

