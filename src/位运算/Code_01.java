package 位运算;


public class Code_01 {
    public static void main(String[] args) {
        int num = 3;
        print(2);
        //print(num << 2);
        System.out.println(1 << 31);
    }

    /**
     * 打印int整数的32位二进制数
     * 00000000000000000000000000000011 = 3
     * 00000000000000000000000000000010 = 2 = 1 << 1
     * 00000000000000000000000000000010 = 3 & 2 = 2 不等于0说明第2位不是0而是1
     * 1 << i 只是为了得到一个指定i位置为1其他位置都是0的二进制数字，这样&之后不为0说明i位置不是0
     * 如此循环32次和 1 << i做 & 运算，只要结果不是0的二进制，就说明当前位数是1
     */
    public static void print(int num){
        for(int i = 31; i >= 0; i--){
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }
}
