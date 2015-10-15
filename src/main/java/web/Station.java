package web;
import javax.persistence.*;

@Entity @Table(name="stations")
public class Station {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	public String state;
	public String suburb;
	public String address;
	public String postcode;
	public Double latitude;
	public Double longitude;

        public Long getId(){
            return id;
        }
        public String getState(){
            return state;
        }        
	public String getSuburb() {
		return suburb;
	}
        public String getAddress(){
            return address;
        }
        public Double getLatitude(){
            return latitude;
        }
        public Double getLongitude(){
            return longitude;
        }
        
        public void setId(Long tmp){
            id = tmp;
        }
        public void setState(String tmp){
            state = tmp;
        }
        public void setSuburb(String tmp){
            suburb = tmp;
        }
        public void setAddress(String tmp){
            address = tmp;
        }
        public void setLatitude(Double tmp){
            latitude = tmp;
        }
        public void setLongitude(Double tmp){
            longitude = tmp;
        }
}
