class WrapperClassInt{
    public static void main(String args[]){
    int x = Integer.parseInt("123");
    System.out.println(x);

    Integer x1 = Integer.valueOf("10101",2);
    int z = x1.intValue();

    System.out.println(z);
}
}