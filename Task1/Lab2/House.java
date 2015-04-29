
public class House {
	//House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица, Тип здания, Срок эксплуатации.
	private String street;
	private String building_type;
	private String flat_number;
	private long house_id;
	private String area;
	private long floor;
	private long room_number;
	private String lifetime;
	
	
	
	public House(String street, String building_type, String flat_number,
			long house_id, String area, long floor, long room_number, String lifetime) {
		super();
		this.street = street;
		this.building_type = building_type;
		this.flat_number = flat_number;
		this.house_id = house_id;
		this.area = area;
		this.floor = floor;
		this.room_number = room_number;
		this.lifetime = lifetime;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getBuilding_type() {
		return building_type;
	}



	public void setBuilding_type(String building_type) {
		this.building_type = building_type;
	}



	public String getFlat_number() {
		return flat_number;
	}



	public void setFlat_number(String flat_number) {
		this.flat_number = flat_number;
	}



	public long getHouse_id() {
		return house_id;
	}



	public void setHouse_id(long house_id) {
		this.house_id = house_id;
	}



	public String getArea() {
		return area;
	}



	public void setArea(String area) {
		this.area = area;
	}



	public long getFloor() {
		return floor;
	}



	public void setFloor(long floor) {
		this.floor = floor;
	}



	public long getRoom_number() {
		return room_number;
	}



	public void setRoom_number(long room_number) {
		this.room_number = room_number;
	}



	public String getLifetime() {
		return lifetime;
	}



	public void setLifetime(String lifetime) {
		this.lifetime = lifetime;
	}



	@Override
	public String toString() {
		return "House [street=" + street + ", building_type=" + building_type
				+ ", flat_number=" + flat_number + ", house_id=" + house_id
				+ ", area=" + area + ", floor=" + floor + ", room_number="
				+ room_number + ", lifetime=" + lifetime + "]";
	}

}
