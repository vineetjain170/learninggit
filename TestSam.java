class TestSam{
    public static void main(String[] args){
        SAMExample obj=(i)->{
            for(int j=0;j<i;j++)System.out.println(j);
            return i;
        };
        obj.loop(10);
    }
}
public interface SAMExample{
    public int loop(int i);
    //comment
    //another comment
}
