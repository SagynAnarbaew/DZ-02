public class France extends  Antanta implements Printable{

    private int artillery;

    public France(Integer battle1, int artillery) {
        super(battle1);
        this.artillery = artillery;
    }

    public int getArtillery() {
        return artillery;
    }

    @Override
    public void print() {

        System.out.println("France in the battle with Italy used: "+getArtillery()+" Artillery");
    }
}
