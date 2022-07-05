package oca.aufgabe04d;

import java.util.Random;

public class PassGenerator {
    int passLength;
    String password;

    public PassGenerator setPassLength(int passLength) {
        this.passLength = passLength;
        return this;
    }

    public String generateAndCheckPass() {

        do {
            StringBuffer passbuffer = new StringBuffer(passLength);

            new Random()
                    .ints(passLength, 33, 122)
                    .forEach(x -> passbuffer.append((char) x));
            password = passbuffer.toString();

        } while (!checkPassReq(password));

        return password;
    }

    private static boolean checkPassReq(String password) {
        System.out.println(password);
        return  password.matches(".*[\\d]+.*")    //   ".*[\\d]+" any digit
                && password.matches(".*[A-Z]+.*") //   "[A-Z]+"   Big Letter
                && password.matches(".*[\\W]+.*");//   ".*\\W+"   any non Letter

    }


}
