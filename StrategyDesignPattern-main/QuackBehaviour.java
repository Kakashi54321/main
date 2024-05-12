public interface QuackBehaviour {
    public void quack();
}

class Squeak implements QuackBehaviour{
    public void quack(){
        System.out.println("I am squeaking");
    }
}