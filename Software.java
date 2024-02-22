public class JoeFunction {
    // prints the cubes of the ints from 1 up to and including n
    public static void cubes(int n){
        for(int i=1;i<=n;i++){
            System.out.println((int)Math.pow(i,3));
        }

    }
    public static void main(String[] args) {
        cubes(5);
    }
}
