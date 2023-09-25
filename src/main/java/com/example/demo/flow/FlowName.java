package com.example.demo.flow;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.appin.ClientId;
import com.example.demo.appin.Cluster;

@Service
public class FlowName {
	
	@Autowired
	public Cluster clu;
	
	public ClientId create(ClientId cli)
	{
		return clu.save(cli);
	}
	
	public List<ClientId> getAll()
	{
		return clu.findAll();
	}
	
	public Optional<ClientId> getById(String id)
	{
		return clu.findById(id);
	}
	
	public ClientId update(String id,ClientId cli)
	{
		cli.setId(id);
		return clu.save(cli);
	}
	
	public String delete(String id)
	{
		clu.deleteById(id);
		return "Client with id:" + id + "deleted successfully.";
	}

}
