public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }

    //Task1
    public static void Task1() {
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    //Task2
    public static void Task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameResult = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameResult);
    }

    //Task3
    public static void Task3() {
        String fullName = "Иванов Семён Семёнович ";
        String fullNameResult = fullName.replace('ё', 'е');
        System.out.println(fullNameResult);
    }
}