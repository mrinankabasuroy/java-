public class checkNum {
    void numcheck(int x){
        if (x<0)
            System.out.println("Num is negative");
        else
            System.out.println("Num is positive");
        

    }
    public static void main(String[] args){
        checkNum obj=new checkNum();
        obj.numcheck(-10);
            
        }
    
}