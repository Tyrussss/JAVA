package apt.tyrus;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*System.out.println("Hello Tyrus !!!");

        //tinh dien tich HCN
        Integer chieuRong = 4;
        Integer chieuDai = 5;

        Integer dienTich = chieuDai * chieuRong;
        System.out.println("Dien tich = " +dienTich);

        Integer diem = 8;

        if (diem>=4) {
            System.out.println("Đậu");
            System.out.println("Chúc mừng");
        }
        else
            System.out.println("Rớt");

        Integer diemTH = 8;
        Integer diemLT = 3;

        if ((diemTH+diemLT)/2 >=4) {
            System.out.println("Đậu");
            System.out.println("Chúc mừng");
        }
        else
            System.out.println("Rớt");*/
        /*Integer diemTH = 1;
        Integer diemLT = 7;
        if(diemLT>=4 && diemTH >=4){
            System.out.println("Đậu");
            System.out.println("Chúc mừng");
        }
        else {
            System.out.println("Rớt");
            System.out.println("Đi chùa");
        }*/
        /*for(Integer i = 1;i <= 10; i = i + 1) {

            System.out.println("Hello Java !!!");
        }*/
        /*for(Integer i = 1;i <= 101; i = i + 1) {
            if(i % 5 ==0)
            System.out.println(i);
        }*/

        //dung ngay lap tuc sau khi so sanh dk dau tien
        /*for(Integer i = 1;i <= 101; i = i + 1) {
            if(i % 5 ==0)
                System.out.println(i);
            break;
        }

        //in ra so 5 xong dung
        for(Integer i = 1;i <= 101; i = i + 1) {
            if(i % 5 ==0) {
                System.out.println(i);
                break;
            }
        }*/

        /*for(Integer i = 1;i <= 1001; i = i + 1) {
            if(i % 5 ==0) {
                System.out.println(i);

                Integer count = 0;
                count = count +1;
                if(count == 100)
                break;
            }
        }*/

        /*for(Integer i = 1;i <= 1001; i = i + 1) {
            if(i % 5 ==0) {
                if (i % 10 !=0)
                System.out.println(i);
            }
        }*/

        /*for(Integer i = 1;i <= 1001; i = i + 1) {
            if(i % 5 ==0) {
                if (i % 10 ==0)
                    //continue bo qua lan lap hien tai va thuc hien lan lap ke tiep
                    continue;
                    System.out.println(i);
            }
        }*/
        Integer m = 10;
        Integer n = 3;

        for(int k = 1; k <= n; k = k + 1) {
            for (int i = 1; i <= m; i = i + 1) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
