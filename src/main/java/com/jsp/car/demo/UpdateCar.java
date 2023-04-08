package com.jsp.car.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateCar {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Car car = entityManager.find(Car.class, 5);
		car.setBrand("A1");
		car.setName("AUDI");

		entityTransaction.begin();
		entityManager.merge(car);
		System.out.println("Record Updated");
		entityTransaction.commit();

	}

}
