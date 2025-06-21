class Car{
    // properties
    private String color;
    private String type;
    private int speed = 0; // km/h
    private int currentGear = 0;

public void upCurrentGear() {
    if(currentGear < 4){
        currentGear++;
    }
}

public void downCurrentGear() {
    if(currentGear > -1){
        currentGear--;
    }
}
    
    // task to do - methods
    void accelerate(){
        if(currentGear == 0){
            // no change in speed
        } else if(currentGear==1){
            speed = speed + 5;
        } else if(currentGear==2){
            speed = speed + 10;
        } else if(currentGear==3){
            speed = speed + 12;
        } else if(currentGear==4){
            speed = speed + 15;
        } else {
            speed = 5;
        }
        System.out.println("Car is moving with speed #"+speed);
    }
    void applyBreak(){}
}
public class D7_Car {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.upCurrentGear();
        obj.accelerate();
        obj.upCurrentGear();
        obj.accelerate();
        
    }
}
