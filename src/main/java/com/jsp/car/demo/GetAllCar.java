package com.jsp.car.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllCar {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "select c from Car c";

		Query query = entityManager.createQuery(sql);
		List<Car> cars = query.getResultList();

		for (Car car : cars) {
			System.out.println("==============================================");
			System.out.println("Car ID    : " + car.getId());
			System.out.println("Car Name  : " + car.getName());
			System.out.println("Car Brand : " + car.getBrand());
		}
	}
}
