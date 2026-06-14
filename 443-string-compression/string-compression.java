class Solution {
    public int compress(char[] chars) {
        int read=0;
        int write=0;
        while(read<chars.length){
            char ch= chars[read];
            int count=0;
            while(read<chars.length && chars[read]==ch){
                read++;
                count++;
            }
            chars[write++]=ch;
            if(count>1){
                String str = Integer.toString(count);
                char [] arr= str.toCharArray();
                for(char el : arr){
                    chars[write++]=el;
                }
            }
        }
        return write;
    }
}

/*
We will be using two pointer slidding window concept,

we will create two pointer one is for reading each characters while other is for writing those character in the same array 
firstly traversing the array, so while traversing we will check if count of the curr character by comparing it with previous character till we got two different character then we will put that character in the array and for putting that count we will check if it is 1 or more if it is one then no need to put count but if it is more that 1 then we first have to convert the count into string than convert it back into character arr after that we will traverse each character and put that in the array 

and we finally return the array
 */