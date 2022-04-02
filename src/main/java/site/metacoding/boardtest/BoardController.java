package site.metacoding.boardtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping({ "/", "/freeboard" })
    public String freeboard() {
        return "board/freeboard";
    }

    @GetMapping("/adoptboard")
    public String adoptboard() {
        return "board/adoptboard";
    }

    @GetMapping("/regionboard")
    public String regionboard() {
        return "board/regionboard";
    }
}