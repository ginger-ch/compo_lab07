package se331.lab7.entity;
import jakarta.persistence.ManyToMany;
import lombok.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Participant {
    Long id;
    String name;
    String telNo;

    @ManyToMany(mappedBy = "participants")
    List<Event> eventHistories;
}

