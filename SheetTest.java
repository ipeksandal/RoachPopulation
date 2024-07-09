public class SheetTest {
    public static void main(String[] args) {
        Sheet A0 = new Sheet("A0", 841, 1189);
        System.out.println(A0.getName() + " " +
                "sayfasının boyutları " + A0.getWidth() + "x" +
                A0.getHeight());
        Sheet A1 = A0.CutlnHalf();
        System.out.println(A1.getName() + " " +
                "sayfasının boyutları " + A1.getHeight() + "x" +
                A1.getWidth());
    }
}
