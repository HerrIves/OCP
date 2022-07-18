package sudak.practice;

public class t122_12_InnerClass {
    double tariff;
    t122_12_InnerClass(double tariff){
        this.tariff = tariff;
        class InConstr{}
    }
    public void makeCall(){
        int min = 0;
        class LocalClass{}
    }
    static {
        class InStaticBlock{}
    }

        class InInstanceClass{}
        public static class InStaticClass{}


    public static void main(String[] args) {
        t122_12_InnerClass t = new t122_12_InnerClass(1);
        t.new InInstanceClass();
        new t122_12_InnerClass.InStaticClass();
    }
}
