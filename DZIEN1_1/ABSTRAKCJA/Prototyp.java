public abstract class Prototyp {
    protected int x;
    protected int y;

    public Prototyp(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String opis(){
        return "to jest metoda nieabstrakcyjna klasy abstrakcyjnej";
    }
    
    public abstract int policz();

}
