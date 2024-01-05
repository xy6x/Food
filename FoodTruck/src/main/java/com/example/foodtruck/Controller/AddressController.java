package com.example.foodtruck.Controller;

import com.example.foodtruck.DTO.AddressDTO;
import com.example.foodtruck.Service.AddressService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Api/v1/address")
public class AddressController {
    private final AddressService addressService;
    @GetMapping("/get")
    public ResponseEntity GetAllAddress(){
        return ResponseEntity.status(HttpStatus.OK).body(addressService.getAll());
    }
    @PostMapping("/add")
    public  ResponseEntity AddAddress(@RequestBody @Valid AddressDTO addressDTO){
        addressService.addAddress(addressDTO);
        return ResponseEntity.status(HttpStatus.OK).body("added Address");
    }
    @PutMapping("/put")
    public ResponseEntity UpdateAddress(@PathVariable Integer id,@RequestBody @Valid AddressDTO addressDTO){
        addressService.updateAddress(id,addressDTO);
        return ResponseEntity.status(HttpStatus.OK).body("update Address");
    }
    @DeleteMapping("/delete")
    public ResponseEntity deleteAddress(@PathVariable Integer id){
        addressService.deleteAddress(id);
        return ResponseEntity.status(HttpStatus.OK).body("delete Address");
    }
}
