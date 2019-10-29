package org.treetech.exemple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.treetech.exemple.dao.StudentRepository;
import org.treetech.exemple.entities.Departement;
import org.treetech.exemple.entities.Student;

@SpringBootApplication
public class ExempleApplication {

	public static void main(String[] args) {
		//ConfigurableApplicationContext ctx=
				SpringApplication.run(ExempleApplication.class, args);

		/*StudentRepository sdao = ctx.getBean(StudentRepository.class);

		sdao.save(new Student("Khireddine Tarek", new Departement("Informatique", 300), 2));
		sdao.save(new Student("Khireddine Djale", new Departement("Science Commercial", 600), 2));
		sdao.save(new Student("Torchi Ahmed", new Departement("Automatique", 100), 2));
		sdao.save(new Student("Makhlouf Mehdi", new Departement("Infographie", 50), 2));
		sdao.save(new Student("Makhlouf Walid", new Departement("Science Marine", 300), 2));
		sdao.save(new Student("Bouraoui SaifAllah", new Departement("Informatique", 300), 2));
		
		sdao.findAll().forEach(student->{
			System.out.println(student.getName());
			System.out.println(student.getDepartement());
		});*/
	}

}
