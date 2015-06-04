package com.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import com.domain.TravelNotes;
import com.domain.TravelNotesComments;

public class TravelNotesCommentsDaoImpl implements TravelNotesCommentsDao {
	@Resource
	SessionFactory sessionFactory;
	public String QueryAll(TravelNotes travelNotes) {
		// TODO Auto-generated method stub
		return null;
	}

	public String Add(TravelNotesComments tnc) {
		// TODO Auto-generated method stub
		return null;
	}

	public String Delete(TravelNotesComments tnc) {
		// TODO Auto-generated method stub
		return null;
	}

}
