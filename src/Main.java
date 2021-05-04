public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        //проверка баланса
        System.out.println(warehouse + " " + picker + " " + courier);

        //проверка баланка после первого действия
        picker.doWork();
        courier.doWork();
        System.out.println(warehouse + " " + picker + " " + courier);

        //проверка после 1500 действий
        for (int i = 1; i <= 1500; i++) {
            picker.doWork();
            courier.doWork();
        }
        picker.bonus();
        courier.bonus();
        System.out.println(warehouse + " " + picker + " " + courier);

    }
}
