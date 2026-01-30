package com.example.Trip.Ease.Repository;

import com.example.Trip.Ease.Enum.Gender;
import com.example.Trip.Ease.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

  public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    List<Customer> findByGender(Gender gender);


    //List<Customer> findByAllGenderAndAge(Gender gender, int age);

 /*   @Query("select c from Customer c where c.gender=: gender and c.age=: age")    // HQL Hibernate query language
    List<Customer> findByGenderAndAgeGreaterThan(@Param("Gender") Gender gender,
                                                 @Param("age") int age);
}*/
@Query(value="select * from customer where gender=: gender and age=: age",
        nativeQuery = true)    // HQL Hibernate query language
List<Customer> findByGenderAndAgeGreaterThan(@Param("Gender") String gender,
                                             @Param("age") int age);
}