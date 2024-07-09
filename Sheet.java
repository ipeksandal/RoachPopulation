public class Sheet {
   private double width;
   private double height;
   private String name;
   public Sheet(String n, double w, double h){
       name = n;
       width = w;
       height = h;
   }
   public Sheet CutlnHalf(){
       double newWidth = width;
       double newHeight = (height / 2);
       String newName = "A" + Integer.parseInt(name.substring(1)+1);
       return new Sheet(newName, newWidth, newHeight);
   }
    public String getName() {
        return name;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
}