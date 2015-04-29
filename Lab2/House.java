
public class House {
	//House: id, ����� ��������, �������, ����, ���������� ������, �����, ��� ������, ���� ������������.
	private String street;
	private String buildingType;
	private String flatNumber;
	private long houseId;
	private String area;
	private long floor;
	private long roomNumber;
	private String lifetime;



	public House(String street, String buildingType, String flatNumber,
			long houseId, String area, long floor, long roomNumber, String lifetime) {
		super();
		this.street = street;
		this.buildingType = buildingType;
		this.flatNumber = flatNumber;
		this.houseId = houseId;
		this.area = area;
		this.floor = floor;
		this.roomNumber = roomNumber;
		this.lifetime = lifetime;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getBuildingType() {
		return buildingType;
	}



	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}



	public String getFlatNumber() {
		return flatNumber;
	}



	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}



	public long getHouseId() {
		return houseId;
	}



	public void setHouseId(long houseId) {
		this.houseId = houseId;
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



	public long getRoomNumber() {
		return roomNumber;
	}



	public void setRoomNumber(long roomNumber) {
		this.roomNumber = roomNumber;
	}



	public String getLifetime() {
		return lifetime;
	}



	public void setLifetime(String lifetime) {
		this.lifetime = lifetime;
	}



	@Override
	public String toString() {
		return "House [street=" + street + ", buildingType=" + buildingType
				+ ", flatNumber=" + flatNumber + ", houseId=" + houseId
				+ ", area=" + area + ", floor=" + floor + ", roomNumber="
				+ roomNumber + ", lifetime=" + lifetime + "]";
	}

}
