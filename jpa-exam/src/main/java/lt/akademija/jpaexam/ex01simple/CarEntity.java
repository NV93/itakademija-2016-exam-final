package lt.akademija.jpaexam.ex01simple;

import java.util.Date; 

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;


@Entity
public class CarEntity {
	
	public CarEntity(Long id, String model, Date manufactureDate) {
		super();
		this.id = id;
		this.model = model;
		this.manufactureDate = manufactureDate;
	}

	public CarEntity() {
		// TODO Auto-generated constructor stub
	}

	@Id
    private Long id;
    private String model;
    private Date manufactureDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
