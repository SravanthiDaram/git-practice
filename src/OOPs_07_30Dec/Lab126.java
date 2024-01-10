package OOPs_07_30Dec;

public class Lab126 {
    public static void main(String[] args) {
        // print a name in reverse

        String name = "Sravanthi";
        char[] charArray = name.toCharArray();
        System.out.println(charArray.length);

        int left = 0;
        int right = charArray.length -1;

        while(left < right){

            char temp = charArray[left];
            charArray[left]= charArray[right];
            charArray[right] = temp;

            left++;
            right--;

        }
        String rev_num = new String(charArray);
        System.out.println(rev_num);

    }
}
