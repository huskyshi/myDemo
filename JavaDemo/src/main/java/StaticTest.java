public class StaticTest {
    public static void main(String[] args) {
        Emplyee[] emplyees = new Emplyee[3];
        emplyees[0] = new Emplyee("shiwei", 100000);
        emplyees[1] = new Emplyee("hanmeimei", 2000);
        emplyees[2] = new Emplyee("lilei", 20000);

        for (Emplyee e : emplyees) {
            e.setId();
            System.out.println("姓名 " + e.getName() + "; 薪水 " + e.getSalary() + "; 工号 " + e.getId());

        }
        int n = Emplyee.getNextId();
        System.out.println("下一个工号是 " + n);

    }
}

class Emplyee {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    public Emplyee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }
}
