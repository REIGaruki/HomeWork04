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
        //task 2
        byte temperature = 4;//входные данные
        boolean warmWeather = (temperature >= 5);
        if (warmWeather) {
            System.out.println("Сегодня на улице " + temperature + " °C, можно идти без шапки");
        } else {
            System.out.println("Сегодня на улице " + temperature + " °C, нужно надеть шапку");
        }

    }
}