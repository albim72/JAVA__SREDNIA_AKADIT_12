public class Pojazd implements IPojazd {
    @Override
    public double spalanie100(double odl, double litry) {
        return litry*100/odl;
    }

    @Override
    public double kosztyPrzejazdu(double odl, double litry, double cena_l) {
        return spalanie100(odl,litry)*(odl/100)*cena_l;
    }
}
