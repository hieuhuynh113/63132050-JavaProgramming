
public class Bai2 {
	public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){
            for (int j = 2; j <= 9; j++){
                System.out.print(String.format("%s x %s = %s \t",j,i,i*j));
            }
            System.out.print("\n");
        }
    }
}
