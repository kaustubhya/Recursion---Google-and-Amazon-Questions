import java.util.ArrayList;
// AMAZON
public class Die_Face_Number_Combinations_Array_List {
    public static void main(String[] args) {
        System.out.println(dieFaceList("", 5));
        
    }

    static ArrayList<String> dieFaceList(String p, int target) {
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(dieFaceList(p + i, target - i));
        }

        return ans;


    }
    
}
