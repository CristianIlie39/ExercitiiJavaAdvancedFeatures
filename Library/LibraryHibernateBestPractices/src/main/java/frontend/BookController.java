package frontend;

import business.dto.BookDTO;
import business.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping(path = "/insertBook")
    public String insertBook(@RequestBody BookDTO bookToInsert) {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setTitle(bookToInsert.getTitle());
        bookDTO.setNumberOfVolumes(bookToInsert.getNumberOfVolumes());
        bookDTO.setBorrowed(bookToInsert.isBorrowed());
        bookDTO.setSectionDTO(bookToInsert.getSectionDTO());
        bookDTO.setAuthorDTOSet(bookToInsert.getAuthorDTOSet());
        bookService.insert(bookDTO);
        System.out.println("A fost inserata cartea cu numele: " + bookToInsert.getTitle());
        return "A fost inserata cartea cu numele: " + bookToInsert.getTitle();
    }

    @DeleteMapping(path = "/deleteBook")
    public String deleteBookByTitle(@RequestParam String title) {
        Integer numberOfBooksDeleted = bookService.deleteBookByTitle(title);
        if (numberOfBooksDeleted > 0) {
            return "Cartea a fost stearsa cu succes";
        } else {
            return "Cartea nu a fost stearsa cu succes";
        }
    }

    @GetMapping(path = "/findBookByTitle")
    public ResponseEntity<List<BookDTO>> findBookByTitle(@RequestParam String title) {
        List<BookDTO> bookDTOListByTitle = bookService.findByTitle(title);
        System.out.println(bookDTOListByTitle.size());
        if (bookDTOListByTitle.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(bookDTOListByTitle);
        }
    }

    @PutMapping(path = "/updateBook")
    public String updateBookByTitle(@RequestParam String title, @RequestParam boolean borrowed) {
        Long numberOfBooks = bookService.countBookByTitle(title);
        System.out.println("Numarul de carti gasite este: " + numberOfBooks);
        if (numberOfBooks == 1) {
            Integer numberOfBooksUpdated = bookService.updateBookByTitle(title, borrowed);
            if (numberOfBooksUpdated > 0) {
                return "Cartea a fost updatata cu succes";
            } else {
                return "Cartea nu a fost updatata cu succes";
            }
        } else if (numberOfBooks > 1){
            return "Te rog sa restrangi aria de cautare";
        } else {
            return "A aparut o eroare";
        }
    }

}
