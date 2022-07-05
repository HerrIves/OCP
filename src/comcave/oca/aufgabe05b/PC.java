package oca.aufgabe05b;

class PC{
    enum Zustand{GESTARTED, AUSGESCHALTET, SCHLAFT}
    String bezeichung;
    Processor processor;
    RAM ram;
    Festplatte festplatte;
    Zustand zustand;

    public PC(String bezeichung, Processor processor, RAM ram, Festplatte festplatte) {
        this.bezeichung = bezeichung;
        this.processor = processor;
        this.ram = ram;
        this.festplatte = festplatte;
        this.zustand = Zustand.AUSGESCHALTET;
    }

    public static boolean starten(PC pc){
        System.out.println("try to start");

        if(pc.zustand == Zustand.GESTARTED)return false;

        pc.zustand = Zustand.GESTARTED;
        return true;
    }
    public static boolean runterfahren(PC pc){
        if (pc.zustand == Zustand.AUSGESCHALTET)return false;
        pc.zustand = Zustand.AUSGESCHALTET;
        return true;
    }
    public static boolean inShlafModusGehen(PC pc){
        if (pc.zustand == Zustand.SCHLAFT)return false;
        pc.zustand = Zustand.SCHLAFT;
        return true;

    }

    @Override
    public String toString() {
        return "PC{" +
                "bezeichung='" + bezeichung + '\'' +
                ", prozessor=" + processor +
                ", ram=" + ram +
                ", festplatte=" + festplatte +
                ", zustand=" + zustand +
                '}';
    }

}











