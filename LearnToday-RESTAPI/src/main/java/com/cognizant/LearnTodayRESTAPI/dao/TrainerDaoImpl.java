package com.cognizant.LearnTodayRESTAPI.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.cognizant.LearnTodayRESTAPI.model.Trainer;

@Repository
public class TrainerDaoImpl implements TrainerDao {

	@Autowired
	JdbcTemplate template;
	
	@Override
	public boolean trainerSignUp(Trainer t) {
		int update = 0;
		update = template.update("INSERT INTO Trainer VALUES (?,?)", t.getTrainerId(),t.getPassword());
		if (update == 0)
			return false;
		return true;
	}

	@Override
	public String updatePassword(int id, Trainer t) {
		Trainer trainer = template.query("SELECT * FROM Trainer WHERE trainerId ="+id, new ResultSetExtractor<Trainer>() {
			@Override
			public Trainer extractData(ResultSet rs) throws SQLException, DataAccessException {
				Trainer trainer = new Trainer();
				while (rs.next()) {
					trainer.setTrainerId(id);
					trainer.setPassword(rs.getString(2));
					return trainer;
				}
				return null;
			}
		});
		if(trainer==null) return "notfound";
		int update = 0;
		update = template.update("UPDATE Trainer SET password=? WHERE trainerId=?",t.getPassword(), id);
		if (update == 0)
			return "error";
		return "updated";
	}

}
