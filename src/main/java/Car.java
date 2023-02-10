public class Car {
    String merk;
    String type;
    int bouwjaar;
    String kleur;
    double motorinhoud;

    public Car(String merk, String type, int bouwjaar, String kleur, double motorinhoud) {
        this.merk = merk;
        this.type = type;
        this.bouwjaar = bouwjaar;
        this.kleur = kleur;
        this.motorinhoud = motorinhoud;
    }

    public void print(){
        System.out.println("Deze " + merk + " " + type + " is " + kleur);
    }

    // In plaats van bovenstaande print() methode zul je ook vaak deze toString() methode zien.
    // Dit is de methode die wordt aangeroepen als je in Main zegt "System.out.println(car)"
    @Override
    public String toString(){
        return "Deze " + merk + " " + type + " is " + kleur;
    }
}
