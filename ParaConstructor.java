public class ParaConstructor{
    public int height;
    public int width;

    ParaConstructor(int h, int w){
        height = h;
        width = w;
    }

    void Show(){
        System.out.println("Area is : "+(height*width));
    }

    public static void main(String args[]){
        ParaConstructor obj = new ParaConstructor(10,20);
        obj.Show();
    }
}