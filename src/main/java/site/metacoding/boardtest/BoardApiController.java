package site.metacoding.boardtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.boardtest.dto.ResponseDto;

@RestController
public class BoardApiController {

    @GetMapping("/api/freeboard")
    public ResponseDto<?> freeboard() {
        System.out.println("freeboard sysout");
        return new ResponseDto<>(1, "성공", null);
    }

    @GetMapping("/api/adoptboard")
    public ResponseDto<?> adoptboard() {
        System.out.println("adoptboard sysout");
        return new ResponseDto<>(1, "성공", null);
    }

    @GetMapping("/api/regionboard")
    public ResponseDto<?> regionboard() {
        System.out.println("regionboard sysout");
        return new ResponseDto<>(1, "성공", null);
    }

}
