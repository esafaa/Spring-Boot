package com.example.SpringSecurityRegDemo.model;
import lombok.*;
import jakarta.persistence.*;
@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
public class Role {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String name;
   public Role(String name) {
       this.name = name;
   }
}


