package com.vebinar.controller;

import com.vebinar.entity.Client;
import com.vebinar.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ClientController {

    @Autowired
    public ClientService clientService;

    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/clients")
    public String getAllUsers(Model model) {
        model.addAttribute("clients", clientService.findAll());
        return "clientList";
    }

    @GetMapping("/client/{id}")
    public String getById(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", clientService.getById(id));
        return "showClient";
    }

    @GetMapping("/client2/{id}")
    public @ResponseBody
    Client getById2(@PathVariable("id") int id, Model model) {
        model.addAttribute("client", clientService.getById(id));
        return clientService.getById(id);
    }

    @GetMapping("/addClient")
    public String createUserPage() {
        return "createClient";
    }


    @PostMapping("/addClient")
    public String addUser(@ModelAttribute("client") Client client) throws Exception {
        clientService.save(client);
        return "redirect:/clients";
    }

    @PostMapping("/updateClient")
    public String updateUser(@ModelAttribute("client") Client client) {
        clientService.update(client);
        return "redirect:/client/" + client.getId();
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
        model.addAttribute("client", clientService.getById(id));
        return "editClient";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        clientService.delete(id);
        return "redirect:/clients";
    }
}
