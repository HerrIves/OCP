package just_test;

interface SimpleInterface{
    void hi();
}

class SimpleClass {
    public  void hi(){};
}

class AnotherSimpleClass extends SimpleClass{
    @Override
    public void hi() {
    }
}
