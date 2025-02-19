package Exercise4;

class Teacher extends Person {

    private String department;

    public Teacher(String id, String homeTown, String dateOfBirth, String department) {
        super(id, homeTown, dateOfBirth);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
