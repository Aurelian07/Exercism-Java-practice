public class JedliksToyCar {
    private int batteryPercentage = 100 ;
    private int distanceTravel = 0 ;
    
    public static JedliksToyCar buy() {
       return new JedliksToyCar() ;
    }
    
    public String distanceDisplay() {
           return "Driven " + distanceTravel + " meters" ;
    }
    
    public String batteryDisplay() {
        if (batteryPercentage == 0){  
            return "Battery empty";
                } 
        return "Battery at " +  batteryPercentage + "%" ;
    }
    
    public void drive() {
            if (batteryPercentage > 0){  
                 distanceTravel += 20;
                 batteryPercentage-- ;
            }
    }
}
