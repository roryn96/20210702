package command;

import org.springframework.web.multipart.MultipartFile;

public class GoodsCommand {
	String ctgr;
	Long prodNum;
	String prodName;
	Long prodPrice;
	String prodCapacity;
	String prodSupplyer;
	Long prodDelFee;
	String recommend;
	String prodDetail;
	MultipartFile [] prodImage;
	String fileDel1;
	
	public String getFileDel1() {
		return fileDel1;
	}
	public void setFileDel1(String fileDel1) {
		this.fileDel1 = fileDel1;
	}
	public String getCtgr() {
		return ctgr;
	}
	public void setCtgr(String ctgr) {
		this.ctgr = ctgr;
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
	public String getProdCapacity() {
		return prodCapacity;
	}
	public void setProdCapacity(String prodCapacity) {
		this.prodCapacity = prodCapacity;
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
	public String getProdDetail() {
		return prodDetail;
	}
	public void setProdDetail(String prodDetail) {
		this.prodDetail = prodDetail;
	}
	public MultipartFile[] getProdImage() {
		return prodImage;
	}
	public void setProdImage(MultipartFile[] prodImage) {
		this.prodImage = prodImage;
	}	

}
