package com.akp.java8.stream.operation.reduce;

import java.util.Arrays;
import java.util.List;

import com.akp.java8.common.Gender;
import com.akp.java8.common.Person;

public class ReduceTest {
	public static List<Person> createPeople() {
		return Arrays.asList(new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 12));
	}

	public static void main(final String[] args) {
		final List<Person> people = createPeople();

		// total age of everyone
		final int total = people.stream().map(Person::getAge).reduce(0, (accumuated, age) -> accumuated + age);

		System.out.println(total);

		// or
		System.out.println(people.stream().map(Person::getAge).reduce(0, Integer::sum));
	}
}