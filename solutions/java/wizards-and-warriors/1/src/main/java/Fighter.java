class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter {
    @Override 
    boolean isVulnerable(){
        return false ;
    }
    @Override
    public String toString (){
        return "Fighter is a Warrior" ;
    }
    @Override
    int getDamagePoints(Fighter opponent ){
        if (opponent.isVulnerable() == true){
            return 10 ;
        } 
        else {
            return 6 ;
        }    
    }
}
// TODO: define the Wizard class
class Wizard extends Fighter {
    @Override 
    public String toString(){
        return "Fighter is a Wizard" ;
    }
    boolean preparedSpell = false ;
    void prepareSpell(){
        preparedSpell = true ;
    }
    @Override
    boolean isVulnerable(){
     return preparedSpell == false ;
    }
    @Override
     int getDamagePoints(Fighter opponent ){
        if (preparedSpell == true){
        return 12 ;
        } 
        else {
            return 3 ;
        }    
    }
}
