public class ElsoProject {

    public static void main(String[] args) {
        Human first = new Human();
        first.setName("Gyula");
        first.setAge(18);
        System.out.println(first.getName() == null ? "üres" : "Nem üres, az értéke " + first.getName());


    /*if (first.getName() == null) {
        System.out.println("Nincs név");
    } else {
        System.out.println("Van név: " + first.getName());
    }*/
    }
}
