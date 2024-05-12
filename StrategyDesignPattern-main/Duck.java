public abstract class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void performFly(){
        flyBehaviour.fly();
    }
    public void swim(){
        System.out.println("Duck can swim");
    }
    public abstract void display();
}

class MalardDuck extends Duck{
    public MalardDuck(){
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyWithWings();
    }

    public void display(){
        System.out.println("I am Malard Duck on screen");
    }
}

class RedHeadDuck extends Duck{
    public void display(){
        System.out.println("I am Red Head Duck on screen");
    }
}