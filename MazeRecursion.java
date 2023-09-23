public class MazeRecursion {
    public static void main(String[] args) {
        System.out.println(Mazecount(8,3));
    }
    static int Mazecount(int left,int right){
        if(left == 1 || right == 1){
            return 1;
        }
        int l = Mazecount(left - 1,right);
        int r = Mazecount(left ,right - 1);
        return l + r;

    }
}
