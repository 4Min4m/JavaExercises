public class FindLargestNumber {
    public static void main (String[] args){
        int[] numbers={10,4,6,43,25,67,89};
        int largest=numbers[0];

        for(int i =1;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        System.out.println("The largest number is : "+ largest);
    }
}