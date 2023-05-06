// Question 3(A): Define a suitable comparable Person Object

public class Person implements Comparable<Person> {
    // Declaring variables
    String name;
    String occupation;
    String job;
    String maritalStatus;
    String sex;
    String address;
    int age;

    // Constructor for creating instance of Person class
    public Person(String name, String occupation, String job, String maritalStatus, String sex, String address, int age) {
        this.name = name;
        this.occupation = occupation;
        this.job = job;
        this.maritalStatus = maritalStatus;
        this.sex = sex;
        this.address = address;
        this.age = age;
    }

    // Setter and Getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // To print-out Person object as String format
    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", job='" + job + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    // Below Override method enables comparison of person objects based on the age
    @Override
    public int compareTo(Person person) {
        if (age == person.age) {
            return 0;
        } else if (age > person.age) {
            return 1;
        } else return -1;
    }
}

