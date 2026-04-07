class NeedForSpeed {
    private int carBattery  ;
    int speed ;
    int batteryDrain ;
    private int distanceCovered ;
    NeedForSpeed(int speed, int batteryDrain) {
        
        this.speed = speed ;
        this.batteryDrain = batteryDrain;
        this.carBattery = 100 ;
        this.distanceCovered = 0 ;
    }

    public boolean batteryDrained() {
        return (this.carBattery < this.batteryDrain) ;
    }

    public int distanceDriven() {       
        return this.distanceCovered ;
    }

    public void drive() {
        if (!this.batteryDrained() && this.carBattery >= this.batteryDrain){ 
        this.distanceCovered += this.speed;
        this.carBattery -= this.batteryDrain ; 
    }
}
    
    public static NeedForSpeed nitro() {
           return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance ;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
    int amountOfDrives = 100 / car.batteryDrain;
        
    int maxDistance = amountOfDrives * car.speed;
    
    return maxDistance >= this.distance;
    }
}
