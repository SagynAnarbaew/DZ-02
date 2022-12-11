import World_2.Axis;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

public class Germany extends Axis {
    private Integer tanks;

    public Germany(Integer battle,  Integer tanks) {
        super(battle);
        this.tanks = tanks;
    }



    public Integer getTanks() {
        return tanks;
    }

    @Override
    public void print() {
        System.out.println("Germany tanks: " + getTanks() + "\nwas battle: " + getBattle());


    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        return 0;
    }
}