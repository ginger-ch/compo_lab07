package se331.lab7.dao;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import se331.lab7.entity.Organizer;

import java.util.ArrayList;
import java.util.List;


@Repository
@Profile("manual")
public class OrganizerDaoImpl implements OrganizerDao {
    List<Organizer> organizerList;

    @PostConstruct
    public void init(){
        organizerList = new ArrayList<>();
        organizerList.add(Organizer.builder()
                .id(1L)
                .organizationName("Kat Laydee Foundation")
                .address("123 Meow St.")
                .build());
        organizerList.add(Organizer
                .builder().id(2L)
                .organizationName("Flora Green Society")
                .address("456 Bloom Ave.")
                .build());
        organizerList.add(Organizer
                .builder().id(3L)
                .organizationName("Ocean Care Association")
                .address("789 Coastline Rd.")
                .build());
        organizerList.add(Organizer
                .builder().id(4L)
                .organizationName("Woof Rescue Club")
                .address("101 Bark Way")
                .build());
        organizerList.add(Organizer.builder()
                .id(5L)
                .organizationName("Community Food Share")
                .address("202 Harvest Blvd.")
                .build());
    }
    @Override
    public Integer getOrganizerSize() {
        return organizerList.size();
    }

    @Override
    public List<Organizer> getOrganizer(Integer pageSize, Integer page) {
        pageSize = pageSize == null ? organizerList.size() : pageSize;
        page = page == null ? 1 : page;
        int firstIndex = (page - 1) * pageSize;
        return organizerList.subList(firstIndex, Math.min(firstIndex + pageSize, organizerList.size()));
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerList.stream()
                .filter(event -> event.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    @Override
    public Organizer save(Organizer organizer) {
        organizer.setId((long) (organizerList.size() + 1));
        organizerList.add(organizer);
        return organizer;
    }
}

