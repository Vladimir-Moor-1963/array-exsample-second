public class MethodExsample {
    public static void main(String[] args) {
        String[] names = {"Пётр", "Иван", "Ганс"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int number = i + 1;
            print(name, number);

        }

    }

    public static void print(String name, int number){
        System.out.println("И так мы выводим человека под номером " + number);
        System.out.println(name);
        System.out.println("Вот мы вывели нового человека");
        System.out.println("Удивительно");
        System.out.println("------------");




    }

}
