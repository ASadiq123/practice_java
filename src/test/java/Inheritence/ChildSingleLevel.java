package Inheritence;

public class ChildSingleLevel extends ParentSingleLevel{
    public static void printM() {
        System.out.println ("This is Child");
                    }
     public static void main (String[] args){
        ChildSingleLevel obj = new ChildSingleLevel();
        obj.printM();
        obj.print ();
        System.out.println (obj.num);
         System.out.println( obj.name);
     }

        }

