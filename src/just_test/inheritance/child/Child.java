package just_test.inheritance.child;

import just_test.inheritance.parent.Parent;

public class Child extends Parent {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child);
        Parent parent = (Parent) child;
        System.out.println(parent);
        parent = (Parent)child;
        System.out.println(parent);
        System.out.println(child.toString());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    protected String toString(int i) {
        return "new one";
    }
}


