public class array{

    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.println(" Array declaration & initialization :");
        int studentsRollNumber[] = {101, 102, 103, 104, 105};
        char principlesName[] ={'A','B','B','A','D','A','S','L','O','K','H','A','N','D','W','A','L','A'};
        double annualIncomeInLakhs[] ={228437659, 54l, 33f, 753479748, 90d};
        boolean regularity[] ={true, false, false, true, false, true};
        long cah[]={48l, 43,67, 76, 87};
        short j[]={ 0, 1, 2, 3, 4};
        
        for(int output : studentsRollNumber){
            System.out.println(output);
        }

        for(char ch : principlesName){
            System.out.print( " " + ch);
        }

        System.out.println(studentsRollNumber[1]);
        
        int[][] matrix = {{1, 2}, {3, 4}};
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println(matrix[row][col]);
    }
}

    }
}