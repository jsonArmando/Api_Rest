package com.api.activos.rest.controller;

import com.api.activos.rest.model.ActivosModel;
import com.api.activos.rest.services.ActiveService;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActivosController {

    private ObjectMapper objectMapper = new ObjectMapper();

    private static final Logger log = LogManager.getLogger(ActivosController.class);

    public ActivosController() {
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Autowired
    ActiveService activosSerivces;

    @GetMapping("/activos")
    private ResponseEntity<List<ActivosModel>> getAllActivos() {
        return ResponseEntity.ok(activosSerivces.getAllActivos());
    }

    @GetMapping("/activos/{activosId}")
    private ResponseEntity<ActivosModel> getActivos(@PathVariable("activosId") int activosId){
        return ResponseEntity.ok(activosSerivces.getActivosById(activosId));
    }


    @DeleteMapping("/activos/{activosId}")
    private void deleteBook(@PathVariable("activosId") int activosId) {
        activosSerivces.delete(activosId);
    }

    @PostMapping("/activos")
    private ResponseEntity<ActivosModel> saveActivo(@RequestBody ActivosModel activos) {
        log.info("Se valida para guardar los datos Api Activos: " +  activos.toString());
        activosSerivces.saveOrUpdate(activos);
        return new ResponseEntity("Se ha guardado correctamente", HttpStatus.OK);
    }

    @PutMapping("/activos")
    private ActivosModel update(@RequestBody ActivosModel activos) {
        activosSerivces.saveOrUpdate(activos);
        return activos;
    }
}
