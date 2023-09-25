package com.example.demo.process;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.appin.ClientId;
import com.example.demo.flow.FlowName;

@RestController
public class ProcessName {
	
	@Autowired
	public FlowName fln;
	
	@PostMapping("/client")
	public ClientId createStaff(@Validated @RequestBody ClientId cli)
	{
		return fln.create(cli);
	}
	
	@GetMapping("/clients")
	public List<ClientId> getAllStaffs()
	{
		return fln.getAll();
	}
	
	@GetMapping("/client/{id}")
	public Optional<ClientId> getStaffById(@PathVariable String id)
	{
		return fln.getById(id);
	}
	
	@PutMapping("/client/{id}")
	public ClientId updateStaff(@PathVariable String id, @Validated @RequestBody ClientId cli)
	{
		return fln.update(id,cli);
	}
	
	@DeleteMapping("/client/{id}")
	public String deleteClient(@PathVariable String id)
	{
		fln.delete(id);
		return "Client with id:" + id + "deleted successfully.";
	}

}
