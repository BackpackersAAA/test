package com.dao;

import com.domain.TravelNotes;
import com.domain.TravelNotesComments;


public interface TravelNotesCommentsDao {
	public String QueryAll(TravelNotes travelNotes); //²éÑ¯
	public String Add(TravelNotesComments tnc); //Ôö¼Ó
	public String Delete(TravelNotesComments tnc); //É¾
}
