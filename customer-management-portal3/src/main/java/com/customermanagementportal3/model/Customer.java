package com.customermanagementportal3.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@AllArgsConstructor
// @Getter
// @Setter
// @ToString
// @RequiredArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String firstName;

    @Column
    String lastName;

    @Column
    String loginId;

    @Column
    String password;

    @Column
    String street;

    @Column
    String address;
    @Column
    String city;

    @Column
    String state;

    @Column
    String email;

    @Column
    String phone;
}
