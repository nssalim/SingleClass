public class WaterBottle {
    private int volume;

    //volume should start at 100
    public WaterBottle() {
        this.volume = 100;
    }

    //drink function which takes 10 from the volume each time
    //it is called
    public void drink(){
        this.volume -= 10;
    }
    //empty function brings the volume down to 0
    public void empty(){
        this.volume = 0;
    }
    //fill function that fills the volume back to 100
    public void fill(){
        this.volume = 100;
    }


    public int getVolume() {
        return this.volume;
    }

}
