package com.kyncu.msbeerssm.domain;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Payment {

    @Id
    @GeneratedValue
    private Long id;

    @MapKeyEnumerated(EnumType.STRING)
    private PaymentState state;

    private BigDecimal amount;

}
