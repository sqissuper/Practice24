import java.util.HashMap;

public class TextDemo2 {
    //计算糖果
//    public static String getNum(int[] arr) {
//        StringBuilder sb = new StringBuilder();
//        int A = (arr[0] + arr[2]) / 2;
//        int B = A - arr[0];
//        int C = arr[3] - B;
//        if(A - B == arr[0] && B - C == arr[1] && A + B == arr[2] && B + C == arr[3]) {
//            return sb.append(A).append(" ").append(B).append(" ").append(C).toString();
//        }
//        return "No";
//    }

    //进制转换
//    public static String getBaseCon(int M,int N){
//        String sum = "";
//        StringBuilder sb = new StringBuilder();
//        boolean f = true;

    //考虑负数
//        if(M < 0) {
//            f = false;
//            M = -M;
//        }
//        while(M > 0) {
//            int ret = M % N;
//            char tmp;
//            if(ret > 9) {
//                tmp = (char)('A' + ret - 10);
//            } else {
//                tmp = (char)('0' + ret);
//            }
//            sb.append(tmp);
//            M /= N;
//        }
//        sum = sb.reverse().toString();
//        return f ? sum : "-" + sum;
//    }

    //字符串转整数
//    public static int StrToInt(String str) {
////        StringBuilder num = new StringBuilder();
////        int pr = 0;
////        boolean f = true;
////        while (str.charAt(pr) == ' ') {
////            pr++;
////        }
////        if (str.charAt(pr) >= 48 && str.charAt(pr) <= 57) {
////            num.append(str.charAt(pr));
////        } else if (str.charAt(pr) == '+') {
//////            pr++;
////        } else if (str.charAt(pr) == '-') {
//////            pr++;
////            f=false;
////        } else {
////            return 0;
////        }
////        for (int i = pr + 1; i < str.length(); i++) {
////            if ((str.charAt(i) >= 48 && str.charAt(i) <= 57)) {
////                num.append(str.charAt(i));
////            } else {
////                return 0;
////            }
////        }
////        int retInt = 0;
////        for (int i = 0; i < num.length(); i++) {
////            retInt =retInt*10+num.charAt(i)-48 ;
////        }
////        return f?retInt:-retInt;
////        str = str.trim();
////        int index = 0;
////        int f = 1;
////        int result = 0;
////        if(str.length() == index) return 0;
////        if(str.charAt(0) == '-') {
////            f = -1;
////            index++;
////        }
////        if(str.charAt(0) == '+') index++;
////        while(index < str.length()) {
////            if(str.charAt(index) < '0' || str.charAt(index) > '9') return 0;
////            result = result * 10 + str.charAt(index) - '0';
////            index++;
////        }
////        return f == -1 ? f * result : result;
//    }

    //罗马数字转整数
//    public static int romanToInt(String s) {
//        HashMap<Character,Integer> map = new HashMap<>();
//        map.put('I',1);
//        map.put('V',5);
//        map.put('X',10);
//        map.put('L',50);
//        map.put('C',100);
//        map.put('D',500);
//        map.put('M',1000);
//        int result = 0;
//        int ret = map.get(s.charAt(0));
//        for(int i = 1; i < s.length(); i++) {
//            int tmp = map.get(s.charAt(i));
//            if(ret < tmp) {
//                result -= ret;
//            } else {
//                result += ret;
//            }
//            ret = tmp;
//        }
//        result += ret;
//        return result;
//    }
    public static void main(String[] args) {

//        String s = "MCMXCIV";
//        System.out.println(romanToInt(s));
//        char c = 'A';
//        if(c && )
//        HashMap<Character,Integer> map = new HashMap<>();
//        map.put('c',1);
//        String a = "+-33";
//        System.out.println(StrToInt(a));

//        int m = 7,n = 3;
//        System.out.println(getBaseCon(m, n));
//        String sum = "";
//        StringBuilder sb = new StringBuilder();
//        sb.reverse()
    }
}
