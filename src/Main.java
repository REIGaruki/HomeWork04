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
        //task 4
        age = 1;//входные данные
        if ((age >= 2) && (age < 7)) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else {
            if ((age >= 7) && (age < 18)) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
            } else {
                if ((age >= 18) && (age <= 24)) {
                    System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
                } else {
                    if (age > 24) {
                        System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
                    } else {
                        System.out.println("Если возраст человека равен " + age + " то он еще не умеет ходить");
                    }
                }
            }
        }
    }
}