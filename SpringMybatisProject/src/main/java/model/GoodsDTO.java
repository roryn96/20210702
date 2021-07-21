package model;
/// DTO는 DB에 값을 저장하거나, DB로부터 값을 받아오기 위해서 사용 
/// 그래서 DTO의 속성(=멤버필드)은 DB에 있는 테이블과 같아야 한다. 
/// DTO에 있는 속성은 테이블의 컬럼과 같아야 한다. 
public class GoodsDTO {
	Long prodNum;
	String prodName;
	Long prodPrice;
	String prodImage;
	String prodDetail;
	String prodcapacity;
	String prodSupplyer;
	Long prodDelFee;
	String recommend;
	String employeeId;
	String ctgr;
	
	StartEndPageDTO startEndPageDTO;
	
	public StartEndPageDTO getStartEndPageDTO() {
		return startEndPageDTO;
	}
	public void setStartEndPageDTO(StartEndPageDTO startEndPageDTO) {
		this.startEndPageDTO = startEndPageDTO;
	}
	public Long getProdNum() {
		return prodNum;
	}
	public void setProdNum(Long prodNum) {
		this.prodNum = prodNum;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Long getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(Long prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getProdImage() {
		return prodImage;
	}
	public void setProdImage(String prodImage) {
		this.prodImage = prodImage;
	}
	public String getProdDetail() {
		return prodDetail;
	}
	public void setProdDetail(String prodDetail) {
		this.prodDetail = prodDetail;
	}
	public String getProdcapacity() {
		return prodcapacity;
	}
	public void setProdcapacity(String prodcapacity) {
		this.prodcapacity = prodcapacity;
	}
	public String getProdSupplyer() {
		return prodSupplyer;
	}
	public void setProdSupplyer(String prodSupplyer) {
		this.prodSupplyer = prodSupplyer;
	}
	public Long getProdDelFee() {
		return prodDelFee;
	}
	public void setProdDelFee(Long prodDelFee) {
		this.prodDelFee = prodDelFee;
	}
	public String getRecommend() {
		return recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getCtgr() {
		return ctgr;
	}
	public void setCtgr(String ctgr) {
		this.ctgr = ctgr;
	}	
}
