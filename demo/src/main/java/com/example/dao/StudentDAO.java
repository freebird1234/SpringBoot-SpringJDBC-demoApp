package com.example.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.dto.FinalBean;


@Repository
public class StudentDAO  {
    
	@Autowired
	JdbcTemplate jdbcTemplate;
	public void saveFinalBean(final FinalBean bean)
	{
		
		String insert_query="INSERT INTO students(first_name ,second_name ,branch) VALUES(?,?,?)";
		
		final List< Map.Entry<String,String> > list= getMapAsEntryList(bean.getClient());
		
		int[] updateCounts = jdbcTemplate.batchUpdate(insert_query,
	            new BatchPreparedStatementSetter() {
	                 
			        @Override
	                public void setValues(PreparedStatement ps, int i) throws SQLException {
	                    Entry<String,String> entry = list.get(i);
	                    ps.setString(1, entry.getKey());
	                    ps.setString(2, entry.getValue());
	                    ps.setString(3, bean.getTarget());
	                }
	                 
	               @Override
	                public int getBatchSize() {
	                    return list.size();
	                }
	            });
		
		
		
		
		
	}
	private List<Map.Entry<String,String>> getMapAsEntryList(Map<String, String> client) {
		List<Map.Entry<String,String>> result=new ArrayList<Entry<String,String>>();
		
		 
		 for(Map.Entry<String,String> entry : client.entrySet())
		 {
			 result.add(entry);
		 }
		
		return result;
	
	}

}
	

