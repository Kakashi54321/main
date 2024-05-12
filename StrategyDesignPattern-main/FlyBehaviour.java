public interface FlyBehaviour {
    public void fly();
}

class FlyWithWings implements FlyBehaviour{
    public void fly(){
        System.out.println("I am flying with wings");
    }
}