package ocp.aufgaben.aufgabe01g;

public final class Auto {
    public final String hersteller;
    public final String modell;
    public final Motor motor;
    public final int baujahr;

    int test = 0;

    public int getHibraum() { return motor.hibraum; }
    public int getLeistung() { return motor.leistung; }

    public void setHibraum(int hibraum){ motor.hibraum = hibraum; }
    public void setLeistung(int leistung){ motor.leistung = leistung; }

    public Auto(String hersteller, String modell, int hibraum, int leistung, int baujahr) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.motor = new Motor(hibraum, leistung);
        this.baujahr = baujahr;
    }


    private class Motor {
        public int hibraum;
        public int leistung;

        String test;

        private Motor(int hibraum, int leistung) {
            this.hibraum = hibraum;
            this.leistung = leistung;

            Motor.this.test = "10";
            Auto.this.test = 10;
        }

        @Override
        public String toString() {
            return "Motor{" +
                    "hibraum=" + hibraum +
                    ", leistung=" + leistung +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Auto{" +
                "hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", motor=" + motor +
                ", baujahr=" + baujahr +
                '}';
    }
}
