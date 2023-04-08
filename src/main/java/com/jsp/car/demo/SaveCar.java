package com.jsp.car.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCar {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Car car = new Car();
		car.setName("X7");
		car.setBrand("BMW");

		entityTransaction.begin();
		entityManager.persist(car);
		System.out.println("Record Inserted");
		entityTransaction.commit();

	}
}
