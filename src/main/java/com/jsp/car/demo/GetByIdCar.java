package com.jsp.car.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetByIdCar {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Car car = entityManager.find(Car.class, 5);
		System.out.println("Car ID    : " + car.getId());
		System.out.println("Car Name  : " + car.getName());
		System.out.println("Car Brand : " + car.getBrand());

	}
}
