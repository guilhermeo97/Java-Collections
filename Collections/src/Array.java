public class Array {
    public static void main(String[] args) throws Exception {
        int[] myArray = new int[4];
        myArray[0] = 32;
        myArray[1] = 22;
        myArray[2] = 22;
        myArray[3] = 328;

        String[] stringArray = {"batata", "cenoura", "tomate"};
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
