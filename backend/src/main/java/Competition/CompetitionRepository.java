package Competition;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition, Long> {


    @Query(value="SELECT * FROM competition ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Competition getRandomCompetition();

    void deleteCompetitionById(long id);
}

