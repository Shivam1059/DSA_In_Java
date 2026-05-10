import java.util.*;

class Test{
    public boolean checkAnagram(String s , String t){
        int n = s.length();
        int m = t.length();
        if(n != m) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int j=0; j<m; j++){
            char hm = t.charAt(j);
            if(map.containsKey(hm)){
                map.put(hm, map.get(hm) -1);
            }else{
                return false;
            }
        }

        for(int cont : map.values()){
            if(cont != 0){
                return false;
            }
        }
        return true;
    }

    public List<List<String>> groupAnagram(String[] s){
       List<List<String>> list = new ArrayList<>();
       int n = s.length;

       boolean[] visited = new boolean[n];
       int j = 0;
       while(j <  n){

        if(visited[j]){
            j++;
            continue;
        }
       ArrayList<String> list1 = new ArrayList<>();
         for(int i=0; i<n; i++){
            if(i != j){
              if(!visited[i] && checkAnagram(s[i], s[j])){
                 list1.add(s[i]);
                 visited[i] = true;
               }

            }
         }
         list.add(list1);
              j++;
       }
  
    return list;
    } 
}

class AnagramGroup{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        String [] str = new String[size];
        sc.nextLine(); 
        for(int i=0; i<size; i++){
            System.out.print("Enter the String : ");
            String s = sc.nextLine();
            str[i] = s;
        }

        // for(String word : str){
        //     System.out.print(word+",");
        // }
        // System.out.println();

       Test t = new Test();
       System.out.println( t.groupAnagram(str));
    }
}