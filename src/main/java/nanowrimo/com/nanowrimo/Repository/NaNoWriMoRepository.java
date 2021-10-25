package nanowrimo.com.nanowrimo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nanowrimo.com.nanowrimo.DTO.BooksDTO;


@Repository
public interface NaNoWriMoRepository extends JpaRepository<BooksDTO, Long>{
    
}
