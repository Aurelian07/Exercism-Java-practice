public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
     public int remainingMinutesInOven(int x){
           return (expectedMinutesInOven() - x) ;
       }
    public int preparationTimeInMinutes(int y){
        return 2*y ;
       }
    public int totalTimeInMinutes(int p, int q){
        return  q + 2*p ;
       }
}
