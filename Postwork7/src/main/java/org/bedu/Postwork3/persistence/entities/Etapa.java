package org.bedu.Postwork3.persistence.entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Table(name = "CLIENTES")
@Entity
@NoArgsConstructor
public class Etapa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long etapaId;

    private String nombre;

    @Column(unique = true, nullable = false)
    private Integer orden;
}
