import java.util.*;
public class Trasnpose {
    public static void main(String[] args ){
        int i,j,m,n;
        int mat[][]=new int[10][10];
        Scanner rc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        m=rc.nextInt();
        System.out.println("Enter he number of columns:");
        n=rc.nextInt();
        System.out.println("Enter the matrix element:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                mat[i][j]=rc.nextInt();
            }
        }

        System.out.println("The given matrix is:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(" " +mat[i][j]);
            }
            System.out.println();
        }
         //-------TRANSPOSE METHOD----------           
        int tra[][] = new int[10][10];
        for(i = 0; i < m; i++) {
            for ( j = 0; j <n; j++) {
                tra[j][i] = mat[i][j];
            }
        }
        System.out.println("The transpose of a given matrix is:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(" " +tra[i][j]);
            }
            System.out.println();
        }
    }
}

    

        



    
