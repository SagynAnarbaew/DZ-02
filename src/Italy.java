import World_2.Axis;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

public class Italy extends Axis {
    private Integer aircraft;


    public Italy(Integer battle, Integer aircraft) {
        super(battle);
        this.aircraft = aircraft;
    }

    public Integer getAircraft() {
        return aircraft;
    }

    @Override
    public void print() {
        System.out.println("Italy aircraft: " + getAircraft() +
                "\nwas battle: " + getBattle());

    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        return 0;
    }
}