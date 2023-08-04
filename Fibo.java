public class Fibo {
    public static void main (String[] args){
        int terms =10 ;
        int prev =0 ; 
        int curr = 1;

        System.out.println("Fibionacci Series up to " + terms+" terms: ");

        for(int i =0; i< terms;i++){
            System.out.println(prev+" ");
            int next=prev+curr;
            prev=curr;
            curr=next;
        }
    }
}
