package oop.inherit5;

public class File {
	//공용 필드 - 접근제한
		protected String fileName;
		protected long fileSize;
		
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public long getFileSize() {
			return fileSize;
		}
		public void setFileSize(long fileSize) {
			if(fileSize < 0L) {
				return;
			}
			this.fileSize = fileSize;
		}
		
		//생성자 - 필수 항목 : 파일명은 무조건 있어야 한다
		public File(String fileName) {
			this.setFileName(fileName);
		}
		
		//공용 메소드 - 재정의
		public void execute() {
			System.out.println(this.fileName + " 실행!");
		}
	}

