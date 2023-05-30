package Inheritence;

public class AnimalChildLevel extends AnimalParentLevel{
    public static void main (String [] args){
        AnimalChildLevel cow = new AnimalChildLevel ();
        eat ();
        cow.notEat();
        cow.eatSome();
    }
}
