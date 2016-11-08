package hrmanagement;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test

{
	static void SortStudent(List<Student> studentsList)
	{
		Collections.sort(studentsList);
		for (Student student : studentsList)
		{
			System.out.println(student.toString());
		}

	}

	static void SortWorker(List<Worker> workersList)
	{
		Collections.sort(workersList);
		for (Worker worker : workersList)
		{
			System.out.println(worker.toString());
		}

	}

	public static void main(String[] args)
	{

		List<Worker> workers = new LinkedList<Worker>();

		workers.add(new Worker("Pham", "Ngoc", 1000, 8));
		workers.add(new Worker("Le", "Nguyen", 5000, 8));
		workers.add(new Worker("Tran", "Nhat", 4000, 8));
		workers.add(new Worker("Truc", "Dao", 6000, 8));
		workers.add(new Worker("Nguyen", "Hanh", 7000, 8));
		workers.add(new Worker("Tuyet", "Khanh", 3000, 8));
		workers.add(new Worker("My", "Linh", 2000, 8));
		workers.add(new Worker("Hien", "Trang", 8000, 8));
		workers.add(new Worker("Huong", "Giang", 7500, 8));
		workers.add(new Worker("Phuong", "Hao", 10000, 8));

		SortWorker(workers);

		List<Student> students = new LinkedList<Student>();

		students.add(new Student("Tran", "Van", 8));
		students.add(new Student("Nguyen", "Thi", 2));
		students.add(new Student("Pham", "Nguyen", 9));
		students.add(new Student("Ngoc", "Nhu", 3));
		students.add(new Student("Vu", "Pham", 1));
		students.add(new Student("Thai", "Nhan", 7));
		students.add(new Student("Ly", "Le", 5));
		students.add(new Student("Trinh", "Nguyen", 10));
		students.add(new Student("Unknow", "Not", 4));

		SortStudent(students);

	}
}
