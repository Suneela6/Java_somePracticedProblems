public class MazePath {
    public static void main(String[] args) {
        mazepath("",7,3);
    }
    static void mazepath(String p,int r,int c){
        if(r==1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r>1){
            mazepath(p + 'd',r-1,c);
        }
        if(c>1){
            mazepath(p + 'r',r,c-1);
        }
    }
}


// static ArrayList<String> pathRet(String p, int r, int c) {
//         if (r == 1 && c == 1) {
//             ArrayList<String> list = new ArrayList<>();
//             list.add(p);
//             return list;
//         }

//         ArrayList<String> list = new ArrayList<>();

//         if (r > 1) {
//             list.addAll(pathRet(p + 'D', r-1, c));
//         }

//         if (c > 1) {
//             list.addAll(pathRet(p + 'R', r, c-1));
//         }

//         return list;
//     }
