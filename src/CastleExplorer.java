public class CastleExplorer {
    public static void main(String[] args) {
        CastleExplorer myCode = new CastleExplorer();
    }

    private String ancientRunes = "z%nxt#%lh#@wsife#w#qr$mt*h!lho#gr&tw#sxrk^o#wl#tvqu!mf#*pzl#i#e!ksv#fe*$sioe#s#i#pmn#?*wt#bh#rzfhwie#xf#jntxo#h%nr#fue#*!orzs#jst#^*@";
    public Dragon[] dragons;
    private boolean equalFire = false;


    public CastleExplorer(){
        System.out.println("Welcome, brave knight! May your code be as strong as your sword!");
        dragons = new Dragon[50];
        for (int i=0; i<dragons.length; i++){
            dragons[i] = new Dragon((int)Math.random()*91+10, (int)Math.random()*450+50);
        }
        displayDragons();
        System.out.println("It is " + checkFirePower() + " that the fire power of two different dragons are equal");
        System.out.println(decipher(ancientRunes));
    }

    public void displayDragons(){
        for (int i=0; i< dragons.length; i++){
            System.out.println("Dragon " + i);
            dragons[i].printInfo();
            System.out.println();
        }
    }

    public boolean checkFirePower(){
        for (int i=0; i<dragons.length; i++){
            for(int j=0; j<dragons.length; j++){
                if(dragons[i].getFirePower() == dragons[j].getFirePower()&& i!=j){
                    equalFire = true;
                }
            }
        }
        return equalFire;
    }

    public String decipher(String text){
        String decodedMessage= " ";
        int hashIndex = text.indexOf("#");
        while (hashIndex>-1){
            decodedMessage = text.substring(hashIndex-1, hashIndex+1);
            hashIndex = text.indexOf("#", hashIndex+1);
        }
        return decodedMessage;
    }

}