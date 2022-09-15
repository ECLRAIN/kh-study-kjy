package oop.inherit5;

public class PPT extends File{
	
	//고유 필드
	private int pageSize;
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		if(pageSize < 0) {
			return;
		}
		this.pageSize = pageSize;
	}
	
	//고유 메소드
	public void information() {
		System.out.println("<파일 정보>");
		System.out.println("이름 : " + this.fileName);
		System.out.println("크기 : " + this.fileSize+" bytes");
		System.out.println("장수 : " + this.pageSize);
	}
	
	//생성자
	public PPT(String fileName, long fileSize) {
		this(fileName, fileSize, 1);
	}
	public PPT(String fileName, long fileSize, int pageSize) {
		super(fileName);
		this.setFileSize(fileSize);
		this.setPageSize(pageSize);
	}
	
}









