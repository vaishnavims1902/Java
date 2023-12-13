package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class StudentService {
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Student findStudent(String studentId) {
        if (students.containsKey(studentId)) {
            return students.get(studentId);
        }
        return null;
    }

    public boolean isSubscribed(String studentId) {
        // TODO implement this method
        // return false;
        return students.containsKey(studentId);
    }

    public void showSummary() {
        // TODO implement
        System.out.println("Student Summary:");

        for (Student student : students.values()) {
            System.out.println("Student ID: " + student.getId());
            System.out.println("Student Name: " + student.getName());
            // System.out.println("Enrolled Courses: " + student.getEnrolledCourses());
            System.out.println("Approved Courses: " + student.getApprovedCourses());
            System.out.println("----------------------------------------");
        }
    }

    public void enrollToCourse(String studentId, Course course) {
        if (students.containsKey(studentId)) {
            students.get(studentId).enrollToCourse(course);
        }
    }

    private StudentService studentService;

    @Before
    public void setUp() {
        studentService = new StudentService();
    }

    @Test
    public void testSubscribeStudent() {
        Student student = new Student("1", "John Doe", "john@example.com", null);
        studentService.subscribeStudent(student);
        assertNotNull(studentService.findStudent("1"));
    }

    @Test
    public void testIsSubscribed() {
        Student student = new Student("1", "John Doe", "john@example.com", null);
        studentService.subscribeStudent(student);

        assertTrue(studentService.isSubscribed("1"));
        assertFalse(studentService.isSubscribed("2"));
    }

    @Test
    public void testShowSummary() {
        Student student1 = new Student("1", "John Doe", "john@example.com", null);
        Student student2 = new Student("2", "Jane Doe", "jane@example.com", null);

        studentService.subscribeStudent(student1);
        studentService.subscribeStudent(student2);

    }
}
