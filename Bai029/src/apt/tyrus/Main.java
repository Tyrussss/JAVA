package apt.tyrus;

public class Main {

    public static void main(String[] args) {
        Integer n = 1357;

        int donVi = n % 10;
        if (donVi % 2 == 0) {
            System.out.println("Khong hop le");
        } else {
            //khong dung dau chia

            Integer hangChuc = ((n - donVi) / 10) % 10;
            if (hangChuc % 2 == 0) {
                System.out.println("Khong hop le");
            } else {
                Integer hangTram = ((n -hangChuc * 10 - donVi) / 100) % 10;
                if (hangTram % 2 == 0) {
                    System.out.println("Khong hop le");
                } else {
                    Integer hangNgan = ((n -hangTram*100 -hangChuc * 10 - donVi) / 100) % 10;
                    if (hangTram % 2 == 0) {
                        System.out.println("Khong hop le");
                    } else {
                        System.out.println("Hop le");
                    }
                }
            }
        }
    }
}