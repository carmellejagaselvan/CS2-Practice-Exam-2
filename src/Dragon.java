public class Dragon {
    private int firePower;
    private int treasureGuarded;

    public Dragon(int pFirePower, int pTreasureGuarded){
        firePower = pFirePower;
        treasureGuarded = pTreasureGuarded;
    }

    public int getFirePower(){
        return firePower;
    }

    public void setFirePower(int newFirePower){
        this.firePower = newFirePower;
    }

    public int getTreasureGuarded(){
        return treasureGuarded;
    }

    public void setTreasureGuarded(int newTreasureGuarded){
        this.treasureGuarded = newTreasureGuarded;
    }

    public void printInfo(){
        System.out.println("Fire Power: " + firePower);
        System.out.println("Treasure Guarded: " + treasureGuarded);
    }

}
