package be.trakk.candyshop.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Embeddable;

@Embeddable
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {

    String street;

    String number;

    String zip;

    String city;

    String country;
}
