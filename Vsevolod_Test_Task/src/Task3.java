public class Task3 {
    public void array(){
        int [] array1 = new int[]{5,8,9,13,15,20,21,25,30,33,37};
        System.out.print("Числа из массива, кратные трем:");
        for (int i = 0; i < array1.length; i++){
            if(array1[i]%3 == 0){
                System.out.print(" " + array1[i]);
            }
        }
    }
}
