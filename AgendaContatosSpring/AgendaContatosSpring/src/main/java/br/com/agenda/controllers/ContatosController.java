package br.com.agenda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.agenda.model.Contato;
import br.com.agenda.repositories.ContatoRepository;

@Controller
@RequestMapping("/contatos")
public class ContatosController {

	@Autowired
	private ContatoRepository repository;

	@GetMapping
	public ModelAndView findAll() {
		ModelAndView modelAndView = new ModelAndView("listacontatos");
		modelAndView.addObject("contatos", repository.findAll());
		modelAndView.addObject(new Contato());
		return modelAndView;

	}

	@PostMapping
	public String add(Contato contato) {
		this.repository.save(contato);
		return "redirect:/contatos";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/remover/{id}")
	public String remover(@PathVariable("id") Long id) {
		repository.deleteById(id);
		return "redirect:/contatos";
	}
}
