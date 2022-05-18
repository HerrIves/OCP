package inheritance.child;

import inheritance.parent.Parent;

public class Child extends Parent {
    public static void main(String[] args) {
        System.out.println(new Child());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    protected String toString(int i){
        return "new one";
    }
}


