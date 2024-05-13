public class Formatacao {
    public static void main(String[] args) {
        double preco = Math.random() * 100;
        String nome = "Julio";
        double idade = 37;
        double peso = 87.710;

        System.out.printf("%.2f\n",preco);
        System.out.printf("%1$s tem %2$.0f anos e pesa %3$.2f\n",nome,idade,peso);
    }
}