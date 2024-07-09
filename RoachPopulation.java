public class RoachPopulation {
    private int roachCount;
    public RoachPopulation(int count){
        roachCount = count;
    }

    public int getRoachCount() {
        return roachCount;
    }
    public void Breed(){
        roachCount = roachCount * 2;
    }
    public void Sprey(double percent){
        roachCount = (int) (roachCount - (roachCount * (percent / 100)));
    }
}
