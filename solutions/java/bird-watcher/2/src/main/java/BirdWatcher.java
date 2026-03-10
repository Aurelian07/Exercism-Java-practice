
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
       int[] weeklyBirds = {0, 2, 5, 3, 7, 8, 4} ;
        return weeklyBirds ;
    }

    public int getToday() {
       return birdsPerDay[birdsPerDay.length - 1]  ;
    }

    public void incrementTodaysCount() {
       birdsPerDay[birdsPerDay.length - 1]++ ;
    }

    public boolean hasDayWithoutBirds() {
        for(int birdsPerDays : birdsPerDay){
            if(birdsPerDays == 0){  
                return true ;
            }
        }
        return false ;
    }

    public int getCountForFirstDays(int numberOfDays){ 
      int sum = 0 ;
        if (numberOfDays > birdsPerDay.length){
            numberOfDays = birdsPerDay.length ;
        }
    {  
     for(int i = 0 ; i < numberOfDays ; i++){
            sum += birdsPerDay[i] ;            
        }
    }
     return sum;
    }

    public int getBusyDays() {
        int busyDaysCount = 0 ;
        // For each loop try - easy for iteration in each one
        for(int count : birdsPerDay){
            if (count >= 5 ){
                busyDaysCount++  ;
            }
        }
        return busyDaysCount ;
    }
}
