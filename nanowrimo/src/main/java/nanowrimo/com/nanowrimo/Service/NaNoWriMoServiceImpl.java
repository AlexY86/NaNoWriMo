// package nanowrimo.com.nanowrimo.Service;

// import java.util.List;

// import nanowrimo.com.nanowrimo.DTO.BooksDTO;
// import nanowrimo.com.nanowrimo.Model.Books;
// import nanowrimo.com.nanowrimo.Repository.NaNoWriMoRepository;

// public class NaNoWriMoServiceImpl implements NaNoWriMoService {

//     private final NaNoWriMoRepository naNoWriMoRepository;

//     public NaNoWriMoServiceImpl(NaNoWriMoRepository naNoWriMoRepository) {
//         super();
//         this.naNoWriMoRepository = naNoWriMoRepository;
//     }

//     @Override
//     public List<BooksDTO> getAllBooks() {
//         return naNoWriMoRepository.findAll();
//     }
    
//     @Override
//     public Post createNew(Books books) {
//         return naNoWriMoRepository.save(books);
//     }

// }
