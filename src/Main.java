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
        //task 3
        short speed = 80;//входные данные
        boolean violation = (speed > 60);
        if (violation) {
            System.out.println("Если скорость " + speed+ " км/ч, то придется заплатить штраф");
        }
        speed = 60;//входные данные
        violation = speed > 60;//приходится писать во второй раз для нового значения переменной speed
        if (!violation) {
            System.out.println("Если скорость " + speed+ " км/ч, то можно ездить спокойно");
        }
    }
}