public class sequenciaQualquer {
    public static void main(String[] args) {
        int[] array = new int[10];

        int a = (int)(Math.random()*100);

        for(int i = 0; i < array.length; i++) {
        array[i] = (int)(Math.random()*100);
        System.out.println(array[i]);
        }
    }
}