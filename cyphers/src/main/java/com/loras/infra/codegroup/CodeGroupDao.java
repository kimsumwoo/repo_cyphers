package com.loras.infra.codegroup;


import java.util.List;

import javax.swing.event.ListSelectionListener;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeGroupDao {
	
	public List<CodeGroupDto> selectList();
	
	
	
	
	
	
}
