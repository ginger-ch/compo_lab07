package se331.lab7.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    String category;
    String title;
    String description;
    String location;
    String date;
    String time;
    boolean petsAllowed;

    @ManyToOne
    Organizer organizer;

    @ManyToMany(mappedBy = "eventHistories")
    List<Participant> participants;
}

