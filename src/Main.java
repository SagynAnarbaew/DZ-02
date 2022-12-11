import World_2.Axis;

public class Main {
    public static void main(String[] args) {



        Ussr ussr = new Ussr(300, 1000000);
        France france = new France(290, 300034);
        England england = new England(240, 32423);
        ussr.print();
        france.print();
        england.print();


    Axis germany = createObject("Germany");
    Axis italy = createObject("Italy");
    Axis japan = createObject("Japan");
        germany.print();
        italy.print();
        japan.print();
}


    public static Axis createObject(String className){
        switch (className) {
            case "Germany":
                Germany germany = new Germany(123,  453);
                return germany;
            case "Italy":
                Italy italy = new Italy(222, 564);
                return italy;
            case "Japan":
                Japan japan = new Japan(345, 4234);
                return japan;

        }
        return null;
    }
}
