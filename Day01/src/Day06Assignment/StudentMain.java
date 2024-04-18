package Day06Assignment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable {
	private String name;
	private int studentId;

	public Student(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public int getStudentId() {
		return studentId;
	}
}

public class StudentMain {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Alok", 1));
		students.add(new Student("Naveen", 2));
		students.add(new Student("Deepak", 3));

		serializeStudents(students, "students.ser");

		List<Student> deserializedStudents = deserializeStudents("students.ser");

		System.out.println("Deserialized students:");
		for (Student student : deserializedStudents) {
			System.out.println("Name: " + student.getName() + ", Student ID: " + student.getStudentId());
		}
	}

	private static void serializeStudents(List<Student> students, String fileName) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			oos.writeObject(students);
			System.out.println("Serialization successful.");
		} catch (IOException e) {
			System.err.println("Serialization failed: " + e.getMessage());
		}
	}

	private static List<Student> deserializeStudents(String fileName) {
		List<Student> students = new ArrayList<>();
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			students = (List<Student>) ois.readObject();
			System.out.println("Deserialization successful.");
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Deserialization failed: " + e.getMessage());
		}
		return students;
	}
}
