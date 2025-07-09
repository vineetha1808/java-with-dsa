interface Animal{
    public void animalSound();
    public void sleep();
}
class dog implements Animal{
public void animalSound(){
    System.out.println("the dog says:bow--bow");
}
public void sleep(){
    System.out.println("Zzzzz");
}
}
class Main{
    public static void main(String[] args){
        dog myDog=new dog();
        myDog.animalSound();
        myDog.sleep();
    }
}