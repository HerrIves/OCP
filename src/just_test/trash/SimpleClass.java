package just_test.trash;

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
