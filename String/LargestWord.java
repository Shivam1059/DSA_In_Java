import java.util.Scanner;

class Test {

    public String checkLargest(String str) {

        int len = str.length();

        int i = 0, j = 0;

        int max_length = 0, max_start = 0;

        while (j <= len) {

            if (j < len && str.charAt(j) != ' ') {
                j++;
            } 
            else {

                int curr_length = j - i;

                if (curr_length > max_length) {
                    max_length = curr_length;
                    max_start = i;
                }

                j++;
                i = j;
            }
        }

        return str.substring(max_start, max_start + max_length);
    }
}

class LargestWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sc.nextLine();

        Test t = new Test();

        String maxWord = t.checkLargest(str);

        System.out.println("Largest word is: " + maxWord);
    }
}