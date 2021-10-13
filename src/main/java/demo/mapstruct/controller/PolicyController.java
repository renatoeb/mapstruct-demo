package demo.mapstruct.controller;

import demo.mapstruct.dto.PolicyDto;
import demo.mapstruct.mapper.PolicyMapper;
import demo.mapstruct.model.Policy;
import demo.mapstruct.service.PolicyService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policy")
@AllArgsConstructor
public class PolicyController {

    private final PolicyService service;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody PolicyDto dto) {
        service.save(dto);
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<PolicyDto> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PolicyDto findOne(@PathVariable("id") int id) {
        return service.findOne(id);
    }
}
