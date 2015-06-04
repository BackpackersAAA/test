package com.Service;

import java.util.List;

import com.domain.TravelNotes;

public interface TravelNotesService {
	public List<TravelNotes> Query(); //查询
	public String Add(); //增加
	public String Change(); //改
	public String Delete(); //删
}
