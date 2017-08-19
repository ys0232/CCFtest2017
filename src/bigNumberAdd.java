/**
 * Created by lenovo on 2017/8/19.
 */
public class bigNumberAdd {
    static String add(String t,String s){
        String result="";
        String str="";
        int m = 0;
        if (t.length()<s.length()){
            String TEM=t;
            t=s;
            s=TEM;
        }
        int len = t.length();
        //System.out.println(s+" "+t);
        for (int i = len - 1; i >=0; i--) {
            int x = t.charAt(i) - '0';
            int y=0 ;
            if (i>len-s.length()-1)
                y =s.charAt(i-len+s.length()) - '0';
            int temp = x + y + m;
            str += temp % 10;
            m = temp / 10;
           // System.out.println(str+" "+temp+" "+t+" "+x+" "+s+" "+y);
        }
        while (m > 0) {
            str += m % 10;
            m = m / 10;
        }
        for (int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
      //  result = str;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args){
        long t=19892;
        long s=990080;
        System.out.println((s+t)+" "+add(String.valueOf(t),String.valueOf(s)));

    }
}
