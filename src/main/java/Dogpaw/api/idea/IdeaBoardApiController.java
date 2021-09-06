package Dogpaw.api.idea;

import Dogpaw.domain.idea.IdeaMapping;
import Dogpaw.domain.idea.IdeaBoard;
import Dogpaw.dto.ResponseDTO;
import Dogpaw.service.exception.exception;
import Dogpaw.service.idea.IdeaService;
import Dogpaw.service.idea.IdeaBoardService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class IdeaBoardApiController {
    @NonNull
    private final IdeaBoardService IdeaBoardService;
    private final IdeaService IdeaService;


    @GetMapping("/ideaBoard")
    public ResponseDTO.IdeaBoardResponse getIdeaBoard(@RequestParam Long id) throws exception.DogpawNotFoundException{
        IdeaBoard IdeaBoard = IdeaBoardService.findOne(id);
        List<IdeaMapping> IdeaList = IdeaService.getIdeaList(id);
        return new ResponseDTO.IdeaBoardResponse(true, IdeaBoard, IdeaList);
    }
}