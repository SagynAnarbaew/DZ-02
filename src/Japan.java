import World_2.Axis;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

public class Japan extends Axis {

    private Integer fleet;

    public Japan(Integer battle, Integer fleet) {
        super(battle);
        this.fleet = fleet;
    }

    public Integer getFleet() {
        return fleet;
    }

    @Override
    public void print() {
        System.out.println("Japan fleet: " + getFleet() +
                "\nwas battle: " + getBattle() );

    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        return 0;
    }
}