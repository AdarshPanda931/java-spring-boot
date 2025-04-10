public class demo2Array {
    public static void main(String[] args){
        int nums[][] = new int[3][4];
        //Math.random();//gives random values between 0,1
        //assign random number to 2d array
        for(int i=0; i< nums.length; i++){
            for(int  j=0; j<nums[0].length; j++){
                nums[i][j] = (int)(Math.random() *10);
            }
        }
        //print all
        for(int i=0; i< nums.length;i++){ //hover all rows
            for(int j=0; j<nums[0].length; j++){ //hover all col of each row
                System.out.print(nums[i][j]);
            }
            System.out.println();//just new line
        }
        //enhanced for loop
        for(int n[]:nums){
            for(int m:n){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
