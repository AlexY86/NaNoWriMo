package nanowrimo.com.nanowrimo.Service;



public class NaNoWriMoService {

    @Autowired
    NaNoWriMoRepository nanowrimoRepository;

    public List<BooksDTO> getAllBooks()
}

List<BooksDTO> books = new ArrayList<BooksDTO>();
nanowrimoRepository.findAll().forEach(books -> books.add(books));
return books;

}