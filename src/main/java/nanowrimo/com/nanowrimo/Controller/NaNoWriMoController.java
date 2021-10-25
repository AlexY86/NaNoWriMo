package nanowrimo.com.nanowrimo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nanowrimo.com.nanowrimo.DTO.BooksDTO;
// import nanowrimo.com.nanowrimo.Model.NaNoWriMo;
import nanowrimo.com.nanowrimo.Repository.NaNoWriMoRepository;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(value = "/api")
public class NaNoWriMoController {
 
    @Autowired
    private NaNoWriMoRepository nanowrimoRepository;

    @GetMapping("/allBooks")
    public List<BooksDTO> getAllBooks() {
        return nanowrimoRepository.findAll();
    }

    @PostMapping("/createNew")
    public BooksDTO createNew(@RequestBody BooksDTO createNew) {
        return nanowrimoRepository.save(createNew);
    }

    @PostMapping("/createNewChapter")
    public BooksDTO createNewChapter(@RequestBody BooksDTO createNewChapter){
        return nanowrimoRepository.save(createNewChapter);
    }

    @PutMapping(value="updateWordCount/{id}")
    public BooksDTO putWordCount(@PathVariable Long id, @RequestBody BooksDTO updateWordCount) {
        return nanowrimoRepository.save(updateWordCount);
    }



    // @GetMapping("/allChapters")


    // @GetMapping("/wordCount")


    // @PutMapping("/editTitle")

    // @PutMapping("/editChapterTitle")

    // @PutMapping("/editWordCount")
}
