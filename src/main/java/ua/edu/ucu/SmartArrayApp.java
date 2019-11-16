package ua.edu.ucu;

import java.util.Arrays;

import ua.edu.ucu.functions.MyComparator;
import ua.edu.ucu.functions.MyFunction;
import ua.edu.ucu.functions.MyPredicate;
import ua.edu.ucu.smartarr.BaseArray;
import ua.edu.ucu.smartarr.SmartArray;
import ua.edu.ucu.smartarr.FilterDecorator;
import ua.edu.ucu.smartarr.SortDecorator;
import ua.edu.ucu.smartarr.MapDecorator;
import ua.edu.ucu.smartarr.DistinctDecorator;

public class SmartArrayApp {

    public SmartArrayApp() {}

    public static Integer[]
            filterPositiveIntegersSortAndMultiplyBy2(Integer[] integers) {
                
        MyPredicate pr = t -> ((Integer) t) > 0;

        MyComparator cmp = (firstObject, secondObject) -> ((Integer) firstObject) - ((Integer) secondObject);

        MyFunction func = t -> 2 * ((Integer) t);

        // Input: [-1, 2, 0, 1, -5, 3]
        SmartArray sa = new BaseArray(integers);

        sa = new FilterDecorator(sa, pr); // Result: [2, 1, 3];
        sa = new SortDecorator(sa, cmp); // Result: [1, 2, 3]
        sa = new MapDecorator(sa, func); // Result: [2, 4, 6]

        // Alternative
//        sa = new MapDecorator(
//                    new SortDecorator(
//                        new FilterDecorator(sa, pr),
//                    cmp),
//                func);
        Object[] result = sa.toArray();
        return Arrays.copyOf(result, result.length, Integer[].class);
    }

    public static String[]
            findDistinctStudentNamesFrom2ndYearWithGPAgt4AndOrderedBySurname(Student[] students) {

        int year = 2;
        double gpa = 4;
        SmartArray smartStudents = new BaseArray(students);

        MyPredicate pr = t -> {
            Student s = (Student) t;
            return s.getYear() == year && s.getGPA() >= gpa;
        };

        MyComparator cmp = (firstObject, secondObject) -> ((Student) firstObject).getSurname().compareTo(((Student) secondObject).getSurname());

        MyFunction func = t -> {
            Student s = (Student) t;
            return s.getSurname() + ' ' + s.getName();
        };

        smartStudents = new MapDecorator(
                                new DistinctDecorator(
                                        new SortDecorator(
                                                new FilterDecorator(smartStudents, pr),
                                        cmp)),
                                func);



        return Arrays.copyOf(smartStudents.toArray(), smartStudents.size(), String[].class);
    }
}
