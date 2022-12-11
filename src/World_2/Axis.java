package World_2;

import java.awt.print.Printable;

public abstract class Axis implements Printable {
    private Integer battle;


    public Axis(Integer battle) {
        this.battle = battle;
    }

    public Integer getBattle() {
        return battle;
    }

    public abstract void print();
}

