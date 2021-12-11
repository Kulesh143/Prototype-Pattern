class Sheep implements Animal{
    public Sheep(){
        System.out.println("Sheep is made");
    }
    public Animal makeCopy(){
        System.out.println("Sheep is being made");
        Sheep sheepObject=null;
        try {
            sheepObject=(Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheepObject;
    }

    @Override
    public String toString() {
        return "Dolly is my sheep!!! BAAAAAAAAA";
    }
}