package homework_02;

public  class Vihle {

    private int diametrVhile;
    private String material;


    public Vihle(int diametrVhile, String material) {
        this.diametrVhile = diametrVhile;
        this.material = material;
    }

    public int getDiametrVhile() {
        return diametrVhile;
    }

    public String getMaterial() {
        return material;
    }

    public void setDiametrVhile(int diametrVhile) {
        this.diametrVhile = diametrVhile;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Vihle{" +
                "diametrVhile=" + diametrVhile +
                ", material='" + material + '\'' +
                '}';
    }
}
