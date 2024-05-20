public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(moltiplica(3, 2));
        System.out.println(concatena("Concatena una stringa + intero: ", 2));

        String[] fiveElement = {"Ciao", "come", ",tutto", "bene", "?"};
        String[] result = inserisciInArray( fiveElement , "stai");
        for (String s : result) {
            System.out.println(s);
        }
    }
    public static int moltiplica(int a, int b){
        return a * b;
    }
    public static String concatena(String string, int number){
        return string + number;
    }
    public static String[] inserisciInArray(String[] array, String string){
        String[] result = new String[6];
        for (int i = 0; i < result.length; i++) {
            if (i < 2){
                result[i] = array[i];
            }
            else if (i == 2){
                result[i] = string;
            }
            else {
                result[i] = array[i - 1];
            }
        }
        return result;
    }
}