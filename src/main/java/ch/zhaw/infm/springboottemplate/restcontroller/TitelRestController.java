package ch.zhaw.infm.springboottemplate.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.infm.springboottemplate.entities.Adresse;
import ch.zhaw.infm.springboottemplate.entities.Titel;
import ch.zhaw.infm.springboottemplate.repositories.TitelRepository;

/**
 * 
 * REST-Controller für die Ressource Titel
 * 
 */
@RestController
public class TitelRestController {
	@Autowired
	private TitelRepository titelRepository;

	@RequestMapping(value = "/markets/stocks", method = RequestMethod.GET)

	public ResponseEntity<List<Titel>> getTitels() {
		// Alle Karten aus dem Repository laden und der cards-Variable zuweisen
		List<Titel> titel = titelRepository.findAllByOrderByName();
		// Wenn die Liste Einträge enthält...
		if (titel != null && !titel.isEmpty()) {
			// ... dann diese als Body zurückgeben
			return new ResponseEntity(titel, HttpStatus.OK);
		} else {
			// ... ansonsten ResourceNotFoundException (404)
			return new ResponseEntity(HttpStatus.NOT_FOUND);

		}

	}

}