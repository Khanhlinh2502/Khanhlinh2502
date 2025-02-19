
package Exercise4;
    class Student extends Person {
    private String major;

    public Student(String id, String homeTown, String dateOfBirth, String major) {
        super(id, homeTown, dateOfBirth);
        this.major = major;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
    }
}
