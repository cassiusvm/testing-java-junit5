package guru.springframework.fauxspring;

import java.util.HashMap;
import java.util.Map;

import guru.springframework.sfgpetclinic.fauxspring.Model;

public class ModelMapImpl implements Model {
	
	Map<String, Object> map = new HashMap<>();

	@Override
	public void addAttribute(String key, Object o) {
		
		map.put(key, o);
		
	}

	@Override
	public void addAttribute(Object o) {
		
		// TODO Auto-generated method stub
		
	}

	public Map<String, Object> getMap() {
		return map;
	}
	
}
