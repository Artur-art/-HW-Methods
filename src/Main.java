public class Main {


    public static void countYear() {
        System.out.println("Задача №1");
        int year = 1996;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("год високосный");
        } else {
            System.out.println("год не високосный");
        }
    }


    public static void chanceClientOs(int ClientOS, int clientDeviceYear){
        System.out.println("Задача №2");
        if (ClientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("установите облегченную версию приложения для ios по сылке");
            } else {
                System.out.println("установите версию приложения для ios по сылке");
            }
        }else{
            if (clientDeviceYear < 2015){
                System.out.println("установите облегченную версию приложения для android по сылке");
            } else {
                System.out.println("установите версию приложения для android по сылке");
            }

            }
        }
        public static void deliveryDays(int distance){
        if(distance <= 20){
            System.out.println("Доставка займет 1 день");
        } else if (distance >= 20 && distance <= 60){
            System.out.println("Доставка займет 2 дня");
        } else if (distance >= 60 && distance <= 100){
            System.out.println("Доставка займет 3 дня");
        }
        }





    public static void main(String[] args) {
        countYear();
        chanceClientOs(0,2007);
        deliveryDays(95);



    }



}