package nanowrimo.com.nanowrimo.Service;

import java.util.ArrayList;
import java.util.List;

import nanowrimo.com.nanowrimo.DTO.BooksDTO;
import nanowrimo.com.nanowrimo.Repository.NaNoWriMoRepository;

public interface NaNoWriMoService {

     NaNoWriMoRepository naNoWriMoRepository;

     public List<BooksDTO> booksDTOs = new ArrayList<BooksDTO>();
NaNoWriMoRepository.findAll().forEach(booksDTOs -> booksDTOs.add(booksDTOs));
}


}