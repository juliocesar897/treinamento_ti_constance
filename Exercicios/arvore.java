public class arvore {
    public static void main(String[] args){
        int t = 5;
//y = x*2+1
        for (int i = 0;i<t;i++){
            for (int z = 0;z<(t-i-1);z++){
                System.out.print(" ");  
            }
 
            for(int j = 0;j<(i*2+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }    
        for (int i = 0;i<t;i++){
            for (int z = 0;z<(t-i-1);z++){
                System.out.print(" ");  
            }
 
            for(int j = 0;j<(i*2+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }    
    }
}