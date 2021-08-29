package homework_02;

public class Car  extends Engine{

    private int yearBorn;
    private int hoursStrong;


    public Car(int diametrVhile, String material, int countcylinder, int yearBorn, int hoursStrong) {
        super(diametrVhile, material, countcylinder);
        this.yearBorn = yearBorn;
        this.hoursStrong = hoursStrong;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public int getHoursStrong() {
        return hoursStrong;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public void setHoursStrong(int hoursStrong) {
        this.hoursStrong = hoursStrong;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearBorn=" + yearBorn +
                ", hoursStrong=" + hoursStrong +" diametrVhile: "+getDiametrVhile()+" material: "+getMaterial()+" countcylinder: "+getCountcylinder()+
                '}';
    }
}
