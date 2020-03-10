package classdesign.classinheritence;

public class Shark extends Fish {
    private int numberofFins = 8;
    public Shark(int age) {
        super(age);
        this.size = 4;
    }

    public   void displaySharkDetails(){
        System.out.println("Age " + getAge());
        System.out.println("Size " + super.size);
        System.out.println(numberofFins);

    }

    public static void main(String[] args) {
        Shark shark = new Shark(5);
        shark.displaySharkDetails();
    }
}