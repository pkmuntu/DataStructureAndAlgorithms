package com.muntu.stack;
class Main {
	 

    static boolean ispalindrome(String s) {
        int l = s.length();
 
        for (int i = 0, j = l - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
 

    public static void main(String[] args) {
        String str = "BABABAA";
        String s=str;
        Stack stack=new Stack(50);
        while (s.length() > 0) {
            // if string becomes palindrome then break
            if (ispalindrome(s)) {
                break;
            } else {
                stack.push(s.charAt(s.length()-1));
                s = s.substring(0, s.length() - 1);
            }
        }
           
           
           while(!stack.isEmpty()){
               str=stack.pop()+str;
           }
        System.out.println(str);
    }
}
class Stack{
    int top=-1;
    int max;
    char [] stk;
    
    public Stack(int max){
        this.max=max;
        stk=new char[max];
    }
    public void push(char c){
        stk[++top]=c;
    }
    public char pop(){
        return stk[top--];
    }
    public boolean isEmpty(){
        if(top==-1)
        return true;
        else 
        return false;
    }
}