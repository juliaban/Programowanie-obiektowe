interface Animal{
    Animal speak(String spk);
}

final class Dog implements Animal{
    private final String sound;
    Dog(String s){
        this.sound = s;
    }
    @Override
    public
    Animal speak(String spk){
        return new Dog(this.sound += spk);
    }
}


public class ex2 {
    public static void main(String[] args) {
        Dog newDog = new Dog("WOOF!");
    }
}
