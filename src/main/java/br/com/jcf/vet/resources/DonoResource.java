package br.com.jcf.vet.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jcf.vet.entity.Dono;
import br.com.jcf.vet.manager.DonoManager;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/dono")
public class DonoResource {
	
	@Autowired
	private DonoManager donoManager;

    @RequestMapping(path = "/search", method = RequestMethod.GET)
	public List<Dono> search() {
		return donoManager.getDonos();
	}
	
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Dono getDono(@PathVariable("id") String id) {
		return donoManager.getDono(id);
	}
	
    @RequestMapping(path = "/save", method = RequestMethod.POST)
	public void save(@RequestBody Dono dono) {
		donoManager.save(dono);
	}

    @RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") String id) {
		donoManager.remove(new Dono(id));
	}
	
}
