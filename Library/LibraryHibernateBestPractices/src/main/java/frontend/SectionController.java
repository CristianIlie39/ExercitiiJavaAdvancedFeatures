package frontend;

import business.dto.AuthorDTO;
import business.dto.SectionDTO;
import business.service.AuthorService;
import business.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class SectionController {

    @Autowired
    SectionService sectionService;

    @PostMapping(path = "/insertSection")
    public String insertSection(@RequestBody SectionDTO sectionToInsert) {
        SectionDTO sectionDTO = new SectionDTO();
        sectionDTO.setName(sectionToInsert.getName());
        sectionDTO.setAuthorDTOSet(sectionToInsert.getAuthorDTOSet());
        sectionService.insert(sectionToInsert);
        System.out.println("Numele sectiunii introduse este: " + sectionToInsert.getName());
        return "Numele sectiunii introduse este: " + sectionToInsert.getName();
    }

    @DeleteMapping(path = "/deleteSectionByName")
    public String deleteSectionByName(@RequestParam String name) {
        Integer numberOfSectionDeleted = sectionService.deleteSectionByName(name);
        if (numberOfSectionDeleted > 0) {
            System.out.println("Sectiunea a fost stearsa cu succes");
            return "Sectiunea a fost stearsa cu succes";
        } else {
            System.out.println("Sectiunea nu a fost stearsa");
            return "Sectiunea nu a fost stearsa";
        }
    }

    @GetMapping(path = "/findSectionByName")
    public ResponseEntity<List<SectionDTO>> findSectionByName(@RequestParam String name) {
        List<SectionDTO> sectionDTOList = sectionService.findByName(name);
        System.out.println("Sectiunea a fost gasita si afisata");
        if (sectionDTOList.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(sectionDTOList);
        }
    }

    @PutMapping(path = "/updateSection")
    public String updateSection(@RequestParam String name, @RequestParam Set<AuthorDTO> authorDTOSet) {
        Integer numberOfSectionUpdated = sectionService.updateSection(name, authorDTOSet);
        if (numberOfSectionUpdated > 0) {
            return "Sectiunea a fost updatata cu succes";
        } else {
            return "Sectiunea nu a fost updatata cu succes";
        }
    }

}
