public class RoachPopulationTest {
    public static void main(String[] args) {
        RoachPopulation roachPopulation = new RoachPopulation(10);
        System.out.print("Simülasyon başlatılıyor...");
        for (int i=0 ; i<4 ; i++){
            System.out.println("Hamamböceği sayısı : " + roachPopulation.getRoachCount());
            roachPopulation.Breed();
            System.out.println("Üreme sonrası güncel hamamböceği sayısı : " +
                    roachPopulation.getRoachCount());
            roachPopulation.Sprey(10);
            System.out.println("Sprey sıkıldıktan sonra hamamböceği sayısı : " +
                    roachPopulation.getRoachCount());
        }
    }
}
