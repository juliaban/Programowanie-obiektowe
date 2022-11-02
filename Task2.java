final class BunchOfFlowers {
    int bunchPrice;
    int bunchType;
    String bunchSize;
    String bunchColour;
    
        
    public BunchOfFlowers(int price, int typeOfFlowers, String size, String mainColour) {
    this.bunchPrice = price;
    this.bunchType = typeOfFlowers;
    this.bunchSize = size;
    this.bunchColour = mainColour;
    }
    
    public BunchOfFlowers(String price, String typeOfFlowers, String size, String mainColour) {
        this(Integer.parseInt(price), Integer.parseInt(typeOfFlowers), size, mainColour);
    }
    
    public BunchOfFlowers(int price, String size, String mainColour){
        this(price, 5, size, mainColour);
    }
    
    public BunchOfFlowers(int price, String size){
        this(price, 5, size, "white");
    }
    
    void PrintFlowersInfo(){
        System.out.println("The price for a bunch of flowers is: " + bunchPrice + " PLN" + "\nNumber of types of flowers: " + bunchType + "\nSize: " + bunchSize + "\nMain colour of flowers: " + bunchColour +"\n");
    }

}

public class Task2 {

    public static void main(String[] args) {
        BunchOfFlowers newFlower = new BunchOfFlowers( 50, 4, "medium", "red");
        BunchOfFlowers noType = new BunchOfFlowers(30, "small", "pink");
        BunchOfFlowers noTypeAndMainColour = new BunchOfFlowers(70, "big");
        newFlower.PrintFlowersInfo();
        noType.PrintFlowersInfo();
        noTypeAndMainColour.PrintFlowersInfo();
    }
}
