package ua.edu.ucu;


class Student {

    private double GPA;
    private int year;
    private String name;
    private String surname;

    public Student(String name, String surname, double GPA, int year) {
        this.GPA = GPA;
        this.year = year;
        this.name = name;
        this.surname = surname;
    }

    public double getGPA() {
        return GPA;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{name=" + name + ", surname=" + surname + ", " + "GPA=" + GPA + ", year=" + year + '}';
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode() + (int)this.GPA + this.year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        else if (obj == null) return false;
        else if (getClass() != obj.getClass()) return false;
        Student s = (Student) obj;
        if (!this.name.equals(s.getName())) return false;
        else if (!this.surname.equals(s.getSurname())) return false;
        else if (this.year != s.getYear()) return false;
        else return ((this.GPA - s.getGPA()) <= 0.00001);
    }
}
