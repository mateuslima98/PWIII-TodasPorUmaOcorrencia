package todasporumaOcorrencia.com.Todas.Por.uma.Ocorrencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todasporumaOcorrencia.com.Todas.Por.uma.Ocorrencia.dao.OcorrenciaDAO;
import todasporumaOcorrencia.com.Todas.Por.uma.Ocorrencia.model.Ocorrencia;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaController {

	@Autowired
	private OcorrenciaDAO dao;
		
	@PostMapping
	public void insert(@RequestBody Ocorrencia oco) {
		dao.save(oco);
	}
	
	@GetMapping
	public List<Ocorrencia> findAll(){
		return dao.findAll();
	}
	
	@GetMapping(path= {"/{id}"})
	public ResponseEntity<Ocorrencia> findById(@PathVariable Integer id){
		return dao.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Ocorrencia> update(@PathVariable("id") Integer id,
											@RequestBody Ocorrencia oco){
		return dao.findById(id)
				.map(record -> {
		record.setNome(oco.getNome());
		record.setData(oco.getData());
		record.setLocal(oco.getLocal());
		record.setTipo(oco.getTipo());
				
		Ocorrencia updated = dao.save(record);
	}
	
	
	
	
}