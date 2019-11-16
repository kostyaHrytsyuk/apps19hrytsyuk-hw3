package ua.edu.ucu;


class Student {

    private double gpa;
    private int year;
    private String name;
    private String surname;

    public Student(String name, String surname, double gpa, int year) {
        this.gpa = gpa;
        this.year = year;
        this.name = name;
        this.surname = surname;
    }

    public double getGPA() {
        return gpa;
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
        return "Student{name=" + name + ", surname=" + surname + ", " + "GPA=" + gpa + ", year=" + year + '}';
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode() + (int) this.gpa + this.year;
    }

    @Override
    public boolean equals(Object obj) {
        double eps = 0.00001;
        if (this == obj) { 
            return true;
        } else if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) { 
            return false; 
        }
        Student s = (Student) obj;
        if (!this.name.equals(s.getName())) { 
            return false;
        }
        else if (!this.surname.equals(s.getSurname())) { 
            return false;
        }
        else if (this.year != s.getYear()) { 
            return false;
        }
        else {
            return (this.gpa - s.getGPA() <= eps); 
        }
    }
}
