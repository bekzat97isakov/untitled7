public class Cat extends Animal {
    private String catName;
    private int catAge;
    private int catWeight;
    public Cat(String animalName, int animalAge,String catName,int catAge,int catWeight){
        super(animalName, animalAge);
        this.catName = catName;
        this.catAge = catAge;
        this.catWeight = catWeight;
    }

    public String getCatName() {
        return catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public int getCatWeight() {
        return catWeight;
    }
}
