interface Thanksgiving {
    public void thanksToYouAll();
}
class Appreciation implements Thanksgiving {

    public void thanksToYouAll(){
        System.out.println(" Tested, Approved and Trusted");
    }
}

class Execution {
    public  static void main(String[]  mrRidwan){
        Thanksgiving appreciation  = new Appreciation ();
        appreciation. thanksToYouAll();
    }
}