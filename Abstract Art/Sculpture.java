public class Sculpture extends Art {
    private String material;


public Sculpture(String title, String author, String description,String material) {
        super(title, author, description);
        this.material = material;
    }    
    @Override
    public void viewArt(){
        System.out.println("This is a sculpting course for creating wonderful sculptures");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
