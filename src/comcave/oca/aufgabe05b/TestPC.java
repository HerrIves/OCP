package oca.aufgabe05b;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class TestPC {
    static Logger logger = LoggerFactory.getLogger(TestPC.class);

    public static void main(String[] args) {
        List<PC> pcList = new ArrayList<>();
        pcList.add(new PC("HP", Processor.getInstance(), RAM.getInstance(), Festplatte.getInstance()));
        pcList.add(new PC("DELL", Processor.getInstance(2500), RAM.getInstance(2048), Festplatte.getInstance(500)));
        pcList.add(new PC("IBM", Processor.getInstance(3500), RAM.getInstance(4096), Festplatte.getInstance(750)));

        pcList.stream()
                .peek(pc -> logger.info("{}", pc))
                .peek(PC::starten)
                .peek(pc -> logger.info("{}", pc.zustand))
                .peek(PC::runterfahren)
                .forEach(pc -> logger.info("{}", pc.zustand));

        logger.info("end");

    }


}
