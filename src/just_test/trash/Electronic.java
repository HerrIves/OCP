package just_test.trash;

public class Electronic implements Device {
    public void doIt() { }

    public static void main(String[] args) {
        Electronic electronic = new Electronic();
        electronic.doIt();
    }
}

abstract class Phone1 extends Electronic {
}

abstract class Phone2 extends Electronic {
    public void doIt(int x) { }
}

class Phone3 extends Electronic implements Device {
    public void doStuff() { }
}

interface Device {
    public void doIt();
}