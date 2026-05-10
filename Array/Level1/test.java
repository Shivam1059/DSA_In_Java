String s = "ab";
String t = "pqrs";
int i = s.length(); 
int j = t.length();

String s = "";

while( i >= 0 || j>=0){
    if(j >= 0 && j%2 != 0){
        s += t.charAt(j);
        j--;
    }
    else if( i >= 0 && i > j){
        s += s.charAt(i);
        i--;
    }
    else if( j >= 0 && j > i){
        s += t.charAt(j);
        j--;
    }
    else if(i >= 0){
      s += s.charAt(j);
      i--;
    }
}

return s;