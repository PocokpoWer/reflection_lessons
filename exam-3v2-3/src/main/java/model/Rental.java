package model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Table(name = "rental")
@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "customer_name")
    private String customerName;
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
}
