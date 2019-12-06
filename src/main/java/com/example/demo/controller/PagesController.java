package com.example.demo.controller;

import com.example.demo.model.Producto;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class PagesController {
	@Autowired
	ProductoRepository productoRepository;
	@Autowired
	PersonaRepository personaRepository;
	@Autowired
	TelefonoRepository telefonoRepository;
	@Autowired
	PapeleriaRepository papeleriaRepository;
	@Autowired
	ElectronicoRepository electronicoRepository;

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("message", "MENÚ PRINCIPAL");

		return "index";

		
	}
	
	@RequestMapping("/productos")
	public String next (Model model) {
		//model.addAttribute("message", "Productos");
		model.addAttribute("productos", productoRepository.findAll());
		return "next";
	}

	@RequestMapping("/personas")
	public String nextPersona (Model model) {
		//model.addAttribute("message", "Vas muy bien !!!");
		model.addAttribute("personas", personaRepository.findAll());
		return "nextpersona";
	}
	@RequestMapping("/telefonos")
	public String nextTelefono (Model model) {
		//model.addAttribute("message", "Vas muy bien !!!");
		model.addAttribute("telefonos", telefonoRepository.findAll());
		return "nexttelefono";
	}
	@RequestMapping("/papelerias")
	public String nextpapeleria (Model model) {
		//model.addAttribute("message", "Vas muy bien !!!");
		model.addAttribute("papelerias", papeleriaRepository.findAll());
		return "nextpapeleria";
	}
	@RequestMapping("/electronicos")
	public String nextElectronicos (Model model) {
		//model.addAttribute("message", "Vas muy bien !!!");
		model.addAttribute("electronicos", electronicoRepository.findAll());
		return "nextelectronico";
	}

}