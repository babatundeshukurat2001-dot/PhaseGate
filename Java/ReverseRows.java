//input:[
//    [1,2,3],
//    [4,5,6],
//    [7,8,9]
//        ]
//output:[
//    [3,2,1],
//    [6,5,4],
//    [9,8,7]
//
//]

public class ReverseRows {

    public static void main(String[] args) {

        int[][] input = {
            {1, 2, 3, 7, 9},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int count = 0; count < input.length; count++) {

            int left = 0;
            int right = input[count].length - 1;

            while (left < right) {

                int temp = input[count][left];

                input[count][left] = input[count][right];

                input[count][right] = temp;

                left++;

                right--;
            }
        }
            System.out.print("[");

        for (int count = 0; count < input.length; count++) {

                System.out.print("[");
                 
            for (int index = 0; index < input[count].length; index++) {
                

                System.out.print(input[count][index] + "," + "" );
                     
               
            }
           
            System.out.print("]");

        }
         System.out.print("]");
    }
}

