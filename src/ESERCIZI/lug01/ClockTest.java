package ESERCIZI.lug01;

import ESERCIZI.lug01.Clock;

public class ClockTest {
    public static void main(String[] args) {
        Clock myClock = new Clock();
        myClock.displayPartOfDay(Short.parseShort(args[0]));
    }
}
