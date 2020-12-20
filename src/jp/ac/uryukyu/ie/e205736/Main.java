package jp.ac.uryukyu.ie.e205736;

public class Main {
    public static void main(String[] args){
        String str = null;
        try{System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("エラー　NullPointException");
            System.out.println(e.getMessage());
        }

    }
}
