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
        age = 18;//входные данные
        if ((age >= 0) && (age < 60)) {
            if ((age >= 2) && (age < 7)) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
            }
            if ((age >= 7) && (age < 18)) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
            }
            if ((age >= 18) && (age <= 24)) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
            }
            if (age > 24) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
            }
            if (age < 2) {
                System.out.println("Если возраст человека равен " + age + " то он не умеет ходить");
            }
        } else {
            System.out.println("Если возраст человека равен " + age + " то ему пора на пенсию");
        }
        //task 5
        age = 9;//входные данные
        if ((age >= 0) && (age < 21)) {
            if (age < 5) {
                System.out.println("Если возраст ребенка равен " + age + " то он не может кататься на аттракционе");
            }
            if ((age >= 5) && (age <= 14)) {
                System.out.println("Если возраст ребенка равен " + age + " то он может кататься только в сопровождении взрослого");
            } else if (age > 14) {
                System.out.println("Если возраст ребенка равен " + age + " то он может кататься без сопровождения взрослого");
            }
        } else {
            System.out.println("Вы уже взрослый");
        }
        //task 6
        int passengers = 49;//входные данные
        int carriageCapacity = 102;
        int carriageSeats = 60;
        if (passengers < carriageCapacity){
            if (passengers >= carriageSeats){
                System.out.println("В вагоне есть свободные места: " + (carriageCapacity - passengers) + " стоячих");
            }
            if (passengers < carriageSeats) {
                System.out.println("В вагоне есть свободные места: " + (carriageSeats - passengers) + " сидячих и "
                        + (carriageCapacity - carriageSeats) + " стоячих");
            }
        } else {
            System.out.println("В вагоне свободных мест нет");
        }
        //task 7
        int one = 28_937_198;//входные данные
        int two = 119_239_857;//входные данные
        int three = 92_837_297;//входные данные
        if ((one > two) && (one > three)) {
            System.out.println("One is the biggest");
        } else if ((one < two) && (two > three)) {
            System.out.println("Two is the biggest");
        } else {
            System.out.println("Three is the biggest");
        }
    }
}