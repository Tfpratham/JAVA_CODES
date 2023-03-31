import java.util.Scanner;

class multiplication {
    /**
     * @param rc
     */
    public static void main(String[] args){
        int i,m,n,res;
        Scanner rc= new Scanner (System.in);
        System.out.println("Enter the where the table is to be printed");
        m=rc.nextInt();
        System.out.println("Upto how many times the table is to be printed: ");
        n=rc.nextInt();
        System.out.println("multiplication table of "+m+ "is as follows");
        for(i=0;i<=n;i++){
            res=m*i;
            System.out.println(m+"x"+i+"="+res);

        }
    }
}
