package com.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.domain.TravelNotes;
import com.domain.User;

public class TravelNotesDaoImpl implements TravelNotesDao{
	@Resource
	SessionFactory sessionFactory;
	public List<TravelNotes> QueryAll() {
		Query query=sessionFactory.openSession().createQuery("from TravelNotes ");
		return query.list();
	} 

	public String Add(TravelNotes scenicSpots) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean Change(TravelNotes scenicSpots) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean Delete(TravelNotes scenicSpots) {
		// TODO Auto-generated method stub
		return null;
	}

}
