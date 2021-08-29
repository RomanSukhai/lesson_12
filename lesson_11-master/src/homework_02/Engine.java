package homework_02;

public class Engine extends  Vihle{
   private int countcylinder;


    public Engine(int diametrVhile, String material, int countcylinder) {
        super(diametrVhile, material);
        this.countcylinder = countcylinder;
    }

    public int getCountcylinder() {
        return countcylinder;
    }

    public void setCountcylinder(int countcylinder) {
        this.countcylinder = countcylinder;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "countcylinder=" + countcylinder +toString()+
                '}';
    }

}
