public class Main {
    public static void main(String[] args) {
        //task 1
        byte age = 34;//входные данные
        boolean adulthood = (age >= 18);
        if (adulthood) {
            System.out.println("Возоаст человека равен " + age + ", он совершеннолетний");
        } else {
            System.out.println("Возоаст человека равен " + age +
                    ", он не достиг совершеннолетия, нужно немного подождать");
        }
    }
}