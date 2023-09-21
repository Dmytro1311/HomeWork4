package net.dmytro.homework8;


public class ArrayValueCalculator  {




    public static int  doCalc(String[][] array) throws ArraySizeException, ArrayDataException {

        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array.length !=4 || array[i].length != 4) throw  new ArraySizeException("Make array size 4x4");
                try {
                    sum += Integer.parseInt(array[i][j]);
                }catch (NumberFormatException ex){
                    throw new ArrayDataException("incorrect array's data " + i + " " + j);
                }
            }
        }
        return sum;




    }
}
