package designPattern;

public class FactoryPattern {
    public OS getInstance(String type){
        if(type.equals("open"))
            return new Android();
        if(type.equals("close"))
            return new IOS();
        else return new Windows();
    }
}
