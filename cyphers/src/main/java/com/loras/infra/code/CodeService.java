package com.loras.infra.code;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class CodeService {
	@Autowired
	public CodeDao CodeDao;
	
	public List<CodeDto> codeSelectList(CodeVo vo){
		return CodeDao.codeSelectList(vo);
	}
	public int insert(CodeDto codeDto) {
		return CodeDao.insert(codeDto);
	}
	public CodeDto selectOne(CodeDto codeDto) {
		return CodeDao.selectOne(codeDto);
	}
	public int update(CodeDto codeDto) {
		return CodeDao.update(codeDto);
	}
	public List<CodeDto> selectListCodeGroup(){
		return CodeDao.selectListCodeGroup();
	}
	public List<CodeDto> selectListMfom(){
		return CodeDao.selectListMfom();
	}
	public int uelete(CodeDto codeDto) {
		return CodeDao.uelete(codeDto);
	}
	public int delete(CodeDto codeDto) {
		return CodeDao.delete(codeDto);
	}
	public int selectOneCount(CodeVo vo) {
		return CodeDao.selectOneCount(vo);
	}
	
	@PostConstruct
	public void selectListCachedCodeArrayList() throws Exception {
		List<CodeDto> codeListFromDb = (ArrayList<CodeDto>) CodeDao.selectListCachedCodeArrayList();
//		codeListFromDb = (ArrayList<Code>) dao.selectListCachedCodeArrayList();
		CodeDto.cachedCodeArrayList.clear(); 
		CodeDto.cachedCodeArrayList.addAll(codeListFromDb);
		System.out.println("cachedCodeArrayList: " + CodeDto.cachedCodeArrayList.size() + " chached !");
	}
	
	public static void clear() throws Exception {
		CodeDto.cachedCodeArrayList.clear();
	}
	
	
	public static List<CodeDto> selectListCachedCode(String codegroup_seq) throws Exception {
		List<CodeDto> rt = new ArrayList<CodeDto>();
		for(CodeDto codeRow : CodeDto.cachedCodeArrayList) {
			if (codeRow.getCodegroup_seq().equals(codegroup_seq)) {
				rt.add(codeRow);
			} else {
				// by pass
			}
		}
		return rt;
	}

	
	public static String selectOneCachedCode(int code) throws Exception {
		String rt = "";
		for(CodeDto codeRow : CodeDto.cachedCodeArrayList) {
			if (codeRow.getCdSeq().equals(Integer.toString(code))) {
				rt = codeRow.getCdName();
			} else {
				// by pass
			}
		}
		return rt;
	}

}
